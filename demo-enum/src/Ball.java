import java.util.Objects;

public class Ball {
  Color color; // if not use ENUM and use String instead, may be will have human input like R ED rED etc.

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
    return this.color == b.color);
  }

  public static void main(String[] args) {
    Ball ball = new Ball(Color.RED);
    System.out.println(ball.getColor().name());
  }
}
