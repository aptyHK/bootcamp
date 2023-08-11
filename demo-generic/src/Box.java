import java.util.ArrayList;

public class Box<T extends Number> {

  private ArrayList<T> numbers;

  private Box() {
    numbers = new ArrayList<>();
  }

  public Box(T number) {
    this(); // call your own constructor (here is Box class's constructor)
    numbers.add(number);
  }

  ArrayList<T> getNumbers() {
    return this.numbers;
  }

  public void add(T number) {
    numbers.add(number); // Becareful if do not new a ArrayList first it would hit null pointer, so better create ArrayList when construct the box
  }

  public int size() {
    return numbers.size();
  }

  // public void setNumbers(T[] numbers) {
  //   this.numbers = numbers;
  // }

  public static void main(String[] args) {
    Box<Integer> box1 = new Box<>(100); // Integer is within intValue() in Number class, so can put Integer inside the <>
    // Box<String> box2 = new Box<>(); // Bound mismatch: The type String is not a valid substitute for the bounded parameter <T extends Number> of the type Box<T>Java(16777742)
    box1.add(123);
    System.out.println(box1.size());
  }
}
