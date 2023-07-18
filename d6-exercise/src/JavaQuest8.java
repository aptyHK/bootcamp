
/**
 * Example Output Second Max = 230
 */
public class JavaQuest8 {
  // Write a loop to find the second max number.
  public static void main(String[] args) {
    int[] nums = new int[] {-10, 5, 100, 240, 230, 80}; // Second Max = 230
    int[] nums2 = new int[] {-10, 5, 100, 120, 240, 200}; // Second Max = 200
    int[] nums3 = new int[] {-10, 5, 120, -100, 100, 240}; // Second Max = 120
    int[] nums4 = new int[] {-10, 5, 100, 240, 240, 80}; // Second Max = 240

    // Your program should be able to handle all the above test case.
    int secondMax;

    // code here
    int max = 0;
    secondMax = max;

    for (int i = 0; i < nums.length; i++) {

      if (nums[i] > max) { // check is the value in the current index is greater than the max value we known
        secondMax = max; // if meet the condition, the max value we known would become the second max
        max = nums[i]; // and the max value would update with the value in the current index
      } else if (nums[i] > secondMax) { // even the value in the current index is not greater than the max value we known, but it may be greater than the second value
        secondMax = nums[i]; // so we can just set the value in the current index as the second max
      }
      // System.out.println("max: " + max + " " + "second max: " + secondMax);
    }
    System.out.println("Second Max = " + secondMax);

    // for (int i = 0; i < nums2.length; i++) {

    // if (nums2[i] > max) {
    // secondMax = max;
    // max = nums2[i];
    // } else if (nums2[i] > secondMax) {
    // secondMax = nums2[i];
    // }

    // System.out.println("max: " + max + " " + "second max: " + secondMax);
    // }
    // System.out.println("Second Max = " + secondMax);

    // for (int i = 0; i < nums3.length; i++) {

    // if (nums3[i] > max) {
    // secondMax = max;
    // max = nums3[i];
    // } else if (nums3[i] > secondMax) {
    // secondMax = nums3[i];
    // }

    // System.out.println("max: " + max + " " + "second max: " + secondMax);
    // }
    // System.out.println("Second Max = " + secondMax);

    // for (int i = 0; i < nums4.length; i++) {

    // if (nums4[i] > max) {
    // secondMax = max;
    // max = nums4[i];
    // } else if (nums4[i] > secondMax) {
    // secondMax = nums4[i];
    // }

    // System.out.println("max: " + max + " " + "second max: " + secondMax);
    // }
    // System.out.println("Second Max = " + secondMax);

  }
}

