import java.math.BigDecimal;
import java.math.RoundingMode;

public class DoubleProblem {

  public static void main(String[] args) {
    
    double result = 0.1 + 0.2;
    System.out.println(result); // 0.30000000000000004

    // Solution:
    BigDecimal b =new BigDecimal(5);
    BigDecimal b2 = BigDecimal.valueOf(4);
    // BigDecimal b3 = 5.0; // Not OK
    Double d = 5.0d;
    System.out.println(b.multiply(b)); // 25
    System.out.println(b.subtract(b2)); // 1
    System.out.println(b.add(b)); // 10
    System.out.println(b.divide(b)); // 1
    System.out.println(b.add(new BigDecimal(7))); // 12

    System.out.println(b.compareTo(b2) == 1); // b is larger than b2, 1 
    System.out.println(b2.compareTo(b) == 1); // b2 is samller than b, return 0
    System.out.println(b.compareTo(BigDecimal.valueOf(5))); // they are same, return 0

    System.out.println(b.divide(b2)); // 1.25
    System.out.println(BigDecimal.valueOf(0.1).add(BigDecimal.valueOf(0.2))); // 0.3

    BigDecimal b3 = BigDecimal.valueOf(3.456);
    System.out.println(b3.setScale(2, RoundingMode.UP)); // 3.46
    System.out.println(b3.setScale(2, RoundingMode.DOWN)); // 3.45

    System.out.println(b.equals(b2)); // 5 != 4 -> false
    BigDecimal b4 = BigDecimal.valueOf(5);
    System.out.println(b.equals(b4)); // true
    System.out.println(b == b4); // false, only compare the reference
    System.out.println(b4.remainder(BigDecimal.valueOf(3)));
    System.out.println(b4.remainder(BigDecimal.valueOf(3));
    // new decimal do not apply internal cache theory
    // can simply treat it as a normal class
  
  }
}
