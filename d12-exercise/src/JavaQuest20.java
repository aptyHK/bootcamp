/*
 * Question : Given two strings s and goal, 
 * return true if and only if s can become goal after N shifts on s.

Definition of a shift:
Moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.

Assume the input need to be lowercase English letters.
*/
public class JavaQuest20 {

  public static void main(String[] args) {
    System.out.println(rotateString("abcde", "cdeab"));// true
    System.out.println(rotateString("abcde", "abced"));// false
    System.out.println(rotateString("abcde", "eabcd"));// true
    System.out.println(rotateString("abcde", "abcde"));// true
  }

  public static boolean rotateString(String s, String goal) {
    char[] chars = s.toCharArray();
    //System.out.println(chars);
    char temp;

    for (int i = 0; i < s.length(); i++) {
      temp = chars[0];
      //System.out.println(temp);
      for (int j = 1; j < s.length(); j++) {      
        chars[j-1] = chars[j];
      }
      chars[s.length() - 1] = temp;
      //System.out.println(String.valueOf(chars));
      if (String.valueOf(chars).equals(goal)) {
        return true;
      }
    }
    return false;
  } 
  // ********** can try substring()
      //   String shifted = s.substring(i).concat(s.substring(0, i));
      // if (shifted.equals(goal)) {
      //   return true;
}

    // 0 1 2 3 4
    // a b c d e

    // example 1:
    // true
    // 2 3 4 0 1
    // c d e a b
    // -> 2 shifts

    // max loop round = 4 
    // 1 2 3 4 0 -> 1
    // 2 3 4 0 1 -> 2
    // 3 4 0 1 2 -> 3
    // 4 0 1 2 3 -> 4