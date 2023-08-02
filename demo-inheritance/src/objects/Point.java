package objects;

import java.util.Objects;

public class Point {
  private int x;
  private int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public static void print(Long l) {
    System.out.println(l);
  }

  public static String toString(Point point) {
    return "[x=" + point.x + ", y=" + point.y + "]";
  }

  @Override
  public String toString() {
    return "[x=" + this.x + ", y=" + this.y + "]";
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.x, this.y);
  }

  @Override
  public boolean equals(Object obj) {

    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Point)) {
      return false;
    }
    Point p = (Point) obj;
    //return p.x == this.x && p.y == this.y;
    return Objects.equals(p.x, this.x)
    && Objects.equals(p.y, this.y);
    // 1 very big adventage of Objects.equals is it can check null
  }


  public static void main(String[] args) {
    Point p1 = new Point(1, 1);
    Point p2 = new Point(1, 1);
    Point p3 = new Point(1, 2);
    System.out.println(p1 == p2); // false, address
    System.out.println(p1.equals(p2)); // true, x & y
    System.out.println(p1.equals(p3)); // false, x & y

    System.out.println(p1); // [x=1, y=1]
    System.out.println(p1.toString()); // [x=1, y=1]
    System.out.println(Point.toString(p3)); // [x=1, y=2], static method version of toString()

    Long l = 1L; // 1, unbox -> primitive long
    int i = 1; // 1, auto-box -> Integer
    long j = 1L;
    Point.print(10L); // long -> autobox -> Long
    Point.print(Long.valueOf("10")); // Long object
    // Point.print(10); // cannot convert int to Long,complie error
    Point.print((long) 10); // int -> long -> autobox -> Long

    if (Long.valueOf("100") < 101) {
      // convert Long 100 -> long 100
      // 101 -> int
    }

    if (Boolean.valueOf(false) == false) {
      // right: false -> boolean
      // left: Boolean false -> boolean false
      // boolean vs boolean
    }

    if (Boolean.valueOf(false).equals(false)) {
      // right: false -> boolean
      // left: Boolean false -> boolean false
      // boolean vs boolean
    }

    // unbox Long, and upcast int
    System.out.println(l == i); // true, finally long vs int

    //****Big bug here
    System.out.println(Objects.equals(l, i)); // false, cannot convert int to Long??
    // the bug is: 1 cannot compare 1

    //   public boolean equals(Object obj) {
    //     if (obj instanceof Long) {
    //         return value == ((Long)obj).longValue();
    //     }
    //     return false;
    // }
    
  }
}
