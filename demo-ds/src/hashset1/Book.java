package hashset1;

public class Book {

  private String author;
  private String name;
  
  public Book(String author, String name) {
    this.name = name;
    this.author = author;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public String toString() {
    return "[author=" + this.author + ", book name=" //
    + this.name + "]";
  }
}
