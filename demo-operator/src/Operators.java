public class Operators {

  public static void main(String[] args) {
    int a = 1;
    a = a + 1; // 2
    a = a - 2; // 0

    int b = 10;
    b = b / 5; // 2
    b = b * 3 + 5; // 11

    System.out.println("a append b is: " + a + b); // a append b is: 011, because string placed first so converted other thing on the + operator to String

    int x = 1;
    x = x + 1; // 2
    x++; // 3, mean x = x + 1
    ++x; // 4, mean x = x + 1
    x += 1; // 5, mean x = x + 1
    System.out.println("x is: " + x); // 4

    int y = 10;
    y = y - 1; // 9
    y--; // 8
    --y; // 7
    y -= 1; // 6
    System.out.println("y is: " + y);

    // other + - * /
    int z = 4;
    z = z + 2;
    z += 2;

    int i = 6;
    i = i - 3;
    i -= 3;

    int w = 9;
    w = w * 3;
    w *= 3;

    int u = 81;
    u = u / 9;
    u /= 3;

    // %
    int integer = 12 % 5; // 2
    int integer2 = 12;
    integer2 %= 5; // 2
    System.out.println(integer + " " + integer2);

    a = 1000;

    // ++, --
    int m = 3;
    m++; // 4
    int preIncrement = ++m; // ++ first? or assignment first?
    System.out.println("preIncrement is: " + preIncrement); // 5, which is ++ first
    int postIncrement = m++;
    System.out.println("postIncrement is: " + postIncrement); // 5, m assigned to postIncrement before the ++ operation
    System.out.println("m is: " + m); // 6, m did performed ++

    int n = 10;
    n--; // 9
    int preDecrement = --n;
    System.out.println("preDecrement is: " + preDecrement); // Should be 8;
    int postDecrement = n--;
    System.out.println("postDecrement is: " + postDecrement); // Should be 8;
    System.out.println("n is: " + n); // Should be 7;

    // String +=
    String str = "hello";
    str += " world"; // hello world
    System.out.println("str is: " + str);
  }

}
