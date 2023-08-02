// Before Java 8, 100% abstract
public interface Move extends BigMove { // interface can also extends a class

  // No instance variable, because it is not use to produce constant
  // p.s. instance variable -> Camlcase naming

  // Constant
  // p.s. usually when declare Constant variable, would put as all uppercase letter
  static final int MAX_SPEED = 10; // implicitly public

  // Java -> naming convention -> Camlcase
  // "noOfDay"

  // Behavior
  void jump();
  // void up(); // public abstract
  // void down(); // public abstract
  // void left(); // public abstract
  // void right(); // public abstract

  // No method implementation

  // After Java 8, lambda, stream
  default void print() { // instance method
    // since have default, it gain a lot of compactability
    // compare interface and abstract class
    // the main difference is only can have attribute or not
    System.out.println("I am Java 8 default method");
  }

  static String concat(String a, String b) {
    return a + b;
  }
}
