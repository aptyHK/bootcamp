package Abstract;

public abstract class Person {
  // simpliy say, abstract a class mean cannot new an object with abstract
  // final a class mean cannot extends the class
  // so you can put final and abstract together on a class
  // if a class cannot extends and new object, it has no meaning

  // Vincent's said

  private int age;
  private double height;

  // May contain instance method with implementation
  public void run() {
    System.out.println("I am running");
  }

  public int getAge() {
    return this.age;
  }

  // May contain abstract method (without implementation)
  public abstract void sleep();
  
}
