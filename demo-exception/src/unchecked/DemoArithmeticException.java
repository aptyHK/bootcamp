package unchecked;

import java.util.Arrays;
import java.util.Stack;

public class DemoArithmeticException {
  public static void main(String[] args) {
    // prevent know error
    int i = 0;
    int n = 100;
    // int result = n / i; // will have run time error, java.lang.ArithmeticException
    int result = 0;

    try {
      result = n / i;
    } catch (ArithmeticException e) { // must catch the exact exception
      result = 0;
    }
    System.out.println("result=" + result);


    String s = "as asd asdas";
    System.out.println(s.substring(0, s.indexOf(" ")));
    // char[] chars = "take".toCharArray();
    // Stack<String> stackStr = new Stack<>();
    // for (char c : chars) {
    //   //stackStr.
    // }

    // System.out.println(Arrays.toString(str.split(" ")));;
  }
}


