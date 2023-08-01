package objects;

import java.util.Objects;

public class Ball {

  private String color;

  public Ball(String color) {
    // Hash Code is not unique representation of object reference
    this.color = color;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.color);
  }

  @Override
  public boolean equals(Object o) {
    // if address same, valuesinside the object must be same
    if (this == o) { // if o is the Ball (same address)
      return true;
    }
    if (!(o instanceof Ball)) { // if o is an object of Ball, if not then return false
      return false;
    }
    Ball ball = (Ball) o; // to here, confirmed must be child of Ball, then downcast o and assign to Ball
    return ball.color.equals(this.color);
  }

  @Override
  public String toString() {
    return "[color=" + this.color +"]";
  }

  public static void main(String[] args) {
      Ball b1 = new Ball("Blue"); // address 1
      Ball b2 = new Ball("Blue"); // address 2
      System.out.println(b1.equals(b2)); // true, @Override comparing the color, instead of memory address
      System.out.println(b1 == b2); // false, comparing the address
      System.out.println(b1); // [color=Blue], default call toString()
      System.out.println(b1); // [color=Blue]

    }
}

