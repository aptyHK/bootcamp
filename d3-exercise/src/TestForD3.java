public class TestForD3 {

  public static void main(String[] args) {

    // Output: a > 9
    int a = 10;
    int b = 3 * a % 3;
    System.out.println(b);
    if (a == 9) {
      System.out.println("a is equals to 9");
    } else if (a < 9 && a >= 0) {
      System.out.println("a is between 0 and 8");
    } else if (a > 9) {
      System.out.println("a > 9");
    } else {
      System.out.println("a < 0");
    }

    // Output: str length < 27
    String str = "I love Java. I love coding";
    if (!(str.length() != 27)) { // code here. Fix the bug. // Or if (str.length() == 27)
      System.out.println("str length=27");
    } else if (str.length() < 27) { // add the condition
      System.out.println("str length < 27");
    } else if (str.length() > 27) { // complete the code
      System.out.println("str length > 27");
    }

    // Question : Determine whether year n is a leap year.
    /*
     * Definiton of a leap year: If a year is divisible by 4 and not divisible by 100 or divisible by 400, then, it is a leap year.
     */

    int year1 = 2009;
    boolean abc = true;
    System.out.println(year1 % 4);
    System.out.println(year1 % 100);
    System.out.println(year1 % 400);
  

  for (int year5 = 1900; year5 <= 2400; year5++) {
    if (year5 % 4 == 0 && year5 % 100 != 0 || year5 % 100 == 0 && year5 % 400 == 0) {
      System.out.print(year5 + " ");
    }
  }
  }
}
