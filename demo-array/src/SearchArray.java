import java.util.Arrays;

public class SearchArray {
  public static void main(String[] args) {

    // search
    char target = 'm';
    char[] chars = new char[] {'j', 'o', 'm', 'm', 'q', 'c'};
    // Loop to find the index of the target in array chars
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == target) {
        System.out.println("target " + target + " find at char[" + i + "]");
      }
    }

    // toCharArray()
    String str = "I am a boy."; // a String that contain total 11 character
    // how can I put that into a char array?
    char[] arr = str.toCharArray(); // this method would but the String "I am a boy." to a char array and array size has been set to the length of the strength
    System.out.println(Arrays.toString(arr)); // output: [I, , a, m, , a, , b, o, y, .]
    for (int i = 0; i < arr.length; i++) {
      System.out.println("Array[" + i + "] contain the value " + arr[i]);
    }

    String str2 = "123@WER345dj. #$*&@ xas";
    char[] arr2 = str2.toCharArray();
    System.out.println(Arrays.toString(arr2));

    // Find Max. value in the array
    int[] numArr = new int[] {7, 1, 44, -23, 12};
    int max = 0; // if all num is negative then it won't work, but ignore it here first
    for (int i = 0; i < numArr.length; i++) {
      if (numArr[i] > max) {
        max = numArr[i];
      }
    } // max = 44
    System.out.println("The max is: " + max);

    // Find the min. value in the array
    int min = 999999999;
    for (int i = 0; i < numArr.length; i++) {
      if (numArr[i] < min) {
        min = numArr[i];
      }
    } // max = -23
    System.out.println("The min is: " + min);

  }
}
