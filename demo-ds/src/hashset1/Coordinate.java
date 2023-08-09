package hashset1;

import java.util.Objects;

public class Coordinate {
  int x;
  int y;

  public Coordinate(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) 
      return true;
    if (!(o instanceof Coordinate))
      return false;
    Coordinate coordinate = (Coordinate) o;
    return this.x == coordinate.x
        && this.y == coordinate.y; 
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.x, this.y);
  }
  
  // *** Hashset check duplicate is base on your equals() method and hashCode() method
  // * you can test by hiding your hashCode() and equals() methods 
  // hashset add() implicitly call .equals() and hashCode(), if you write your own version, your own version will override
  // after applied override method as above, will check duplicate by address instead of coordinate
}
