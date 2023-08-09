import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DemoSorting {
  public static void main(String[] args) {
    int[] arr = new int[] {4, -10, 9,-20, 100};
    // sort normally
    Arrays.sort(arr); // n * logn, merge sort, which is super fast sorting
    System.out.println(Arrays.toString(arr));
    
    // What if want to reverse?
    // very easy, can try, for loop

    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(100);
    arrayList.add(-100);
    arrayList.add(-88);
    arrayList.add(4);
    Collections.sort(arrayList); // nlogn, ascending order sorting
    System.out.println(arrayList); // [-100, -88, 4, 100]

    ArrayList<Ball> ballsTest = new ArrayList<>();
    ballsTest.add(new Ball(4, Color.YELLOW));
    ballsTest.add(new Ball(1, Color.RED));
    ballsTest.add(new Ball(5, Color.BLUE));
    ballsTest.add(new Ball(100, Color.YELLOW));
    ballsTest.add(new Ball(50, Color.BLUE));
    ballsTest.add(new Ball(20, Color.YELLOW));
    Collections.sort(ballsTest, new SortByColor());
    System.out.println(ballsTest); 

    ArrayList<Ball> balls = new ArrayList<>();
    balls.add(new Ball(4, Color.YELLOW));
    balls.add(new Ball(1, Color.RED));
    balls.add(new Ball(5, Color.BLUE));
    balls.add(new Ball(100, Color.YELLOW));
    balls.add(new Ball(50, Color.BLUE));
    balls.add(new Ball(20, Color.YELLOW));
    // Make the object class you need to sort decending, implement Comparable<T>
    // Finish the compareTo require from the contract so can override
    // Collections.sort would implicitly call the compareTo
    //Collections.sort(balls);
    //System.out.println(balls); // [[id=100], [id=5], [id=4], [id=1]]
    
  }
}