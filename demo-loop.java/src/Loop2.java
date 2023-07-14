import java.util.Scanner;

public class Loop2 {
  public static void main(String[] args) {
    // for (int i = 0; i < 6; i++) { // 0, 1, 2, 3, 4, 5
    // for (int j = 0; j < 3; j++) { // 0, 1, 2, 3
    // System.out.println("i= " + i + " j= " + j);
    // if (i == j) {
    // break; // This break statment would just break the inner loop (j)
    // // it will still run the code on the rest of the outer loop i
    // }
    // }
    // }
    // 0 0 > break
    // 1 0
    // 1 1 > break
    // 2 0
    // 2 1
    // 2 2 > break
    // 3 0
    // 3 1
    // 3 2
    // 4 0
    // 4 1
    // 4 2
    // 5 0
    // 5 1
    // 5 2

    // continue
    for (int i = 0; i < 6; i++) { // 0, 1, 2, 3, 4, 5
      for (int j = 0; j < 3; j++) { // 0, 1, 2, 3

        if (i == j) {
          continue; // Go to the next iteration of inner loop j, skip the code of the current iteration
          // it will still run the code on the rest of the outer loop i
        }
        System.out.println("i= " + i + " j= " + j);
      }
    }

    // > i == j, continue
    // > 0 1
    // > 0 2
    // > 1 0
    // > i == j, continue
    // > 1 2
    // > 2 0
    // > 2 1
    // > i == j, continue
    // > 3 0
    // > 3 1
    // > 3 2
    // > 4 0
    // > 4 1
    // > 4 2
    // > 5 0
    // > 5 1
    // > 5 2

    String str = "I love programming, I love Java. Hahaha";
    System.out.println(str.length()); // 32
    // for loop iteration times, based on the length of the Strength
    for (int i = 0; i < str.length() - 1; i++) { // i < 32 (0 - 31)
      System.out.println(i);
    }

    // str.charAt()
    // print the index of the first time meet the character 'e'
    for (int i = 0; i < str.length(); ++i) {
      char indexCharacter = str.charAt(i);
      if (indexCharacter == 'e') {
        System.out.println(
            "first time meet " + indexCharacter + " is at the index of " + i);
        break;
      }
    }

    // check is y exist in the String > found or not found
    char charInput = 'y';
    boolean isCharExist = false;

    // for (int i = 0; i < str.length(); ++i) {
    // boolean isCharExist = false;

    // if (str.charAt(i) == charInput) {
    // isCharExist = true;
    // System.out.println(charInput + " is exist in the String");
    // break;
    // }
    // if (i == str.length() - 1) {
    // System.out.println(charInput + " is NOT exist in the String");
    // }
    // }

    Scanner s = new Scanner(System.in);
    System.out.println("Type a sentence: ");
    String aSentence = s.nextLine();

    for (int i = 0; i < aSentence.length(); ++i) {

      if (aSentence.charAt(i) == charInput) {
        isCharExist = true;
        break;
      }
    }

    if (isCharExist) {
      System.out.println(charInput + " is exist in the String");
    } else {
      System.out.println(charInput + " is NOT exist in the String");
    }

    // If the number of occurrence of the target >= 3, print Yes
    // otherwise print no
    char target = 'o';
    int targetCounter = 0;
    boolean found2 = false;

    for (int i = 0; i < str.length(); ++i) {
      if (str.charAt(i) == target) {
        targetCounter++;
      }
      
      // nice to have
      if (targetCounter >= 3) {
        found2 = true;
        break; // if the length is very long, it may help to leave from the loop earlier to optimize the run time
      }
    }

    if (found2) {
      System.out.println("Yes"); // (Number of occurance for " + target + " is: " + targetCounter + ")");
    } else {
      System.out.println("No"); // (Number of occurance for " + target + " is: " + targetCounter + ")");
    }

  }
}


