package shape;

public class Circle {

  private int id; // instance variable / attribute
  private double radius; 
  // private double pi; // < instead of write like this: 
  // private static double pi; // < this value would on a common area
  // if no static, every object would contain the pi value
  // However, value of pi should be well known so should be neverchange
  // static -> shared variable 
  // final -> one time initialization, compiler would report error when try to code to update pi
  // what would set to final?
  // which something well known in the world and never change
  // e.g. 1 year have 365 days, poker have 13 cards for each flower
    
  private static final double pi = 3.14159; // class variable

  // what can I do if I want to count how many circle object has been created?
  // set a counter > ++ the counter in the constructor
  private static int counter;


  public Circle() {
    this.id++; 
    AddCounter();
    // even both id and counter add 1 at the same time
    // but every circle object would have an id
    // and always only 1 Circle.counter in the memory (after at least 1 circle object created)
  }
  
  public static void AddCounter() {
    counter++;
  }

  public int getId() {
    return this.id;
  }

  public double area() { // instance method / object method
    // return this.radius * this.radius * 3.14;
    return Math.pow(this.radius, 2) * pi;
  }

  public double circumference() {
    return 2 * this.radius * pi; 
  } // ! like pi, should not write the number directly
  // 1) may have human mistake e.g. if put pi on many place and they wrote different
  // 2) is not readable by just looking at the numbers

  public void setRadius(int radius) {
    this.radius = radius;
  }

  // public static void main(String[] args) {
  //   Circle c1 = new Circle();
  //   c1.radius = 5; // even radius set private, but because now is in the same class, so can access. But it is not a good pratice
  //   c1.setRadius(2);
  //   System.out.println(c1.area());
  //   System.out.println(c1.circumference());

  //   Circle c2 = new Circle();
  //   c2.setRadius(5);
    
  //   System.out.println(counter);
  // }
  
}
