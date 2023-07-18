// some thought about method:
// other than the normal feature / benefit of method
// declare good method name also give you a chance to present your code / block of code with simply and clear meaning

// About public static void main(String[] args)
// ignore | ignore |return type | desire method name | value insert to method
// public | static | void | method | ()

// public static void main, so now can understand main method has no return type
// You can still create other method with naming it main, but the setting cannot be exact the same

// (String[] args) <- The input parameter
// String[] is must follow because it relate to data type
// args is just the parameter name in this main method, it can be any name

public class Methods {

  public static void main(String[] args) { // method name: main
    String str = "hello";
    str = str + "world"; // append operation

    // Approach 1 - print
    System.out.println("Hello in main method");
    // Approach 2 - print
    print(); // Print "Hello in print() method."

    // Approach 1 - sum
    int x = 10;
    int y = 100;
    int sum = x + y; // 110

    // Approach 2 - sum
    System.out.println(sum(20, 200)); // 220
    int z = sum(1000, -30);
    System.out.println(z); // 970

    if (sum(1000, -30) == 970) {
      System.out.println("The sum() method is working!");
    }

    // test substract
    System.out.println(subtract3ele(300, x, y));

    //
    method2("github");
    method2("Hello");
    method2("");

    // test method without input value
    System.out.println(pi()); // 3.14159
    double circleArea = 5 * 5 * pi(); // can also use it on expression
    System.out.println(circleArea); // calculated area of the circle

  }

  public static void print() { // method name: print, without input parameter
    System.out.println("Hello in print() method.");
  }

  public static int sum(int a, int b) {
    // left int = return type
    // the int inside the bracket are parameters
    // System.out.println("Hello in sum() method."); // this is not something will return back, just a simple print operation
    int c = a + b;
    return c;
  }

  public static int subtract3ele(int baseNum, int a, int b) {
    return baseNum - a - b; // no need to create a variable to carry the value that you want to return, you can put something to execute and return the result
  }

  public static void method2(String str) { // suppose void type has nothing to return
    if (str == null || "".equals(str)) { 
      // usually String would use .equal to check, but use == only when you want to check is it null
      // null is not empty, empty -> ""
      return; // leave without action
    }

    System.out.println(str);
  }

  public static double pi() { // without input parameter + return something
    return 3.14159;
  }
}
