/*
 * 
 * Question : Given an integer n, return true if n has exactly three positive divisors. Otherwise, return false.
 * 
 * An integer m is a divisor of n if there exists an integer k such that n = k * m.
 * 
 */
public class JavaQuest21 {
  public static void main(String[] args) {
    System.out.println(isThreeDivisors(1)); // false
    System.out.println(isThreeDivisors(3)); // false
    System.out.println(isThreeDivisors(4)); // true, 4/1, 4/2, 4/4
    System.out.println(isThreeDivisors(12));// false 1 2 4 6 12
    System.out.println(isThreeDivisors(9999));// false ...

    String[] words = {"a","b","c","ab","bc","abc","acb"};
    String s = "abc";
    System.out.println(s.substring(0, words[0].length()));
    System.out.println(words[0]);
    System.out.println(s.substring(0, words[0].length()).equals(words[0]));
    //s.substring(0, words[i].length()).equals(words[i]);

  }

  public static boolean isThreeDivisors(int n) {
    // finish the code
    int countTD = 1; 

    if (n == 1) {
      return false;
    }

    for (int i = 1; i < n / 2 + 2; i++) {
      if (n % i == 0) {
        countTD++;     
      }      
      if (countTD == 4) {
        return false;
      } 
    }
    if (countTD == 3) {
      return true;
    }
    return false;
  }
}
