package math;

import java.util.function.Function;

@FunctionalInterface
public interface SuperFunction<T, S, U, R> {

  R apply (T t, S s, U u);
  
}
