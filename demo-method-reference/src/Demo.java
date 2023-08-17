import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Demo {
  public static void main(String[] args) throws Exception {
    Consumer<String> sysout = s -> System.out.println(s);
    Consumer<String> sysout2 = System.out::println; // static method, consume string 
    // line in line 5, if both are s, can do as method reference (line 6)
    // method reference need to consume string
    // method reference :: is also a lambda

    Arrays.asList("abc", "def").forEach(sysout2); // abc def

    String name = "john";
    Supplier<Integer> strLength = () -> name.length();
    Supplier<Integer> strLength2 = name::length;

    List<String> words = Arrays.asList("apple", "banana", "orange"); 
    Comparator<String> compare = (s1, s2) -> s2.compareTo(s1);
    Comparator<String> compare2 = String::compareTo; // instanace method, consume string 

    Function<String, Integer> stringToInteger = str -> Integer.valueOf(str);
    Function<String, Integer> stringToInteger2 = Integer::valueOf; // consume string 
  }
}
