import java.util.Arrays;

/**
 * Case 1: [2,7,11,15] Target: 9 Ans: [0, 1] or [1, 0]
 * 
 * Case 2: [3,2,4] Target: 6 Ans: [1, 2] or [2, 1]
 *
 * Case 3: [3, 3] Target: 7 Ans: [-1, -1]
 */
public class JavaQuest12 {
  // Given an array of integers nums and an integer target, return the index of
  // the two numbers such that they add up to target.

  // You may assume that each input would have exactly one solution OR no
  // solution, and you may not use the same element twice.

  // If no solution, return [-1, -1]

  // You can return the answer in any order.

  // Do not change anything in main method
  public static void main(String[] args) {
    int[] answers = twoSum(new int[] {2, 7, 11, 15}, 9); // {2, 7, 11, 15} is the dataset, 9 is the target to sum
    int[] answers2 = twoSum(new int[] {3, 2, 4}, 6); // {3, 2, 4} is the dataset, 6 is the target to sum
    int[] answers3 = twoSum(new int[] {3, 3}, 7); // {3, 3} is the dataset, 7 is the target to sum

    System.out.println(Arrays.toString(answers));
    System.out.println(Arrays.toString(answers2));
    System.out.println(Arrays.toString(answers3));

  }

  // Code a method here to return an array of two numbers that sum up to the
  // target
  public static int[] twoSum(int[] arr, int target) {

    // if arr legnth is 4
    // round 0 compare the target with -> arr[0]+arr[1], arr[0]+arr[2], arr[0]+arr[3]
    // round 1 compare the target with -> arr[1]+arr[2], arr[1]+arr[3]
    // round 2 compare the target with -> arr[2]+arr[3]


    int[] twoNumbers = new int[] {-1, -1};

    for (int i = 0; i < arr.length - 1; i++) { // control round 0 1 2
      for (int j = i + 1; j < arr.length; j++) { // round 0: 1 2 3, round 1: 2, 3, round 2: 3
        if (arr[i] + arr[j] == target) {
          twoNumbers[0] = i;
          twoNumbers[1] = j;
          return twoNumbers;
        }
      }
    }
    return twoNumbers;
  }
}
