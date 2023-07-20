public class Wrapper2 {
  public static void main(String[] args) {
    // even though you always told that Java is strong type dependent, but there are some exeception:
    // e.g. upcasting, wrapper class's auto boxing

    // auto-boxing
    int i1 = 10;
    Integer i2 = 10; // auto-boxing
    Integer i3 = Integer.valueOf(10);

    int i4 = i2; // un-boxing

    char c = 'a';
    Character c2 = c;
    char c3 = c2;

    long l4 = 100; // int -> long, an upcast
    Long l = 10L; // long -> Long, need to put L
    // long l10 = 10; // int -> Long (error)
    long l2 = l; // un-boxing
    Long l3 = l2; // upcasting long l2 -> Long l3
  }
}