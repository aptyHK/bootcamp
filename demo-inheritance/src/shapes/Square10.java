package shapes;

public class Square10 extends Shapes {

  private double length;

  public Square10(double length) {
    this.length = length;
  }
  
  public double area() {
    return Math.pow(this.length, 2);
  }
}
