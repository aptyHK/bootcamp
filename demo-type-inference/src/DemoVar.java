import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoVar {
  public static void main(String[] args) {
    var s = "Hello";
    // s = 3; // error, compile-check -> String
    var i = 2;
    var c = 'a';

    // Loop
    List<String> strings = Arrays.asList("abc", "def");
    for (var str : strings) {
      System.out.println(str);
    }

    Map<String, Integer> map = new HashMap<>();
    map.put("a", 1);
    map.put("b", 2);
    for (var entry : map.entrySet()) { // var at here = Map.Entry<String, Integer>
      System.out.println(entry.getKey() + " " + entry.getValue());
    }
  }
}
