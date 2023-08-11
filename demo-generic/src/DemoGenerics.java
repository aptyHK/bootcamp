import java.util.ArrayList;

public class DemoGenerics {
  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<>();

    // Animal Example
    Zoo<Animal> zoo1 = Zoo.of(Dog.of("abc"));
    Zoo<Animal> zoo2 = new Zoo<>(new Dog("as"));
    // zoo1.setAnimal(new Cat()); // Compile error, strong type
    zoo1.setAnimal(Dog.of("xyz"));;

    // Zoo<Animal> zoo2 = new Zoo<>();
    // zoo2.setAnimal(new Cat());
    // zoo2.setAnimal(new Dog());
    // zoo2.setAnimal(new Animal());

    Box<Integer> box = getBox(Integer.valueOf(100));
    box.add(100);
    Object object = getBox(Double.valueOf(1.0d));
    // Object object <- Box<Double>
    Box<Double> d1 = (Box<Double>) object;
    for (double d : d1.getNumbers()) {
      System.out.println(d); // 1.0
    }
  }

  public static <T extends Number> Box<T> getBox(T element) {
    return new Box<>(element);
  }
}
