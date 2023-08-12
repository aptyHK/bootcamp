// Generic
public class Printer<T> { // 1. Class Signature, add <>, T represent any Type
            // ^ Desciption only

  T value; // still unknown, it can be any type of class
  // T is not a real class
  // When call setValue method, the input parameter must set to T class
  // Cannot be anything else
  T[] number;

  Object obj; // < When can't I set like this instead of T?
  // T is a compile time checking, it already confirm the data type of the T when declare the object reference
  // Object is a run time polymothism
  // also, you need to downcast the obj when you get it (extra work + insecure)
  // (String) x.getObject().charAt(); you can charAt because downcast, but does not mean the getObject is actually return a real String to you
  // When use T, no such problem

  public T getValue() {
    return this.value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  public void print() {
    System.out.println(this.value);
  }

  public static void main(String[] args) {
    Printer<String> p1 = new Printer<>(); 
    // when you assign to a class, you have to confirm the acutal Type of the object
    // Strong Type checking -> check if you put a real class into <>
    p1.setValue("abc");
    System.out.println(p1.getValue()); // abc
    System.out.println(p1.getValue().charAt(0)); // p1.getValue() return String, so I can call string method
    Printer<Integer> p2 = new Printer<>(); 
    p2.setValue(100);
    System.out.println(p2.getValue()); // 100
    Printer<Double> p3 = new Printer<>(); 
    p3.setValue(5.0d);
    System.out.println(p3.getValue()); // 5.0
    p1.print(); // abc
    
  }
}
