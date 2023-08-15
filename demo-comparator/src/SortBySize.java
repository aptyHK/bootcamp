import java.util.Comparator;

public class SortBySize implements Comparator<Paper> {
  
  @Override 
  public int compare(Paper o1, Paper o2) {
    return o2.size > o1.size ? 1 : -1;
  }

  // compare had been use on Card.java
  // but the attribute is at parent Paper.java
  // default Comparator<T> thenComparing(Comparator<? super T> other) {
  // the above line in the Comparator<T> class allow check its and any of its child class inside the <> 
}
