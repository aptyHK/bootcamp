package math;

import java.time.LocalDate;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
  public static void main(String[] args) throws Exception {
    Predicate<Character> isMale = c -> c == 'M';
    System.out.println(isMale.test('F')); // false
    Predicate<String> isUpperCase = s -> {
      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) < 65 || s.charAt(i) > 92)
          return false;
      }
      return true;
    };

    BiPredicate<String,String> equals = (s1, s2) -> 
      s1 != null && s1.equals(s2);

    // tester
    test(isMale, 'F', false);
    test(isMale, 'M', true);
    test(isUpperCase, "ABcaD", false);
    test(isUpperCase, "ABCDD", true);
    test(isUpperCase, "", true);

    test(equals, "abc", "abc", true);
    test(equals, "Cde", "CDE", false);
    test(equals, null, null, false);
    test(equals, "", null, false);
    test(equals, null, "", false);

    Predicate<LocalDate> isCoolingOff = 
        effDate -> effDate.plusMonths(1).isAfter(LocalDate.now());
        // check is the inserted date 1 month or more later than now

    test(isCoolingOff, LocalDate.of(2023, 7, 16), false);
    test(isCoolingOff, LocalDate.of(2023, 7, 18), true);

    String str = "1234567";
    int[] nums = (int[]) (str.toCharArray());
  }

  public static <T> void test(Predicate<T> testcase, T data,
      boolean expectedResult) throws Exception {
    if (testcase.test(data) != expectedResult)
      throw new Exception();
  }

  public static <T, U> void test(BiPredicate<T, U> testcase, T data, U data2,
      boolean expectedResult) throws Exception {
    if (testcase.test(data, data2) == expectedResult)
        return;
    throw new Exception();
  }
}
