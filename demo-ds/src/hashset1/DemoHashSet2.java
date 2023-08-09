package hashset1;

import java.util.HashSet;

public class DemoHashSet2 {
  public static void main(String[] args) {
    // Hashset Byte
    HashSet<Byte> bytes = new HashSet<>();
    bytes.add(bytes(4)); // int -> byte -> Byte // can't auto downcast int 4 to Byte, so use method to handle
    boolean isAdded10 = bytes.add(bytes(10)); // int -> byte -> Byte
    // Java is not necessary to handle return value
    boolean isAdded4 = bytes.add(bytes(4)); // false, already have 4, so can't put a 4 to the set again
    System.out.println(isAdded4);

    HashSet<Byte> bytes2 = new HashSet<>();
    bytes2.add(bytes(4));
    bytes2.add(bytes(10));
    System.out.println(bytes.equals(bytes2)); // not check address, check by element value
    // this is wrapper class .equals() // HashSet equals() -> Byte equals()
    // **try always use .equals() in all class when need compare element

    boolean isRemoved10 = bytes.remove(bytes(10));
    System.out.println(isRemoved10); // removed() returned true, and the method do removed 10 from bytes 
    
    bytes.clear();
    System.out.println(bytes.size()); // 0
  
  }

  public static Byte bytes(int num) {
    return Byte.valueOf((byte) num);
  }
}
