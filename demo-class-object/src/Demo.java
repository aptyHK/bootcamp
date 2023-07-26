public class Demo {
  
  public static void main(String[] args) {
    Car car = new Car();
    Person person = new Person(); // Use constructor Person() to construct a person
    Computer computer = new Computer();

    Car car2 = new Car(4, 80, "Blue");

    // print 3 value of car 2:
    System.out.println("No of wheel="+car2.getNoOfWheel());
    System.out.println("Capacity="+car2.getCapacity());
    System.out.println("Color="+car2.getColor());

    car2.setColor("Yellow"); // car2 is just a object reference, storing the address only but not the value inside car2
    car.setColor("Blue");
    // car2 -> Yellow
    // car -> Blue
    //System.out.println(car2); // Car@24d46ca6 -> when you sout car2, it will print the object reference
    //System.out.println(car2);
    car2 = new Car(3, 4, "Black"); //???? What happened?
    //System.out.println(car2); // Car@4517d9a3

    CarFactory carFactory = new CarFactory();
    carFactory.changeColor(car2, "WHITE");
    System.out.println(car2.getColor());

    
    // Below 2 are the same. Oracle just skipped some steps for to let user feel convenience:
    String str = new String("Hello");
    String str2 = "Hello";
    // str is the object reference
    // but whwn you print the String, it give you the value hello directly????
    // ***Becuase it do not limit to premitive class / wrapper class 

    Student s1 = new Student("Andy", "Yip", 18);
    System.out.println(s1.fullName()); // Andy Yip
  }
}
