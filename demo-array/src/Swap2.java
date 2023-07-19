import java.util.Arrays;

public class Swap2 {
  public static void main(String[] args) {
    int[] nums = new int[] {11, 5, -44, 40, 120, -29};
    int[] nums2 = new int[] {1, 2, 3, 4, 5, 6};

    // Move the max number to the tail;
    // 11 5 -44 40 -29 120
    int temp = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[temp] < nums[i]) {
        temp = i;
      }
    }
    System.out.println(temp);

    // int temp2 = nums[temp];
    // nums[temp] = nums[nums.length-1];
    // nums[nums.length-1] = temp2;

    nums[temp] = nums[temp] + nums[nums.length - 1]; // nums[4] 120 + nums[5] -29 -> 91
    nums[nums.length - 1] = nums[temp] - nums[nums.length - 1]; // 91 - -29 -> 120
    nums[temp] = nums[temp] - nums[nums.length - 1]; // 91 - 120 -> -29


    System.out.println(Arrays.toString(nums));

    System.out.println(average(nums2));

    int[] classA = new int[] {20, 30, 80};
    int[] classB = new int[] {90, 30, 100};

    if (average(classA) > average(classB)) {
      System.out.println("Class A is better than Class B~");
    } else {
      System.out.println("Class B is better than Class A~");
    }

  }

  public static double average(int[] arr) {
    // double avg = 0;
    // for (int i = 0; i < arr.length; i++) {
    // avg += arr[i];
    // }
    // avg /= arr.length;
    // return avg;
    int sum = 0; 
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum / arr.length; // 3.0

  // to fix it: from 3.0 to correct output 3.5
  // 1) int sum -> double sum
  // 2) return sum / arr.length -> return (double) sum / arr.length
  // because 21 / 6, if everthing is int, it will give you an int result
  }
}
