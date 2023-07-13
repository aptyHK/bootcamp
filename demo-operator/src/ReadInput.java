import java.util.Scanner; // important

public class ReadInput {

  public static void main(String[] args) {
    // Scanner
    Scanner x = new Scanner(System.in);
    // need to import java.util.Scanner library first, if not, Scanner won't work
    System.out.println("Please input the loop count: ");
    int userInput = x.nextInt(); // read user input, using nextInt to determine expecting it is an Integer
    System.out.println("Loop count is: " + userInput);


    for (int i = 0; i < userInput; ++i) {
      System.out.print((i + 1) + " ");
    }

  }

}
