public class String2 {
  public static void main(String[] abc) {
    // method signature = method name + parameter type and quantity

    // trim(), remove leading space and trail space
    String str = "hello   ";
    String str2 = "   hel   lo   ";
    System.out.println(str);
    System.out.println(str2);
    System.out.println(str.trim()); // "hello"
    System.out.println(str2.trim()); // "hel   lo"

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

    // !important 
    // indexOf(char) p.s. as char also consider as int
    System.out.println("The index of o in str=" + str.indexOf('o')); // 4 
    // indexOf(String)
    System.out.println("The index of o in str=" + str.indexOf("ll")); // 2
    System.out.println("The index of o in str=" + str.indexOf("ll")); // -1
    // indexOf(int, int index)
    System.out.println(str.indexOf('o', 5)); // -1, as you won't able to find o start from index 5, which identify as abnormal with return -1
    System.out.println(str.indexOf("ll", 1)); // 2, find ll at index 2 start checking from index 1
    
    // lastIndexOf(int)
    System.out.println(str.lastIndexOf('l')); // 3, for hello, l happen at index 2 and 3, last appear at 3 so method return 3

  }
}
