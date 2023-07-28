public class Revision {
  String name;

  public void print(String input) {
    System.out.println("hello " + this.name + input);
  }

  public static void print2(String input) {
    System.out.println("hello " + input);
  }
  public static void main(String[] args) {

    Revision r1 = new Revision();
    r1.name = "John";
    Revision r2 = new Revision();
    r2.name = "John";
    System.out.println(r1==r2); // false
    System.out.println(r1.name == r2.name); // true -> to .name level is String, literal pool

    r1.print("abc");
    print2("abc");

    r2.name = new String("John");
    System.out.println(r1.name == r2.name); // false, created new ball for "John"

    String s1 = "abc";
    String s2 = "abc";
    System.out.println(s1==s2); // true, literal pool

    String s3 = new String("abc");
    System.out.println(s1==s3); // false, force create new object even same value

    Integer i1 = 127;
    Integer i2 = 127;
    System.out.println(i1==i2); // true, internal cache
    Integer i3 = 128;
    Integer i4 = 128;
    System.out.println(i3==i4); // false, out of internal cache
  }
  
}
