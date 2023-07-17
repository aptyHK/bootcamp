import java.util.Arrays;

public class Array {
  public static void main(String[] args) {

    int num = 7;
    int num2 = 8;
    int num3 = -30;

    // Create Empty Array (Approach 1)
    int[] nums = new int[3]; // 3 is the length of the array nums, must define first before use it
    // with index 0, 1, 2 (can treat it as address)
    nums[0] = -40;
    nums[1] = 500;
    nums[2] = -1000;
    nums[0] = 50000; // can re-assign value to array
    // if try to assign value to non-exist length
    // nums[3] = 1;
    // nums[-1] = 100;
    // Won't show error on the code, but when try to compile and run it, would show error:
    // Error: Could not find or load main class Array Caused by: java.lang.ClassNotFoundException: Array

    // Your turn
    double[] itemsPrice = new double[5];
    itemsPrice[0] = 9.5;
    itemsPrice[1] = 10.0;
    itemsPrice[2] = 5.9;
    itemsPrice[3] = 15.0;
    itemsPrice[4] = 39.9;
    // itemsPrice[0] = 'a'; // even your enter a char value, but won't show error, would explain later
    // itemsPrice[0] = "abc"; // type issue

    // Can try to pratice char[], int[], String[]
    char[] charArr = new char[3];
    charArr[0] = 'a';
    charArr[1] = 'b';
    charArr[2] = 'c';

    String[] stringArr = new String[2];
    stringArr[0] = "abc";
    stringArr[1] = "def";

    // Let's try to print the value in the array
    // for loop
    // for (int i = 0; i < 5; i++) { // which 5 is the array's length
    // Can also use the array size to help on set the loop condition
    for (int i = 0; i < nums.length; i++) {
      System.out.println("nums[" + i + "] have: " + itemsPrice[i]);
    }

    for (int i = 0; i < charArr.length; i++) {
      System.out.println("charArr[" + i + "] have: " + charArr[i]);
    }

    // reversely print array elements
    for (int i = nums.length - 1; i >= 0; i--) {
      System.out.println("charArr[" + i + "] have: " + charArr[i]);
    }

    // Approach 2, create Array
    int[] array = new int[] {3, 9, 12};
    for (int i = 0; i < array.length; i++) {
      System.out.println("array index" + i + " have: " + array[i]);
    }
    // Did not mention the length, but the length has been determine after the first initialize with putting value
    // Can add a new element at tail? No
    // Modify an element
    array[2] = -10;
    // Access an element
    int index = 2;
    System.out.println(array[index]);

    // char[]
    char[] chars = new char[3];
    chars[2] = 'a';
    chars[0] = '!';
    for (int i = 0; i < chars.length; i++) {
      System.out.println("chars[" + i + "] have: " + chars[i]);
    }
    // !! Can see we did not assign any value to chars[1], but no error, and when print out, it is empty
    // back to when learn premitive data type, default value for char is \u0000, which can represent empty

    // boolean[]
    boolean[] booleans = new boolean[2];
    booleans[1] = true;
    for (int i = 0; i < booleans.length; i++) {
      System.out.println("booleans[" + i + "] have: " + booleans[i]);
    } // Did not assign value to booleans[0], which also proved that the default value for boolean is false

    // String[]
    String[] strs = new String[] {"abc", "hello", "goodbye"};
    strs[0] = "typhoon";
    for (int i = 0; i < strs.length; i++) {
      System.out.println("strs[" + i + "] have: " + strs[i]);
    }

    String[] fruits = new String[5];
    fruits[0] = "apple"; 
    fruits[1] = "watermelon"; 
    fruits[2] = "orange"; 
    // Other then using for loop to print each element in the array
    // You can also use the method Arrays.toString(arr) to print the whole array
    System.out.println(Arrays.toString(fruits));
    // output is: [apple, watermelon, orange, null, null] << This whole thing is a string 
    // on the output, can see 2 null, because the default value for String in Java is null

    byte[] bytes = new byte[6];
    bytes[2] = 6;
    System.out.println(Arrays.toString(bytes));
    // output: [0 0 6 0 0 0]
    



  }
}
