package hashmap1;

import java.util.Objects;

public class Author {
  String name;
  int age; 

  public Author(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public boolean equals(Object o) {
    // System.out.println("Using override equals()");
    if (this == o)
      return true;
    if (!(o instanceof Author))
      return false;
    Author author = (Author) o;
    return Objects.equals(this.name, author.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name);
  }
}
