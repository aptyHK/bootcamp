public class DemoRecursion {
  public static void main(String[] args) {
    //
    // System.out.println(sumNoRecursion(5)); // 15
    // System.out.println(sumRecursion(5));
    // System.out.println(sum2(6));
    // System.out.println(factorials(5));
    DemoRecursion.print(3);
  }

  // Question 1:
  // k + (k - 1) + (k - 2) .... 0

  // Method 1: normal
  public static int sumNoRecursion(int k) {
    int sum = 0;
    for (int i = k; i > 0; i--) {
      sum += i;
    }
    return sum;
  }

  // Method 2: recursion
  public static int sumRecursion(int k) {
    if (k < 1)
      return k;
    return k + sumRecursion(k - 1);
    // 5 + sumRecursion(5 - 1), return
    // 4 + sumRecursion(4 - 1), return
    // 3 + sumRecursion(3 - 1), return
    // 2 + sumRecursion(2 - 1), return
    // 1 + sumRecursion(1 - 1), return
    // 0 < 1, return 0
  }

  // Question 2:
  // 0, 1, 1, 2, 3, 5, 8, 13 ... kth elements
  // k = 7, return 8
  public static int sum2(int k) {
    if (k <= 1)
      return k;

    return sum2(k - 1) + sum2(k - 2);
  }

  public static int factorials(int k) {
    // k = 5
    // 5 x 4 x 3 x 2 x 1
    // return 120
    if (k < 2)
      return k;
    return k * factorials(k - 1);
    // 5 * factorials(5 - 1)
    // v
    // ..4 * factorials(4 - 1)
    // v
    // ..3 * factorials(3 - 1)
    // v
    // ..2 * factorials(2 - 1)
    // v
    // ..1 * 1
  }

  // Question 3:
  // non-tail recursion
  // 3 2 1 1 2 3, k = 3
  public static void print(int k) {
    if (k < 1)
      return;
    System.out.print(k + " "); // 3 
    print(k-1);
    System.out.print(k + " "); // 2
  }

}
