import java.util.Objects;

public class Ball {
  Color color; // if not use ENUM and use String instead, may be will have human input like R ED rED etc.
  private static char c = 'C';
  public Ball(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return this.color;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) 
      return true;
    if (!(o instanceof Ball))
      return false;
    Ball b = (Ball) o;
    return this.color == b.color;
  }

  public static void main(String[] args) {
    Ball ball = new Ball(Color.RED);
    System.out.println(ball.getColor().name());
    System.out.println(ball.c);

    // Object is topmost parent
    Object object = new Ball(Color.RED); // Object is reference
    // Compile-time Class "Object" type check
    object.hashCode(); // reference presentation
    // Compile-time check if Object class has hashCode() method
    // Complie-time check if Ball class inherit Object

    // Run-time object variable stores an address, point to a Ball object in heap
    // Run-time determine if Class Ball has hashCode() method.
    // If no, then invoke Class Object hashCode()
    // If yes, invoke the Class Ball hashCode()

    Color color = ((Ball) object).getColor(); // Complie-time // can force downcast to another class and use the method included
    // seems perfect, but is a bomb, especially if you don't protect with condition
    
    // Color extends Enum.class, Enum extends Object
    System.out.println(color.getClass()); // class Color
    Class<?> clas = color.getClass();
    System.out.println(clas.getName()); // Color
    System.out.println(clas.toString());

    if (Color.BLUE instanceof Color) { // true
      System.out.println("Color BLUE is instance of Color");
    }

    if (Color.BLUE.getClass() == Color.class) {
      System.out.println("Color BLUE is instance of Color");
    }

    Object o = 1 - 'a'; // int -> Integer
    System.out.println(o.getClass().getName()); // Integer

    Object o2 = 'b'; // char -> Character
    System.out.println(o2.getClass().getName()); // Character

    Object o3 = new Ball(Color.GREEN);
    System.out.println(o3.getClass().getName()); // Ball

    System.out.println(o3.getClass().isEnum()); // false
    System.out.println(clas.isEnum()); // true;


  }
}
