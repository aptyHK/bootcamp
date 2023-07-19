public class String2 {
  public static void main(String[] abc) {
    // method signature = method name + parameter type and quantity

    // trim(), remove leading space and trail space
    String str = "hello   ";
    String str2 = "   hel   lo   ";
    System.out.println(str);
    System.out.println(str2);
    System.out.println(str.trim()); // "hello"
    System.out.println(str2.trim()); // "hel lo"

    // startWith(), check if the string start with target string
    if (str.startsWith("hel")) {
      System.out.println("yes, it is start with: hel");
    }
    if (!(str2.startsWith("hel"))) {
      System.out.println("No, it is not start with: hel");
      if (str2.trim().startsWith("hel")) {
        System.out.println("yes, it become start with hel after trim");
      }

      // endwith(), cehck if the string ends with the target string
      boolean endWithSpace = str.endsWith(" ");
      if (endWithSpace) {
        System.out.println("The string ends with space");
      }
    }

    // ***
    // indexOf(char) p.s. as char also consider as int
    System.out.println("The index of o in str=" + str.indexOf('o')); // 4
    // indexOf(String)
    System.out.println("The index of o in str=" + str.indexOf("ll")); // 2
    System.out.println("The index of o in str=" + str.indexOf("ll")); // -1
    // indexOf(int, int index)
    System.out.println(str.indexOf('o', 5)); // -1, as you won't able to find o start from index 5, which identify as abnormal with return -1
    System.out.println(str.indexOf("ll", 1)); // 2, find ll at index 2 start checking from index 1

    String str3 = "hello";
    // lastIndexOf(int) > is more like the checking is start from the end of the String, from string.length -> 0
    System.out.println(str3.lastIndexOf('l')); // 3, for hello, l happen at index 2 and 3, last appear at 3 so method return 3
    // lastIndexOf(String)
    System.out.println(str3.lastIndexOf("ll")); // 2, should be same as indexOf because only have one set of ll in hello
    // lastIndexOf(int, int index)
    System.out.println(str3.lastIndexOf('l', 10)); // count start from backward ?? but even the index is out of boundary, can still do the checking

    String s = "Java is a programming language Java";
    // replace(Char sequence, Char sequence) -> char sequence can also understand as String
    System.out.println(s.replace("Java", "Python")); // lookup all "Java" and replaced them with "Python"
    // replace(old char, new char)
    System.out.println(s.replace('a', 'A')); // looked up all 'a' and replaced them with 'A'

    // equals(), equalsIgnoreCase()
    // equals() is case sensitive
    if ("hello".equals(str3)) {
      System.out.println("str3 = hello");
    } // would print
    if ("Hello".equals(str3)) {
      System.out.println("str3 = Hello");
    } // would not print
    // equalsIgnoreCase()
    if ("Hello".equalsIgnoreCase(str3)) { // the speed would be faster than the below one
      System.out.println("it is a non case sensitive checking for Hello");
    } // would print, even have the different of h and H but ignored to check uppercase or lowercase
    //
    if ("HeLlO".toLowerCase().equals(str3)) {
      System.out.println("Combined equals and to lowercase method");
    }
    // **beware some method would have a lot of function, which you may not need some of its feature, so you have to choose suitable one to use or even write it by yourself

    // concat(String) -> append something
    // *** concat is faster than +
    String newString = str3.concat(" Java!"); // + operation and assign the value to newString (p.s. if not assign, won't change anything)
    System.out.println("newString=" + newString);
    str3 = str3.concat("Java"); // involve + and = operation
    // str3.concat("Java") // involve + operation
    System.out.println("str3=" + str3); // because str3 did not changed before, so is just "hello" concat "java" on the last line
    newString = newString.concat("Java");
    System.out.println("newString=" + newString); // hello Java!Java

    // compareTo
    String apple = "apple";
    String facebook = "facebook";
    System.out.println(apple.compareTo(facebook)); // -5, 97 - 102 ('a' - 'f'), compare the length difference between the first letter of the String before .compareTo and the first letter of the variable inside ()
    System.out.println(facebook.compareTo(apple)); // 5 , 102 - 97 ('f' - 'a')


  }
}
