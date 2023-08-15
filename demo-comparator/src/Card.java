import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Card extends Paper {
  
  int number;

  public Card(int size, int number) {
    super(size);
    this.number = number; 
  }

  @Override
  public String toString() {
    return "[number=" + this.number //
        + ", size=" + super.size // 
        + "]";
  }

  public static void main(String[] args) {
    List<Card> cards = Arrays.asList(new Card(1, 2), new Card(4, 3));
    // Arrays.asList is just a "list", not either ArrayList or LinkedList, it cannot use add()
    Collections.sort(cards, new SortBySize()); // Attribute at the parent
    System.out.println(cards);

    List<? extends Number> numbers = new ArrayList<Integer>();

    // <? ...> the ? call wild card

    // when have <>, cannot simply do polymophism
    // e.g.
    // List<Number> numbers = new ArrayList<Integer>();
    numbers = new ArrayList<Double>();
    // which can be solve by List<? extends Number>

    // numbers.add(1); // At compile-time, type-safty issue
    // numbers.add(1.0d); // At compile-time, type-safty issue

    // for simply wrapper class varible, no such limit
    // Number number = new Integer(10); // polymophism
    // number = new Doule(2.0d); // polymophism
  }
}
