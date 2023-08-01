package objects;

import shapes.Circle10;
import shapes.Shapes;

public class ObjectDemo { 
  
  // Rule 1: All class extends Object implicitly
  String name = "hello";

  // @Override
  // public String toString() {
  //   return this.name;
  // }
  
  public static void main(String[] args) {
    // Example 1:  ObjectDemo extends Object
    ObjectDemo objectDemo = new ObjectDemo();
    objectDemo.toString(); // ? why I can apply toString() even did not write the method on ObjectDemo?
    // the method is from Object, which prove that ObjectDemo extends object

    // hash code -> int
    objectDemo.hashCode(); // another presentation of object reference
    // hashcode range (32-bits) is smaller than the actual memory address
    // Because hash code has a short range of value storage
    // so, it cannot store all memory address (object reference) in your machine
    // even hash code store the memory address, it can't garantee won't duplicate

    // object reference is unique
    // memory address is unique
    // hash code may not be unique

    String str = "abc";
    System.out.println(str); 
    // the toString() in String class override the toString() in the object class
    // so it can print abc


    // when print the object reference
    System.out.println(objectDemo); // objects.ObjectDemo@36baf30c -> default called the toString() in Object class even you don't call it
    // return getClass().getName() + "@" + Integer.toHexString(hashCode());
    System.out.println(objectDemo.toString()); // objects.ObjectDemo@36baf30c

    // when write a toString() on ObjectDemo and override toString() of Object
    System.out.println(objectDemo); // hello
    System.out.println(objectDemo.toString()); // hello

    System.out.println("abc's hashcode = " + str.hashCode()); // 96354
    // a * 31 ^ 2 + b * 31 ^ 2 + c
    System.out.println(97 * Math.pow(31, 2) + 98 *31 + 99);
    // .hashcode() return int
    // int size = 2.1billion
    // which the size of an int cannot represent all memory address
    // which reach to the limit, will overflow

    ObjectDemo a = new ObjectDemo();
    ObjectDemo b = new ObjectDemo();
    System.out.println(a); // toString() -> hashcode
    System.out.println(b); // toString() -> hashcode
    if (a == b ) { // address

    }

    Integer i1 = 3;
    System.out.println(i1.hashCode()); // 3, integer's hashcode is itself // return Integer.hashCode(value);

    Long l1 = 100L;
    System.out.println(l1.hashCode()); // the return type is int, so the hashcode may overflow

    // equals()
    String s1 = "abc";
    String s2 = "abc";
    System.out.println(s1.equals(s2)); // true
    // ? why is true?

    // instanceOf, Object.class
    Object obj = new String("abc"); // obj is an object reference (address)
    System.out.println(obj instanceof String); // true

    obj = Long.valueOf(10);
    System.out.println(obj instanceof String); // false
    System.out.println(obj instanceof Long); // true

    // Number
    Integer int1 = Integer.valueOf(100);
    System.out.println(int1 instanceof Number); // true
    Double d1 = Double.valueOf(100);
    System.out.println(d1 instanceof Number); // true

    Shapes shape = new Circle10(10.0d);
    //shape.print(); // No print() method in shape as the box is Shapes
    // Hide child print() method
    Circle10 c = (Circle10) shape; // downcast to child class, Circle10 have print()
    c.print(); // can print now

    // ***
    // instanceof check the actual class of the object
    // but what method can the object can call is depends on the class mention on the left side of assignment
    // until you downcast to the class contains the dedicate method
    // then you can call the method

    // Wrapper Class equals
    Integer j1 = 128;
    Integer j2 = 128;
    System.out.println(j1 == j2); // false, address
    System.out.println(j1.equals(j2)); // true, value
    j1 = 127;
    j2 = 127; 
    System.out.println(j1 == j2); // true, internal cache
    System.out.println(j1.equals(j2)); // true, value 
    Boolean bool1 = false;
    Boolean bool2 = false;
    System.out.println(bool1.equals(bool2)); // true
    System.out.println(bool1.equals(false)); // true
    // *** when compare value for wrapper class object, just always use equals() which is safe
  }
}
