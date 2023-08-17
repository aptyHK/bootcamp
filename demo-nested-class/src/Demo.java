public class Demo {
  public static void main(String[] args) {
    Student student1 = new Student("Java");
    // Student.Bag bag = new Student.Bag();
    // // bag and student1 has no relationship

    // Bag bag2 = new Bag();
    // Bag bag3 = new Bag();
    // Bag bag4 = new Bag();

    System.out.println(student1.getSize());

    String[] words1 = new String[] {"b", "bb", "bbb"};
    String[] words2 = new String[] {"a", "aa", "aaa"};

    int shorterLength = Math.min(words1.length, words2.length);
    System.out.println(shorterLength);

    Computer computer1 = Computer.builder() //
    // .color(Color.BLACK) //
    // .cpu("Intel i9") //
    // .monitor("OLED") //
    // .ram(32) //
    // .instance() // 
    .build();
  }
}
