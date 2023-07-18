public class Primitives {
  public static void main(String[] args) {
    // Correct Syntax
    // Upcasting (Implicit conversion / promotion) !Please remember and understand more about key word implicit
    // byte -> short -> int -> long
    // think about the value, value can put on byte, can put on short, can put on int, can put on long
    // char -> int
    byte b = 2; // !! byte would be test on the quiz
    short s = b; // byte -> short, upcasting (promotion)
    int i = s;
    long l = s;
    float f = s;
    double d = f;
    char c = 'A';
    int j = c;

    // Downcasting
    double d2 = 10.3d;
    // float f2 = d2; // cannot convert? reason? -> Because double precision is larger than float
    // ! In java, if there is any chance the will lost precision, java would not allow, even 10.3 is not very precise
    float f2 = (float) d2; // developer take responsibility for the risky of downcasting

    short s2 = 128;
    // byte b2 = s2; // error, byte size is -128 to 127
    byte b2 = (byte) s2; // force downcasting
    System.out.println(b2); // -128

    // for (byte k = 127; k < 129; k++) {
    // // System.out.println(k); // overflow inifinity loop, ... k = 127 -> -128 -> -127
    // }

    // long[] arr = new long[Integer.MAX_VALUE]; // an array with long data type with it length of the max value of long data type
    // for (int n = 0; n < arr.length; n++) {
    // // System.out.println(n); -> overflow, n can never reach to the array max
    // }

    // int[] arr = new int[Integer.MAX_VALUE]; // an array with long data type with it length of the max value of long data type
    // for (int n = 0; n < arr.length; n++) {
    // System.out.println(n); // -> overflow, n can never reach to the array max
    // }

    // ^ well....my machine do not have enough memory to store this array so it will return error

    char c2 = 'B'; // 66
    // Base on ACSII code, char can compare with numbers
    if (c2 == 66) {
      System.out.println("c2 is equal to 66");
    }

    if (c2 == 'B') {
      System.out.println("c2 is equal to B");
    }

    int c3 = 67;
    if (c3 == 'C') {
      System.out.println("c3 is equal to C");
    }

    // ASCII to char
    int g = 'a';
    char k = (char) g; // Explicit coversion / downcasting

    int g2 = 67;
    // char k2 = g2; // won't work, already known g2 is int so 67 can't put to char k2 even is within the range
    char k2 = (char) g2; // but still can do a for downcasting
    char k3 = 67; // why? downcast allow without forcing downcasting -> it is an exception case in java, as 66 is ASCII code

    char k4 = (char) 65601; // test char overflow (65535 + 66)
    System.out.println(k4); // A

    //
    int h = (int) 1000L; // downcasting, Explicit coversion
    short s10 = 128;
    byte o = (byte) s10;
    // byte o2 = 128; // error, complier will help you check the range

    // demo how + - work for char
    char character = 'a' + 1;
    if (character == 'b') {
      System.out.println("character=" + character);
    }
    if (character == 98) {
      System.out.println("character=" + character);
    }
    if (character > 'a') {
      System.out.println(character + " > a");
    }
  }
}
