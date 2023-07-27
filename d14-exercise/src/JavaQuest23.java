/*
 * Question : given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.
 * 
 * Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.
 * 
 * Return true if a and b are alike. Otherwise, return false.
 */

// hints : substring() , toCharArray() ?
public class JavaQuest23 {
  public static void main(String[] args) {
    System.out.println(sameNumberOfVowels("book")); // true
    System.out.println(sameNumberOfVowels("textbook")); // false
  }

  public static boolean sameNumberOfVowels(String s) {
    // code here
    int half = s.length()/2;
    int j = s.length()-1;

    // String left = s.toLowerCase().substring(0, half);
    // String right = s.toLowerCase().substring(half);
    s = s.toLowerCase();

    int leftCount = 0;
    int rightCount = 0;

    
    for (int i = 0; i < half; i++) {
      if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
        leftCount++;
      }
      if (s.charAt(j-i) == 'a' || s.charAt(j-i) == 'e' || s.charAt(j-i) == 'i' || s.charAt(j-i) == 'o' || s.charAt(j-i) == 'u') {
        rightCount++;
      }
    }

    if (leftCount == rightCount) {
      return true;
    }
    return false;
  }
}
