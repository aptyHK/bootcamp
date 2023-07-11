public class String1 {

  public static void main(String[] args) {
    String str = "Nice to meet you"; 
    str = str + "~ ";
    System.out.println(str); // Nice to meet you~ 
    
    // Method
    // length()
    int i = str.length(); // (String).length, is a tool to return the length of String
    System.out.println("The length of the String str is: " + i);
    System.out.println("123456789".length()); // it don't have to be a variable to apply the String method
    System.out.println("55555" + "abcdefg".length()); // output: 555557, string "555555" + converted 7?

    // equals()
    String str1 = "abc";
    String str2 = "abcd";
    String str3 = "abc";
    boolean areTheyEqual = str1.equals(str2); // false
    boolean areTheyEqual2 = str1.equals(str3); // true
    System.out.println(areTheyEqual + " " + areTheyEqual2);
    boolean b4 = str2.equals(str1 + "d");
    System.out.println(b4); // true

    // charAt(int index) e.g. charAt(2), find the char at index 2 of the String
    String str4 ="helloworld";
    // index is start from 0 instead of 1
    // index 0 of str4 -> 'h'
    // index 1 of str4 -> 'e'
    // index 2 of str4 -> 'l'
    // index 3 of str4 -> 'l'
    System.out.println(str4.charAt(2)); // Output: l
    // System.out.println(str4.charAt(20)); // the complier won't tell you is wrong (won't state red line under this line), because the complier won't help you count the length of the String (20 is out of the range), it will run error when you start to run, which it will so call bug


  }
  
}
