// Day 1 (11th July) learning java

import java.util.Arrays;

public class Helloworld {
  public static void main(String[] args) {

    String str = "abvcdfsd";
    System.out.println((char) (str.charAt(2)));

    StringBuilder sb = new StringBuilder("abc");
    sb.append(str.substring(str.length()-3));
    System.out.println(sb.toString());

    // //System.out.println(a*b);
    // System.out.println("I am Andy"); // end with semi-colon
    // System.out.println("Hello!"); //end with semi-colon
    // System.out.println("testing different types of character @%&#^* 123 asda | 李"); // can print different types of character
    // }
  }
}

