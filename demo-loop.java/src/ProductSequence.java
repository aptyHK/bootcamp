public class ProductSequence {
  public static void main(String[] args) {
    // 0, 1, 2, 3, 4, 5...
    // print out 0, 2, 6, 12, 20
    // 0 x 1 = 0
    // 1 x 2 = 2
    // 2 x 3 = 6
    // 3 x 4 = 12
    // 4 x 5 = 20
    // print the first 20 numbers

    int printRange = 20;
    int a, b, c; // can declare 2 variables in one go for

    for (int i = 0; i < printRange; i++) {
      a = i; 
      b = i + 1;
      c = a * b;
      System.out.print(c + " ");
    }
  }
}
