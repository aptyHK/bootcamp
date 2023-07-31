package Abstract;

public abstract class Adult extends Person {


public Adult() {
  super();
} // this part is default done, unless not empty;

  // extend situation 2:
  // abstract class extends abstract class
  // implicity "extends" abstract

  // when abstract class extends an abstract class, can also create its own abstract method

  public abstract void read();
  
  public void eat() {
    System.out.println("I am eating");
  }
}
