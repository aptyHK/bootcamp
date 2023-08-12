public class Dog extends Animal {

  public Dog(String name) {
    super(name);
  }

  public static Dog of(String name) {
    name = name == null ? "default" : name;
    return new Dog(name);
  }

  public static void main(String[] args) {
    Dog dog = Dog.of("abc");
  }
}
