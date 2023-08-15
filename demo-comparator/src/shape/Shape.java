package shape;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class Shape {
  
  abstract double area(); // implicitly public

  // public static <T extends Shape> double area(List<T> shapes)
  public static double area(List<? extends Shape> shapes) {
    BigDecimal total = BigDecimal.ZERO;

    // shapes.add(new Circle());
    // controlling list, list cannot do polymophism, compile-time checkg

    for (Shape shape : shapes) {
      total = total.add(BigDecimal.valueOf(shape.area())); // controlling 1 shape
    }
    return total.doubleValue();
  }

  public static void main(String[] args) {
    // Polymophism
    Shape shape = new Circle();
    Shape shape2 = new Square();
    ArrayList<Shape> shpaes= new ArrayList<Shape>();
    // shpaes = new ArrayList<Circle>(); // compile-error
    // Unlike Shape shape = new Circle();, 
    //  ArrayList<Shape> shpaes= new ArrayList<Shape>(); is not Polymophism

    // Technically, below is a demo of List<? extends T>
    List<? extends Shape> listEx = new ArrayList<>();
    //list = new ArrayList<Square>();
    //list.add(new Circle()); // compile check refer declaration
    //list.add(new Square());
    // Java is string type, List<? extends Shape> is not clear enough
    // compiler would stop you add(new Circle()) or any shape

    // Correct way, just make it simple
    List<Shape> list = new ArrayList<>();
    list.add(new Circle());

    List<Map<String, String>> list2 = new ArrayList<>();

    // Polymophism only check the outer layer
    // List <--- ... ---> ArrayList<>();
    // The Polymophism is exist at List .. = ArrayList
    // it does not matter what is inside <>, no Polymophism involve

  }
}
