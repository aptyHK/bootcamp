package crash;

public class X extends Y {
  
  private String name; // can say is a variable overriding

  public X() {

  }

  public X(String name) {
    super("John");
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public String getParentName() {
    return super.getName();
  }

  public static void staticMethod() {
    System.out.println("I am X");
  }

  public static void main(String[] args) {
    X x = new X("Peter");
    System.out.println(x.getName()); // Peter
    
    // How to get "John"? 
    
    // can design name on both X and Y
    // Is not a good design
    // technical...okay
    // but is not make sense

    // Well..can design a method in X
    // getParentName() {
    // return super.getName();

    // not make sense
    // if any chance set the same name for a parent class and child class
    // seems the design have problem

    // Hiding
    Y y = new X("Tommy");
    y.staticMethod(); // I am Y, Hiding

    Y.staticMethod(); // I am Y
    X.staticMethod(); // I am X
    System.out.println(y.getName()); // Tommy, not John
    System.out.println(((Y) x).getName());
  }
}
