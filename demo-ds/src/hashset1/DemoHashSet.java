package hashset1;

import java.util.HashSet;

public class DemoHashSet {
  
  public static void main(String[] args) {
    HashSet<String> strings = new HashSet<>();
    System.out.println(strings.add("abc")); // true
    System.out.println(strings.add("def")); // true
    System.out.println(strings.size()); // 2

    // HashSet - good at handling duplicate
    boolean result = strings.add("abc");
    System.out.println(strings.size()); // 2
    System.out.println(result); // false

    if (strings.add("def")) {
      System.out.println("def is added");
    } else {
      System.out.println("def is not added");
    }

    // Example 2:
    HashSet<Coordinate> coordinates = new HashSet<>();
    Coordinate c1 = new Coordinate(1, 1);
    Coordinate c2 = new Coordinate(1, 1);
    System.out.println(coordinates.add(c1)); // true
    System.out.println(coordinates.add(c2)); // false
    // HashSet add() -> Coordinates c2.equals(any of coordinates in HashSet)
    //               -> c2.equals(c1) -> true
    //               -> HashSet not allow duplicates
    //               -> return false
    System.out.println(coordinates.size()); // 1

    Coordinate c3 = new Coordinate(2, 1);
    System.out.println(coordinates.add(c3)); // true
    System.out.println(coordinates.size()); // 2

    // Example 3: Without Override equal() method
    HashSet<Book> books = new HashSet<>();
    System.out.println(books.add(new Book("Dummy","Eric"))); // true
    System.out.println(books.add(new Book("Dummy","Eric"))); // true, as 2 new Book instance would have different address, so can add
    System.out.println(books.add(new Book("Dummy","Steven"))); // true, different address
    System.out.println(books.size()); // 2
  }
}
