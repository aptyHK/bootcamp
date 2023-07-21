public class InsertionSort {
  public static void main(String[] args) {
    /// int[] nums1 = new int[] {5, 1, 4, 8, 2};
    int[] nums1 = new int[] {5, 1, 4, 8, 2};
    // [5, 1, 4, 8, 2]
    // step1.1 ~ 1 5 6 8 2 -> insert 1 to arr[0], 1 < 5
    // After round 1, [1, 5] is sorted
    // step2.1 ~ Compare 4 < 5 (arr[1])
    // step2.2 ~ Compare 1 < 4 (arr[0])
    // After round 2, [1, 4, 5] is sorted
    // step3.1 ~ Compare 8 < 5 (arr[2])
    // After round 3, [1, 4, 5, 8] is sorted
    // step4.1 ~ Compare 2 < 8 (arr[3])
    // step4.2 ~ Compare 2 < 5 (arr[2])
    // step4.3 ~ Compare 2 < 4 (arr[1])
    // step4.4 ~ Compare 1 < 2 -> insert 2 to arr[1], 1 < 2
    // After round 4, [1, 2, 4, 5, 8] is sorted
    // Done

    for (int x : insertionSort(nums1)) {
      System.out.println(x);
    }


  }

  public static int[] insertionSort(int[] nums) {

    int temp = 0;
    int index = 0;

    for (int i = 0; i < nums.length - 1; i++) { // number of round should be array length - 1

      temp = nums[i + 1]; // the number that I want to check on each round
      index = i;

      while (temp < nums[index]) { // always compare that I want to check on this round with the index pos
        nums[index + 1] = nums[index]; // swap
        nums[index] = temp; // swap
        index--; // shift the index to the left

        if (index == -1) { // when I rech to the beginning of the array
          break;
        }
      }
    }
    return nums;
  }
}

