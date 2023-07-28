import java.time.LocalDate;
import java.time.Month;

public class Birth {

  // * LocalDate start from java 8
  public static void main(String[] args) {
    LocalDate today = LocalDate.now(); 
    System.out.println(today); // 2023-07-28
    // LocalDate a = new LocalDate(2020, Month.FEBRUARY, 2);
    LocalDate specificDate = LocalDate.of(2400, Month.FEBRUARY, 29);
    System.out.println(specificDate);
    
    LocalDate d1 = LocalDate.parse("2023-12-30");
    System.out.println(d1.getYear()); // 2023
    System.out.println(d1.getMonth()); // DECEMBER
    System.out.println(d1.getMonth().getValue()); // 12
    System.out.println(d1.getDayOfMonth()); // 30
    System.out.println(d1.getDayOfWeek()); // SATURDAY
    System.out.println(d1.getDayOfWeek().getValue()); // 6
    System.out.println(d1.getDayOfYear()); // 364

    System.out.println(LocalDate.now().getDayOfWeek());
    System.out.println(LocalDate.parse("2023-07-30").getDayOfWeek().toString());

    System.out.println(d1.plusMonths(1L)); // 2024-01-30
    System.out.println(d1.plusDays(10)); // 2024-01-09
    System.out.println(d1.plusYears(2)); // 2025-12-30

    boolean expiry = false;
    LocalDate effectiveDate = LocalDate.of(2023, 2 ,20);
    if (LocalDate.now().isAfter(effectiveDate.plusMonths(3L))) {
      expiry = true;
    }
    System.out.println(expiry);
  }
}
