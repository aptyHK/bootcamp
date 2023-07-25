public class Integer3 {

  // Internal Cache (-128 to 127)
  public static void main(String[] args) {
    Integer i1 = 100;
    Integer i2 = 100;
    System.out.println(i1 == i2); // address, true

    Integer i3 = 128;
    Integer i4 = 128;
    System.out.println(i3 == i4); // address, false

    if (i3 == 1) { // in the if, int (wrapper class Integer ver.) -> int (primitive)

    }

    i3 = 127;
    i4 = 127;
    System.out.println(i3 == i4); // address, true

    Integer i5 = -128;
    Integer i6 = -128;
    System.out.println(i5 == i6); // address, true

    //Byte b1 = new Byte(null);
    Byte b1 = 127;
    //Byte b2 = new Byte(127); // destroy internal cache
    Byte b2 = 127;
    // Byte only have 256 object (-128 to 127)
    // Java would not allow you to create new Byte ball
    // Because it will destroy the mecahnism of internal cache

    // short, long
    Short s1 = 100;
    Short s2 = 100;
    System.out.println(s1 == s2); // true, same address

    Long l1 = 100l;
    Long l2 = 100l;
    System.out.println(l1 == l2); // true, same address

    Double d1 = 100.0d;
    Double d2 = 100.0d;
    System.out.println(d1 == d2); // false, float and double no cache

    Character c1 = 'a'; // At ASCII 97
    Character c2 = 'a';
    Character c3 = 'Ϩ'; // At ASCII 1000
    Character c4 = 'Ϩ'; 
    System.out.println(c1 == c2); // true, same address
    System.out.println(c3 == c4); // false

    Boolean bo1 = true;
    Boolean bo2 = true;
    System.out.println(bo1 == bo2); // true, boolean true is 1, 1 is in internal cache, same address

    Integer i7 = Integer.valueOf(127); // 127, would consider internal cache
    Integer i8 = 127;
    System.out.println(i7 == i8);

    Integer i9 = Integer.valueOf(128); // 127, would consider internal cache
    Integer i10 = 128;
    System.out.println(i9 == i10); // 

  }
}
