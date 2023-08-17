import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class DemoOptional {
  public static void main(String[] args) throws Exception {
    List<Book> books = new ArrayList<>();
    books.add(new Book("John"));
    books.add(new Book("Mary"));
    books.add(new Book("Peter"));
    // books.add(new Book("Tommy"));

    Optional<Book> book = books.stream() //
        .filter(b -> b.author.startsWith("T")) // filter all book with author startswith "T"
        .findAny(); //

    book.ifPresent(e -> {
      System.out.println("hello"); // do somthing if book is not null
    });
    book.ifPresent(e -> System.out.println(book.get().author));

    if (book.isPresent()) {
      System.out.println(book.get());
    } else {
      System.out.println("Book not found");
    }

    Optional<Book> book2 = Optional.of(new Book("Eric")); // can use of to create
    // Optional<Book> book3 = Optional.of(null); // if put null, no compile error but runtime error NullPointerException
    Optional<Book> book4 = Optional.ofNullable(null);
    System.out.println(book4.isPresent());
    Optional<Book> book5 = Optional.ofNullable(new Book("Jenny"));
    Optional<Book> book6 = Optional.empty(); // is not null, has the object but no book
    System.out.println(book6.isPresent()); // false
    Optional<Book> book7 = null;
    System.out.println(book4); // Optional.empty();
    System.out.println(book7 == null); // true

    // Optional<Book> -> Book
    Book newBook = book6.orElse(new Book("Default")); // book6 "MAY BE" no value, may be not, it is null, do statement on Else -> new Book
    Book newBook2 = book5.orElse(new Book("Default")); // book5 is not null, assign book5 to newBook2
    Book newBook3 = book6.orElse(null);
    Book newBook4 = book6.orElseGet(() -> new Book("Default Else Get"));
    // Book newBook5 = book6.orElseThrow(() -> new Exception());
    // newBook3 = book6.orElse(new Book ("Default"));
    System.out.println(newBook3);
    System.out.println(newBook.author);
    System.out.println(newBook2.author);

  }

  // *** Optional is use to avoid null pointer ***
  // ***Optional only good at use as return type
  // assume put optional as input parameter of a method
  // no metter use Book or Optional<Book>
  // You still have to do null checking in the method
  // When use as a return type, it is already protected while the other person unbox the Optional

  public static Optional<Book> getBook() {
    // get book login ...
    return Optional.empty(); // when other develop get the return value, he can just ue ifPresent so he does not call would it return null or not
  }

}
