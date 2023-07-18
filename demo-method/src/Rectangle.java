public interface Rectangle {
  public static void main(String[] args) {
    // area
    double area1 = area(5.0d, 3.0d);
    double area2 = area(6.0d, 2.0d);
    // perimeter
    double perimeter1 = perimeter(5.0d, 3.0d);
    double perimeter2 = perimeter(15.0d, 4.0d);

    System.out.println(area1 + " " + area2 + " " + perimeter1 + " " + perimeter2);
  }

  public static double area(double length, double width) {
    return length * width;
  }

  public static double perimeter(double length, double width) {
    return (length * 2) + (width * 2);
  }
}
