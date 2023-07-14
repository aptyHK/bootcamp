/**
 * 
 * When target = 'c', the expected output: We found 3 character c in the String.
 * 
 * When target = 'z', the expected output: Not Found.
 */
// Count the target of character in a String.
public class JavaQuest5 {
  public static void main(String[] args) {
    String str = "Welcome to the coding bootcamp."; // You should not change this line
    char target = 'c'; // Update this target to test the logic

    // Use a loop to count the target of character in a String.
    // code here
    int targetCounter = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == target) {
        targetCounter++;
      }      
    }

    // if found, print "We found 3 character c in the String."
    // if not found, print "Not Found."
    // code here
    boolean found = false;

    if (targetCounter >= 3) {
      found = true;
    } 

    if (found) {
      System.out.println("We found " + targetCounter + " character " + target + " in the String.");
    } else {
      System.out.println("Not Found.");
    }
    
  }
}
