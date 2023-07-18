import java.util.Arrays;

public class Swap {
  public static void main(String[] args) {
    int[] arr = new int[] {100, -400, 3, 99};
    // expected output: 99 -400 3 100

    swapFirstLast(arr);

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }

    System.out.println("hello!");
    System.out.println(SwapOddEvenCharacter("aabbcc"));
  }

  public static int[] swapFirstLast(int[] list) {
    int swap = list[0];
    list[0] = list[list.length - 1];
    list[list.length - 1] = swap;
    return list;
  }

  // swap
  public static String SwapOddEvenCharacter(String str) {
    // hello! -> ehll!o
    // abcd -> badc
    // aabb -> aabb
    // 0 <-> 1, 2 <-> 3, 4 <-> 5
    char[] char1 = str.toCharArray();
    str = "";
    for (int i = 0; i < char1.length; i++) {
      if (i % 2 == 0 && i < char1.length - 1) {
        // (1st) when i is 0 or even number
        // (2nd) if the length is odd number, has to be stop running at the last loop
        char swap = char1[i]; //
        char1[i] = char1[i + 1]; //
        char1[i + 1] = swap; //
      }
      str += char1[i];
    }
    return str;
  }
}
