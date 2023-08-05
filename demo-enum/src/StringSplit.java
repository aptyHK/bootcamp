public class StringSplit {
  public static void main(String[] args) {
    String s = "abc def xyz";

    for (String str : s.split(" ")) {
      System.out.println(str);
    }

     //s = "abc      def  xyx  pld  ";
    for (String str : s.split("\\s")) { // \s means space
      System.out.println(str);
    }

    String s2 = "abc      def  xyx  pld  ";
    for (String str : s.trim().split("\\s+")) { // \s means space, + mean 1 or more
      System.out.println(str);
    }
  }
}
