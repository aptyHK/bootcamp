package shapes;

import java.math.BigDecimal;
import java.util.Arrays;

public abstract class Shapes { // implicitly extends object
  
  public abstract double area();

  // Factory pattern
  // to create a factory pattern, the thing pass in should be generic
  public static double area(Shapes[] shapes) {
    BigDecimal total = BigDecimal.valueOf(0);
    for (Shapes s : shapes) { // circle, square
      total = total.add(BigDecimal.valueOf(s.area()));
    }
    return total.doubleValue();
  }

  public static void main(String[] args) {
    Circle10 circle = new Circle10(10.0d);
    Square10 square = new Square10(3.0d);
    Shapes[] shapes = new Shapes[] {circle, square};
    
    System.out.println(Shapes.area(shapes)); // 10 * 10 * PI + 3 * 3
    
  }
}


