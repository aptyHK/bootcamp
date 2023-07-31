package multilevel;
import java.util.Arrays;

// Well..is not necessary to put B extends A, C extends C
// Can just put all them in 1 file
// Because 1) to build common language for the team (e.g. the team already use a class that has been extended for a long time, so when extends it, no need to further study about the class)
// 2) for inheritance 

public class C extends B {

  public void print(int[] arr) {
    System.out.println(Arrays.toString(arr));
  }
  public static void main(String[] args) {
    C c = new C();
    c.str = "hello";
    c.setNum(10);
    c.setStr("abc");

    c.print(5); // 10 5
    c.print("def"); // abc def
    c.print(new int[]{-1, 0, 2}); // hello [-1, 0, 2]
  }
}
