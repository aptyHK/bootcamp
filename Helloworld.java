// Day 1 (11th July) learning java

import java.util.Arrays;

public class Helloworld {
  public static void main(String[] args) {

    String str = "abvcdfsd";
    System.out.println((char) (str.charAt(2)));

<<<<<<< HEAD
    StringBuilder sb = new StringBuilder("abc");
    sb.append(str.substring(str.length()-3));
    System.out.println(sb.toString());
=======
    StringBuilder sb = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    String s = sb.append("abc").toString();
    String s2 = sb2.append("abc").toString();
    System.out.println(s.equals(s2));

    String[] strs = {"alice and bob love leetcode","i think so too","this is great thanks very much"};
    System.out.println(strs[0]);
>>>>>>> 45987e70332aab0fb6b721369c7663175bddc5ad

    // //System.out.println(a*b);
    // System.out.println("I am Andy"); // end with semi-colon
    // System.out.println("Hello!"); //end with semi-colon
    // System.out.println("testing different types of character @%&#^* 123 asda | 李"); // can print different types of character
    // }
  }
}

