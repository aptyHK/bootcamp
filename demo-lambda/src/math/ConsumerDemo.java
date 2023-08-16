package math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import javax.naming.LinkException;

public class ConsumerDemo {
  public static void main(String[] args) {
    Consumer<String> consumer = str -> System.out.println(str);
    // void accept(T t);
    consumer.accept("I love java");

    BiConsumer<String, String> biConsumer =
        (s1, s2) -> System.out.println(s1 + s2);
    biConsumer.accept("abc", "def");

    // Example
    List<String> strings = new ArrayList<>();
    strings.add("dog");
    strings.add("cat");
    strings.add("cow");
    strings.forEach(s -> System.out.println(s));
    int f = 8;
    strings.forEach(s -> {
      int i = 0;
      int a = 0;
      int total = i + a + f;
      if (i < 1)
        System.out.println(s);
    });

    Map<String, Integer> map = new HashMap<>();
    map.put("orange", 3);
    map.put("lemon", 2);
    map.put("watermelon", 10);
    map.forEach((key, value) -> {
      if ("lemon".equals(key))
        System.out.println(value);
    });

    Integer[] arr = new Integer[]{1, 2, 3, 4, 5};
    List<Integer> arrlist = new LinkedList<>(Arrays.asList(arr));
    arrlist.forEach(s -> {
      if (s > 1)
        System.out.println(s);  
    });
  }
}
