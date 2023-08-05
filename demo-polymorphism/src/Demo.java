public class Demo {

  public static void main(String[] args) {
    // Dynamic Polymorphism (Run-time)
    Building building = new House(); //
    // Compile-time checks
    // building.getCapacity(); // compile error
    building.print(); // Compile-time confirm you can call print() method
    // Run-time decide which print() is going to call
    // So, "building" variable call House's print() method
    // In run-time, will always look at the override method first

    building.print2(); // Still I am House
    // public void print2()
    // this.print();
    // the 'this' is mean the actual House, not the box 'Building'
    // So it will use the print() method in the House, the override one

    building.print3(); // I am building
    // simply call the print3 from the Building class

    House building1 = new House();
    building1.print3();
    // simply call the print3 from the Building class as House did extends building

    // ***conclusion
    // what method can call, depends on which box (class, on the left) has been assigned to
    // if the assigned class do not contain the method you want, will compile error
    // if the assigned class do have the method, then it will check the actual class that new the Object (on the right)
    // if the actual class do have the same method, will overrride

    // Static Polymorphism
    // Method Signature (method name + parameters)
    // Same for constructor signature
    building1.print("abc");
    House house2 = new House(8.0d);
    house2.print("Hi");
    house2.print();
    // House house3 = new House("String") // Constructor not found
    // house2.print(3L); // method not found

    long l1 = Long.valueOf(1L); // wrapper class -> unbox
    Long l3 = 3L; // wrapper class -> auto-box
    long l2 = 2; // upcasting
    int i2 = (int) 3L; // downcast 3L;
    
    // downcast (Run-time Polymorphism)
    Object obj = new Container();
    if (obj instanceof Cube) {
      Cube cub1 = (Cube) obj; // downcast: Object -> Cube
      System.out.println("obj is instance of Cube");
    }
    Object obj2 = new Cube();
    if (obj2 instanceof Container) {
      Container cub1 = (Container) obj2; // downcast: Object -> Object to Container
      System.out.println("obj is instance of Cube");
    }

    //
    Object obj3 = new Clone();
    //Cube cube2 = (Cube) obj3; // java.lang.ClassCastException
    // runtime exception: Run-time polymorphism
    // Clone extends Container but cannot match Cube
    // clone and cube is same level, can't fit
    
    Number number = Integer.valueOf(3);
    // Double d1 = (Double) number; // java.lang.ClassCastException
    // Number is actually is integer
    // integer is same level as double
    // so won't work

  }
}
