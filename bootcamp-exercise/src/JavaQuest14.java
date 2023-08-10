public class JavaQuest14 {
  // Given an integer x, return true if x is a palindrome (迴文), and false otherwise.
  // Palindrome: it is same text, no matter you read it from left to right, or from right to left

  // Case 1: 13431
  // true

  // Case 2: -123
  // false

  // Case 3: 1
  // true

  // Case 4: 22
  // true

  // Case 5: 1231
  // false

  // Do not change anything in main method
  public static void main(String[] args) {
    boolean res = palindrome(13431); // true length 5: 0 1 | 3 4
    boolean res2 = palindrome(-121); // false
    boolean res3 = palindrome(1); // true
    boolean res4 = palindrome(22); // true
    boolean res5 = palindrome(1231); // false 4 0 1 | 2 3

  }

  // Code a method here to return true if the integer is palindrome, otherwise false
  public static boolean palindrome(int x) {

    if (x < 0) { // negative is not a palindrome number
      return false;
    }

    int idx = 0;
    char[] chars = String.valueOf(x).toCharArray(); // covert the interger to a string first then convert the string to char array

    for (int i = chars.length - 1; i >= chars.length / 2; --i) { // assume length is 5, i only need 3 rounds to confirm, 5 / 2 = 2, i would run as 4 3 2
      if (chars[i] == chars[idx]) { // chars[4]<->chars[0], chars[3]<->chars[1], chars[2]<->chars[2] 
        idx++;
      } else { // if find difference
        return false;
      }
    }
    return true; // all reversed still same as original
  }
}
