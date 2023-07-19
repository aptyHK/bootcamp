public class String1 {

  public static void main(String[] args) {

    // Alredy learned String method: .charAt(), .equals(), length()

    // Let's learn somemore

    // isEmpty() -> if the length is not 0, is false
    String str = "Hello";
    System.out.println(str.isEmpty()); // false
    String str2 = ""; // empty String
    System.out.println(str2.isEmpty()); // true
    String str3 = " "; // String with a space, space is a character
    System.out.println(str3.isEmpty()); // false

    // isBlank() -> when the String only contain space or empty
    System.out.println(str.isBlank()); // false
    System.out.println(str2.isBlank()); // true
    System.out.println(str3.isBlank()); // true, just filled with space still mean it is blank (like when there is an application form, human won't just put space)

    // toLowerCase(), toUpperCase()
    System.out.println(str.toUpperCase()); // HELLO
    System.out.println(str); // still is hello, because is just using to tools to show you the result, but did not assign the value after uppercase to the String
    System.out.println(str.toUpperCase().toLowerCase()); // You can even apply multiple method (lower -> turn to upper case by method -> turn to lower case by method) Output: hello
    if (str.toUpperCase().equals("HELLO")) {
      System.out.println("Yes, it is HELLO");
    }

    // **************
    // substring() -> substring(x) or substring(x, y)
    // x - start index: just like normal index
    // y - end index: represents the position of (last index - 1); Or may be end with which length of the String
    System.out.println(str.substring(1)); // ello
    System.out.println(str.substring(1, 3)); // el
    System.out.println(str.substring(0, str.length() - 1)); // Hell
    // (x, y) x is the start index, y is the end index, retrieved String between start index and end index - 1
    if (str.substring(3).equals("lo")) {
      System.out.println("Yes, str.substring(3) = lo");
    }

    // contains()
    String s = "lo";
    System.out.println(str.contains(s)); // true (hello contains lo)
    System.out.println(str.contains("ol")); // false (ol is not in any form of the substring to str)
    if (str.contains("lo")) {
      System.out.println("str contains lo");
    }

    str.toUpperCase(); // change nothing to the variable str
    str = str.toUpperCase(); // remember only re-assign the value to the variable would do actual change change 
    System.out.println(str); // HELLO
    str += str.toLowerCase(); // append
    System.out.println(str); // HELLOhello

    // String str9 = "abcde";
    // char target1 = 'c';
    // if (str9.charAt(2).equals(target1)) {

    // }

  }
}
