import java.util.Random;

public class Random1 {
  public static void main(String[] args) {
    int num = new Random().nextInt(3); 
    System.out.println(num); // 0 1 2
    num = new Random().nextInt(3) + 1; 
    System.out.println(num); // 1 2 3

    System.out.println(randomAbcde());
  }

  // A B C D E
  public static char randomAbcde() {
    int c = new Random().nextInt(5) + 65;
    return (char) c;

    // some other people way to do - approach 1
    // char[] chars = new char[] {'A', 'B', 'C', 'D', 'E'};
    // return chars[new Random().nextInt(5)];

    // Vincent's approach
    // return (char) (new Random().nextInt(5) + 65);
  }

}
