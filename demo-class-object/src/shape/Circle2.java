package shape;

import java.math.BigDecimal;

public class Circle2 {

  private double radius;
  private static final double pi = 3.14159;

  public Circle2(double radius) {
    this.radius = radius;
  }

  public static Circle2 of(double radius) {
    return new Circle2(radius);
  }

  // public BigDecimal area() {
  // return BigDecimal.valueOf(this.radius)
  // .multiply(BigDecimal.valueOf(this.radius))
  // .multiply(BigDecimal.valueOf(pi));
  // }

  // or v 

  public double area() {
    return BigDecimal.valueOf(this.radius)
        .multiply(BigDecimal.valueOf(this.radius))
        .multiply(BigDecimal.valueOf(pi))
        .doubleValue();
  }

  public static void main(String[] args) {
    new Circle2(0.1d).area();
    System.out.println(0.1 * 0.1 * pi); // 0.031415900000000004
    System.out.println(Circle2.of(0.1d).area()); // 0.0314159
  }
}
