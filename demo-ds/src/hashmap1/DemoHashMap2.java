package hashmap1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import hashset1.Book;

public class DemoHashMap2 {
  public static void main(String[] args) {
    HashMap<Integer, Book> books = new HashMap<>();
    // key = Address of Integer or value of Integer?
    books.put(Integer.valueOf(128), new Book("Dummy","Eric"));
    // Wrapper class Integer already handle .equals and .hashCode()
    System.out.println(books.size()); // 1, as Wrapper class Integer already handle .equals and .hashCode(), as long as the value of the key is same, then is same

    HashMap<Author, Book> bookMap = new HashMap<>();
    // Author unique key? -> equals(), hashCode()
    Author author1 = new Author("John", 30);
    Author author2 = new Author("John", 29);
    bookMap.put(author1, new Book("Dummy","Book3"));
    bookMap.put(author2, new Book("Dummy","Book4"));
    System.out.println(bookMap.size()); // 1, I only set name is equal then they are same author, but it do not make sense
    // *** Suppose whole thing is not make sense
    // Author author1 = new Author("John", 30);
    // Author author2 = new Author("John", 29);
    // Suppose above author 1 and 2 are different person, as their age is different, they just have the same name
    // because the equals() and hashCode() that we wrote, when author have same name, they are equals
    // then bookMap.size() still remain 1 as author2 cannot add as a new key -> new entry


    HashMap<Author, ArrayList<Book>> bookMap2 = new HashMap<>();
    ArrayList<Book> booklist1 = new ArrayList<>();
    booklist1.add(new Book("Dummy","Book1"));
    booklist1.add(new Book("Dummy","Book2"));
    ArrayList<Book> booklist2 = new ArrayList<>();
    booklist2.add(new Book("Dummy","Book3"));
    booklist2.add(new Book("Dummy","Book4"));

    bookMap2.put(author1, booklist1);
    bookMap2.put(author2, booklist2);

    // Loop bookMap2, print out all the books from each Author
    for (Map.Entry<Author, ArrayList<Book>> entry : bookMap2.entrySet()) {
      // System.out.println(author.getKey().name)
      for (Book book : entry.getValue()) {
        System.out.println("Author name: " + entry.getKey().name //
        + ", Book Name " + book.getName());
      }
    }
    
    for (Book book : bookMap2.get(new Author("John", 0))) {
      System.out.println(book);
    }

    HashMap<Integer, Integer> hMap = new HashMap<>();
    hMap.put(1, 1);
    System.out.println(hMap.put(1, 1));
    System.out.println(hMap.put(1, 1));
  }
}
