import java.util.Comparator;

public class SortByColor implements Comparator<Ball> {

  @Override
  public int compare(Ball b1, Ball b2) {
    // return b2.color.id < b1.color.id ? 1 : -1;
    if (b1.getColor() == Color.YELLOW && b2.getColor() == Color.YELLOW)
      return b2.id < b1.id ? 1 : -1;

    if (b1.getColor() == Color.YELLOW || b2.getColor() == Color.YELLOW)
      return b2.getColor() == Color.YELLOW ? 1 : -1;

    if (b1.getColor() != Color.YELLOW && b2.getColor() != Color.YELLOW)
      return b2.id > b1.id ? 1 : -1;

    return 1;
  }
}
