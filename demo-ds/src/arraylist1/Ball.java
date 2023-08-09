package arraylist1;

import java.util.Objects;
import java.util.Random;

public class Ball {
  private int id;
  private Color color;
  private static int idCounter = 0;

  public Ball(Color color) {
    this.id = ++idCounter;
    this.color = color;
  }

  public int getScore() {
    return this.color.getScore();
  }

  public int getId() {
    return this.id;
  }

  public static Ball random() {
    // Get Random color
    int random = new Random().nextInt(3);
    Color color = Color.getColor(random);
    return new Ball(color);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Ball))
      return false;
    Ball b = (Ball) o;
    return this.id == b.id //
        && this.color == b.color;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.color);
  }

  @Override
  public String toString() {
    return "[" + //
        "id=" + this.id + " color=" + this.color.name() + " " + this.color.getScore() + "]";
  }

  // *** which parameter you used to compare at equals(), should put the same things on hashCode() too
  // it return an unique code base on the parameter input
}
