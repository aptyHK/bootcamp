public class Person { // template, no execute function if only by its own

  // What is class? 
  // main is only a method to let the jvm read something
  // but java program does not need a main to survive

  // "public class Person" is a template to produce "Person"

  // Describe the person by attributes

  int age;
  char gender; // week 6 -> ENUM


  public boolean isMale() {
    if (this.gender == 'F') {
      return false;
    } 
    return true;
  }

  // static, if you don't need anything from "this", can just create a static method
  // static is a common area
  // non-static, when you use anything need "this", use non static
    public static boolean isMale(char gender) { // is just something you throw into the box. You did not check the gender from the object
    if (gender == 'F') { // just do by the the parameter you throw into the method, did not touch the object
      return false;
    } 
    return true;
  }

  public int getAge() {
    return this.age; // As this method did not have any input parameter, even though you don't know to mention this to refer to the age of the object in the heap, but would be a mis-representation without this
  }

  public void setAge(int age) {
    this.age = age; // would amend the age varible on the appointed object
  }

  public void setGender(char gen) {
    this.gender = gen;
  }

    public char getGender() {
    return this.gender;
  }

  // and can be many etc. e.g. height, weight ....

  public static void main(String[] args) { // main is not belong to person
    String s = "abc"; // new an object in heap
    String s1 = new String("abc"); // new an object in heap
    // ^ above 2 line are exact the same effect, but for String java skipped the step to require develop to put new
    String s3 = String.valueOf("abcde"); // new an object in heap
    // Behind all the convinient, they always do ***new String*** on the machine
    
    Boolean b = new Boolean("true"); // new object in heap
    Boolean b2 = Boolean.valueOf("false"); // new object in heap
    Boolean b3 = true; // auto-box // new object in heap
    
    // When you try to create a Person()
    // jvm will check the class exist or not first
    // the assign the dedicate value to the object
    Person p = new Person(); // Produce empty person object with default value
    Person p2 = new Person(); // Produce empty person object with default value

    p.setAge(13); // take object p, and execute with your defined method
    p.setGender('F');

    System.out.println(p.age);
    System.out.println(p.getAge());

    System.out.println(p.isMale()); // non-static
    System.out.println(isMale('F')); // static with fix input
    System.out.println(isMale(p.getGender())); // static with get gender from p
    System.out.println(Person.isMale(p.getGender())); // same but add class name when call static method
    
    Computer c1 = new Computer("Yellow"); // Computer() -> empty constructor
    // can access Computer class even in the main of Person
    // because Computer class has set to public
    System.out.println(c1.getColor());

    Computer c2 = new Computer(128, 3.5, "Blue");
    c2.printSpec();
  }
  
}

// Template <------------------------------------------------------------> Memory
// Template <------------ Just a template, memory still empty if no other command
// when create new object with the class, would appear on ---------------> Memory