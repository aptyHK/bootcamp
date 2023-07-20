import java.util.Scanner;

public class DoWhileLoop {
  public static void main(String[] args) {
    // do-while, always do first, then check condition to start looping
    // benefit: to clearly present the code want to at least execute once first

    // Loop - for, do while, while...When to use?
    // when you suddenly want to execute a loop in a block of code, use while
    // usually, for
    // on setting you want to at least let the loop execute once first, use do while
    
    int count = 0;
    do {
      System.out.println("Hello"); // 0 1 2
      count++;
    } while(count < 3);


    int input = 0;

    do {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please input a number: ");
      input = scanner.nextInt();

      // If input is even -> continue, odd -> exit loop and print the number
    } while (input % 2 == 0);

  }
}