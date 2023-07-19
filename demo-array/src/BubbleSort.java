import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    // [5, 1, 4, 8, 2]
    // target: [1, 2, 4, 5, 8]

    int[] nums1 = new int[] {5, 1, 4, 8, 2};
    // scan all 5, put the max to the trail
    // step 1.1: 1, 5, 4, 8, 2
    // step 1.2: 1, 4, 5, 8, 2
    // step 1.3: 1, 4, 5, 8, 2 (no swap, due to 5 < 8)
    // step 1.4: 1, 4, 5, 2, 8
    // round 2:
    // step 2.1: 1, 4, 5, 2, 8 (no swap, due to 1 < 4)
    // step 2.2: 1, 4 ,5, 2, 8 (no swap, due to 4 < 5)
    // step 2.3: 1, 4, 2, 5, 8
    // ...
    // target: 1, 2, 4, 5, 8
    // for (int i = 0; i < nums1.length; i++) {
    // for (int j = nums1.length; j > i; j--) {
    // if (nums1[i] > nums1[i+i]) {

    // }
    // }

    
    System.out.println(Arrays.toString(sort(nums1)));
  }

  public static int[] sort(int[] nums1) {
    int temp;
    for (int i = 0; i < nums1.length - 1; i++) {
      for (int j = 0; j < nums1.length - 1 - i; j++) {
        if (nums1[j] > nums1[j+1]) {
          temp = nums1[j];
          nums1[j] = nums1[j+1];
          nums1[j+1] = temp;
        }
      }
    }
    return nums1;
  }
}
