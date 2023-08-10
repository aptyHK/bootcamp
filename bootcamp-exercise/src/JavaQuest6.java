/**
 * Expected output: 1 1 2 3 5 8 13 21 ...
 * 
 */

public class JavaQuest6 {
  public static void main(String[] args) {

    // initial setup for counting Fibonacci Sequence
    int a = 0;
    int b = 1;
    int c = a + b;

    // for loop to print first 15 numbers in Fibonacci Sequence
    for (int i = 0; i < 15; i++) { // i only use for counting how many number to display

      a = b; 
      b = c;
      c = a + b;

      // a   b   c
      // 0 + 1 = 1 -> set befor the for loop
      // 1 + 1 = 2 -> a = b of last line, b = c of last line, c = a of this line + b of this line
      // 1 + 2 = 3 -> a = b of last line, b = c of last line, c = a of this line + b of this line
      // 2 + 3 = 5 -> same as above
      // 3 + 5 = 8 -> ...
      // 5 + 8 = 13
      // 8 + 13 = 21
      // ... 

      System.out.print(a + " ");
    }

  }
}
