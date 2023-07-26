// Day 1 (11th July) learning java

import java.util.Arrays;

public class Helloworld {
  public static void main(String[] args) {

System.out.println(Math.sqrt(2069870691));
System.out.println(Math.pow(2, 31) -1);

    int[] nums = new int[] {1,2,3,2};
    
    int num = 123456789;
    String str = Integer.toString(num);
    System.out.println(str.length());
    System.out.println(str.substring(0, str.length() / 2));
    System.out.println(str.substring(str.length() / 2));
    System.out.println(Integer.valueOf(str.substring(0, str.length() / 2)));

    int[] hashTable = new int[9];
    System.out.println(Arrays.toString(hashTable));
    StringBuilder str2 = new StringBuilder("");
    System.out.println(str2.append(1));

    // //System.out.println(a*b);
    // System.out.println("I am Andy"); // end with semi-colon
    // System.out.println("Hello!"); //end with semi-colon
    // System.out.println("testing different types of character @%&#^* 123 asda | 李"); // can print different types of character
    // }
  }
}

