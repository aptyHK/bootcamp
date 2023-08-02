import java.util.Objects;
import javax.crypto.Mac;

public class Laptop extends Machine { // Laptop is a "Machine"
  // Laptop MUST

  // Laptop should inherit all about machines, so put extends Machine
  // Then we can define more about Laptop
  // Inherit Machine "double weight", and all the method in Machine
  // the key to archieve this is "extend"

  // Laptop should have:
  // private double weight; (from Machine)
  Keyboard keyboard;
  Monitor monitor;
  private int volume;

  // *** subclass must call superclass constructor
  // mean, when use constructor public Laptop() with any argument, behind it would 
  // also call the machine() empty constructor. 
  // Therefore, once you set a new Machine constructor with argument
  // public Laptop() would report error. (as default Machine() empty constructor would be removed)
  // To solve it, create an empty constructor on Machine.java 

  public Laptop() {
    // *** implicitly call superclass empty constructor
    //super(3.0d);
  }

  public Laptop(Keyboard keyboard, Monitor monitor) {
    // *** implicitly call superclass empty constructor
    this.keyboard = keyboard;
    this.monitor = monitor;
  }

  ////// ^
  ////// encapsulation technique, user not necessary to new a keyboard when construct laptop
  ////// v
  public Laptop(String buttonType, int noOfButton, double length,
      double width) {
        // *** implicitly call superclass empty constructor
    this.keyboard = new Keyboard(buttonType, noOfButton);
    this.monitor = new Monitor(length, width);
  }

  public Laptop(double weight, Keyboard keyboard, Monitor monitor) {
    super(weight); // super() + this.setWeight(weight); 
    // super have to call in the beginning
    this.keyboard = keyboard;
    this.monitor = monitor;
  }

  @Override // Method Overriding
  // When you need to replace the same method from parent, then need to use override
  // If you write the keyword @Override, the compile would help you to check
  // the parent class, if the parent class do not have the start() method
  // compile will return error
  // It is not a must to write @Override, would still have the same effect
  // But it is a good pratice to put @Override for readability and compile help you checking prevent human mistake 
  public void start() {
    super.start(); // other than construct, super can also use to call method
    // here it will call the start() on Machine class
    System.out.println("Laptop Start....");
  }

  @Override
  public void stop() {
    System.out.println("Laptop Stop....");
  }

  public void mute() {
    this.volume = 0;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Laptop))
      return false;
    Laptop laptop = (Laptop) o;
    return Objects.equals(laptop.keyboard, this.keyboard)
        && Objects.equals(laptop.monitor, this.monitor);
  }

  //public static String staticMethod(String x, String y) {
    // can not override final method from the machine
    //return x + y;
  //}

  public static void main(String[] args) {
    Laptop laptop = new Laptop("abc", 100, 15, 10);
    // All the method (or call behaviour) from Machine:
    laptop.setWeight(3.0d);
    System.out.println(laptop.getWeight());
    laptop.start(); // Laptop Start....
    laptop.stop(); // Laptop Stop....
    //
    Machine machine = new Machine(); // weight = 0.0
    machine.setWeight(5.0d);
    System.out.println(machine.getWeight()); // 5.0
    machine.start(); // Start machine
    machine.stop(); // Stop machine
    // for machine, it will still run its own start and stop method

    //
    Laptop laptop2 = new Laptop();
    laptop2.setWeight(10.0d);
    System.out.println(laptop2.getWeight()); // 10.0

    Laptop laptop3 = new Laptop();
    //System.out.println(laptop3.getWeight()); // 3.0 when add super(3.0d) in the empty constructor
    
    Machine.staticMethod("abc", "def");
    Laptop.staticMethod("abc", "def"); // this line is still the staticMethod from the Machine class
    // laptop3.staticMethod("xyz", "abc"); // can call static method with object, but not recommand

  }
}
