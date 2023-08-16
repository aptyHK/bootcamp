import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class DemoArrayList {
  public static void main(String[] args) {
    List<String> strings = new ArrayList<>();
    strings.add("abc");
    strings.add("ghi");
    strings.add("accs");
    strings.add("def");

    // for-each
    for (String s : strings) {
      System.out.println(s);
    }
    // stream
    Stream<String> streamstrings = strings.stream();
    // Filtering - rookie version
    streamstrings = streamstrings.filter(s -> s.startsWith("a"));
    streamstrings.forEach(s -> System.out.println(s)); // abc accs
    // Filtering - normal version
    strings.stream() //
        .filter(s -> s.endsWith("i")) //
        .forEach(s -> System.out.println(s));

    List<String> strings2 = strings.stream() //
        .filter(s -> s.length() == 3) //
        .collect(Collectors.toList()); // turn stream back to list

    System.out.println(strings2.size()); // 3

    List<Integer> lengths = strings2.stream() //
        .filter(e -> e.startsWith("a") || e.startsWith("d"))
        .map(e -> e.length()) // Stream<Integer>
        .collect(Collectors.toList());

    lengths.forEach(e -> System.out.println(e)); // 3 3

    strings2 = strings2.stream() //
        .sorted((s1, s2) -> s2.compareTo(s1)) // decending order
        .collect(Collectors.toList());
    System.out.println(strings2);

    strings2 = strings2.stream() //
        .sorted() // Natural order, asscending
        .collect(Collectors.toList());
    System.out.println(strings2);

    boolean result = strings2.stream() //
        .anyMatch(e -> e.startsWith("a"));
    System.out.println(result);

    if (strings2.stream().anyMatch(e -> e.startsWith("a")))
      System.out.println("One of the match start with a");

    // interminate operations of Stream:
    // filter(), map(), sorted(), anyMatch()

    // terminated operations of Stream;
    // Collect(), forEach()

    // Stream can only terminate once,
    // but it may have multiple interminate operation

    List<Person> persons = 
        Arrays.asList(new Person("John", 30), new Person("Mary", 25));
    // stream -> get all the ages from persons
    List<Integer> peopleAge = persons.stream()
        .map(s -> s.age)
        .collect(Collectors.toList());
    System.out.println(peopleAge);

    List<String> lookForJohn = persons.stream()
        .map(s -> {
          String word = " words ...";
          return s.name + word;
        })
        .collect(Collectors.toList());
    System.out.println(lookForJohn.stream().filter(e -> e.startsWith("John")).count()); // 1

    long l = Stream.of("abc", "defz", "ghivv", "abc") //
        .filter(e -> e.length() == 3)
        .distinct()
        .count(); // 1
    System.out.println(l); // 1

    long l2 = Stream.of(1, 2, 3, 4)//("aaa", "bbb", "ccc")//1, 2, 3, 4) // 
        .map(e -> {
          System.out.println("a");
          // System.out.println(e); // why no print?
          // return e;
        }).count();
    System.out.println(l2); // 4
  }
}
