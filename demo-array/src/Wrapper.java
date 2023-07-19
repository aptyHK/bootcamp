public class Wrapper {
  public static void main(String[] args) {
    // Primitive: byte, short, long, int, float, double, char, boolean
    // Wrapper Classes, corresponding primitive

    //boolean
    //Boolean
    boolean isMale = true; // isMale it is not an object
    Boolean isFemale = true; // isFemale it an object reference

    isMale = false;
    if (isMale) {
    }
    System.out.println(isFemale.compareTo(isMale)); // 1

    // isMale = null; // it won't work, primitive cannot be null
    isFemale = null; // can be true/false/null because Boolean is a class, it can be null
    
    int num = 2;
    Integer num2 = 4; // num2 is an object reference
    num2 = null; // again, num2 can be null becuase Integer is a class
    num2 = 100; // is an integer of 100
    String s = num2.toString();
    System.out.println(s); // is a String of 100
    Integer num3 = 4;
    if (num3.compareTo(3) > 0) {
      System.out.println("num3 is > 3");
    }

    char c = 'C';
    Character c2 = 'A';
    char result = Character.toLowerCase('B'); // static method
    System.out.println(result); // b
    Character c3 = Character.valueOf('s');
    Character c4 = 's';
    char c5 = c4;

  }
}
