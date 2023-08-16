package math;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {
  public static void main(String[] args) {

    // Function, 1 in 1 out

    Function<String, Integer> lengthFunc = str -> str.length(); // return Integer
    Function<String, Character> firstCharFunc = str -> str.charAt(0);
    
    // With Lambda
    System.out.println(lengthFunc.apply("Andy")); // 4
    // Without Lambda
    LengthFunction lengthFunction = new LengthFunction();
    System.out.println(lengthFunction.apply("Andy")); // 4

    // Function example in Map
    Map<String, String> map = new HashMap<>();
    map.put("abc", "Mary");
    //Function<String, String> formula = s -> "default";
    //String result = map.computeIfAbsent("abc", formula);
    String result = map.computeIfAbsent("abc", s -> "default");
    System.out.println(result);
    result = map.computeIfAbsent("cde", s -> "testing");
    System.out.println(result);
    System.out.println(map.computeIfAbsent("abc", s -> "Mary"));
    System.out.println(map.size()); // 2
    // computeIfAbsent() is find the key, if no such key, put to the map
    System.out.println(map.get("cde"));

    // BiFunction
    BiFunction<Integer, Integer, BigDecimal> addition = (x, y) -> BigDecimal.valueOf(x + y); 
    System.out.println(addition.apply(-4, 3).abs()); // 1
    
    // compute() -> have then replace value, no then put 
    Map<String, Integer> stock = new HashMap<>();
    stock.put("clothes", 100); //

    stock.compute("clothes",
        (item, oldPrice) -> (int) (oldPrice - oldPrice * 0.1));
        System.out.println(stock.get("clothes")); // 90
    
    // new value: null, remove item
    stock.compute("clothes", (item, oldPrice) -> null);
    System.out.println(stock.size()); // 0

    // 
    stock.compute("shoes", (item, oldPrice) -> 120);
    System.out.println(stock.get("shoes")); // 120

  }
}
