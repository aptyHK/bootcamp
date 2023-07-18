public class Circle {
  public static void main(String[] args) {
    double area1 = area(5.0d);
    System.out.println(area1);
    double perimeter1 = perimeter(5.0d);
    System.out.println(perimeter1);
  }

  public static double area(double radius) {
    return radius * radius * 3.14159;
  }

  public static double perimeter(double radius) {
    return radius * 2 * 3.14159;
  }
}
