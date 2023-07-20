import java.util.Random;
import java.util.Scanner;

public class Game {
  public static void main(String[] args) {
    
    int bomb = new Random().nextInt(100) + 1;
    int min = 1;
    int max = 100;
    boolean hitTheBomb = false;

    System.out.println(bomb);

    do {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please input a number (" + min + "-" + max + ")");
      int input = scanner.nextInt();
      if (input == bomb) {
        System.out.println("BOOM!");
        hitTheBomb = true;
      } else if (input > min && input < bomb) {
        min = input;
      } else if (input < max && input > bomb) {
        max = input;
      } else {
        System.out.println("Please enter a valid number");
      }
    } while(!hitTheBomb);
  }
}
