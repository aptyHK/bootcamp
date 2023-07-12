public class LogicalOperator {
  public static void main(String[] args) {
    boolean isExpensive = true;
    boolean isWorthToBuy = false;
    // && operator (mean AND)
    // true, true -> true
    // true, false -> false
    // false, true -> false
    // false, false -> false
    boolean result1 = isExpensive && isWorthToBuy; // false, isExpensive AND isWorthToBuy have to be true is want result return true

    // || Operator (mean OR)
    // true, true -> true
    // true, false -> true
    // false, true -> true
    // false, false -> false
    boolean result2 = isExpensive || isWorthToBuy; // true, either one of the isExpensive or isWorthToBuy is true can return true

    int a = 5;
    int b = 10;
    int c = 13;
    boolean result3 = a > 6 && b < 9; // false, is not all condition true
    // Logical Operator
    // ! && run first than ||
    boolean result4 = c < 15 || a > 6 && b < 12; // true, condtion a > 6 && b < 12 is true, so even c < 15 is false, but still return true to result4
    boolean result5 = c < 15 || (a > 6 && b < 12); // true, placing the () on this line has the same effect but just looks more neat
    boolean result6 = a < 6 || b < 9 || c < 9; // true, all OR Operator and b c meet the condition

    // ==, >=, <=, !=
    // ==, mean asking if a equals b? -> true/ false
    // =, is assignment, different meaning with ==
    boolean result7 = a == b; // false, a is 5 and b is 10, they are not equal
    boolean result8 = a >= 5; // true, a is greater OR equal to 5;
    boolean result9 = c <= 13; // true, a is smaller OR equal to 13;
    // ! -> NOT, so != mean asking is it NOT equal
    boolean result10 = c != 13; // false, c is equal to 13;
    boolean result11 = !(c < 13); // true, asking if the event inside the () is false, it would return true because the event inside the () (which asking is c smaller than 13) is false, so !(c < 13) condition fulfilled
    boolean result12 = !(a != 9) && c == 13; // false, NOT(true) -> false && true
    System.out.println(result12);

    // Operator Precedence
    int result13 = (1 + 9) * 3; // 30
    int result14 = ++result13 + 1; // 32? (not understand yet)
    int i = 27;
    int result15 = i++ + 1; // result15 = 28, i = 28 (not understand yet)

    boolean result16 = 25 + 2 < result15 + 1; // true, 27 < 28
    System.out.println(result16);

    //
    int x = 5;
    int y = 10;
    // int z = x += 3 * y; // z=? do from right first, 3 * 10 = 30 > 5 += 30 -> z = 35
    // System.out.println(z);

    int result17 = (x++ + 2) * x++; // result17=?
    // 2 events
    // 1. (x++ + 2) > would result 5 + 2 = 7, 
    // 2. after event 1, x turned to 6, would operate as 7 * 6 
    // so result17 would be 7 * 6 = 42, and x would be 7 after this line as there is a x++ in the end
    System.out.println(result17); // 42
    System.out.println(x); // 7
  }
}
