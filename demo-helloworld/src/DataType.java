public class DataType {

  public static void main(String[] args) {
    // Number, Text(english character)

    //Number
    //Declaration
    int num; // int is a way to declare a variable
    // from now on, you can only put integer to variable num
    num = 3; // (> Action: assignment) put the thing on the right (3) to left (varible num)
    System.out.println("3");
    System.out.println(3);
    System.out.println(num);

    // Text
    //Declaration + Assignment
    String str = "Hello...";
    System.out.println(str); 

    /* 
    String str2 = 1; 
    int num2 = "ABC";
    report error, because assign incorrect data type 
    */

    // Re-assignment
    num = 10; // num was stored 3, and now assigned new value 10

    // floating point
    // int num3 = 1.1; // error, int can only store integer
    double f = 1.03;
    double f2 = 2; // still works even you put integer, but will explain later
    System.out.println(f);
    System.out.println(f2);

    // byte, short, long
    byte b1 = -127;
    // byte b2 = 128; // error, out of range
    System.out.println(b1);

    short s1 = 32700;
    // short s2 = 32800; // error, out of range
    System.out.println(s1);

    long l1 = 20000000;
    long l2 = 3232231313323L; // norm -> L, but not l
    System.out.println(l1);
    System.out.println(l2); 

    // floating point -> double/ float
    float f3 = 1.0000000000000000000005f;
    double d4 = 223.5;

    // char, value should be assigned be single quote ' '
    char c1 = 'a';
    char c2 = 'G';
    char c3 = ' ';
    // char c4 = 'aa'; // error, char c4 = '  ' error

    // boolean
    boolean isMale = true;
    boolean isLeapYear = false; 

    // about initialization (first time to do assignment to variable)
    int a10; // no problem when declare
    // System.out.println(a10); // however it would error when try to use it
    a10 = 100;
    System.out.println(a10); // can use now
    
    // String + operation
    String firstName = "Andy";
    String lastName = "Yip";
    // 2 String variable 
    String fullName = firstName + lastName;
    System.out.println(fullName);
    // assign 3 String phase to 1 String variable
    String result2 = "AB" + "CD" + "EF";
    // print 2 String phase and 1 String variable on 1 line
    System.out.println(result2 + " " + "ZZZ");
    
    // Some default behaviour about String
    String str3 = "abc" + 13; // output: abc13, converted int 13 to String "13" then concatenate
    String str4 = "abc" + true; // output: abcdtrue, coverted boolean true to String "true" then concatenate
    String str5 = "abc" + 'A'; // output: abcA, convert char 'A' -> String "A" then concatenate
    // String str6 = 13 + 13 // error, wrong data type, can't put number into String
    String str7 = "" + 13 + 13; // output 1313, convert int 13 and int 13 then concatenate String "", String "13" and String "13"

    // different operator
    int a11 = 1 + 3; // 4
    int b11 = 13 - 5; // 8
    int c11 = 3 - 6; // -3
    int d11 = 2 * 101; // 202
    int e11 = 10 / 3; // 3
    int f11 = 10 % 3; // 1, the remainder of 10 / 3

    int c100 = 300 / 28;
    double d100 = 300.0 / 28.0;
    System.out.println(c100); // 10, but it is an integer type variable
    System.out.println(d100); // 10.71428......, because it can keep the decimal

    // more about declare data type
    int z1 = 0;
    // int z1 = 3; long z1 = 300 // not okay, can't declare data type again for same variable
    
    
  }
  
}
