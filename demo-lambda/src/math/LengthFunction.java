package math;

import java.util.function.Function;

public class LengthFunction implements Function<String, Integer> {
  
  public Integer apply(String str) {
    return str.length();
  }
}
