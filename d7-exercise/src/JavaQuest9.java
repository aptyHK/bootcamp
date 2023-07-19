/**
 * Expected Output: 
 * J 
 * e 
 * 3 
 * 9 
 * 10 
 * ab 
 * c 
 * VenturenixLAB, Coding 19 ren VENTURENIXLAB, JAVA venturenixlab, java V*NTUR*NIXLAB, JAVA!!!
 */
public class JavaQuest9 {
  public static void main(String[] args) {
    String str = "VenturenixLAB, Java";

    // prints J
    // prints e (the 1st e)
    // code here ...
    char[] target = new char[] {'J', 'e'}; // because the order is print J first then e, so I need to set an array to control the order to find
    int targetIndex = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == target[targetIndex]) {  // once I find a char same as the target
        System.out.println(str.charAt(i)); // print the target
        targetIndex += 1; // move to the next target
        if (targetIndex == target.length) { // once I located all the target for once
          break; // I quit the loop
        }
        i = 0; // go back to the beginning of the loop and find is the new target exist
      }
    }


    // Use indexOf()
    // prints 3
    // prints 9
    // prints 10
    // code here ...
    System.out.println(str.indexOf('t'));
    System.out.println(str.indexOf('x'));
    System.out.println(str.indexOf('L'));


    // Use String trim()
    String abc = "    ab c    ";
    // prints "ab c"
    System.out.println(abc.trim());

    // Use String replace() method
    // prints VenturenixLAB, Coding
    // code here ...
    System.out.println(str.replace("Java", "Coding"));

    // int length()
    // prints 19
    // code here ...
    System.out.println(str.length());

    // Use String substring(int start, int end)
    // prints "ren"
    // code here ...
    System.out.println(str.substring(5, 8));

    // print "VENTURENIXLAB, JAVA"
    // prints "venturenixlab, java"
    // code here ...
    System.out.println(str.toUpperCase());
    System.out.println(str.toLowerCase());

    // Method Chaining (one line to complete)
    // prints "V*NTUR*NIXLAB, JAVA!!!"
    // code here ...
    System.out.println(str.concat("!!!").toUpperCase().replaceAll("E", "*"));

  }
}
