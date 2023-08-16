package math;

public class MathDemo {

  public static int calculate(int i, int j, MathOperation formula) {
    return formula.operate(i, j);
  }
  public static void main(String[] args) {
    MathOperation addition = (a, b) -> a + b; // parameter name can be different than the name in the interface
    MathOperation subtract = (x, y) -> x - y;
    MathOperation multiply = (x, y) -> x * y;
    MathOperation divide = (x, y) -> x / y;

    System.out.println(calculate(1, 3, addition));
    System.out.println(calculate(10, 2, divide));

    System.out.println(calculate(4, 7, multiply));
    System.out.println(calculate(4, 7, (x, y) -> x * y));
  }
}
