package Abstract;

public class Student extends Adult {
 
// extend situation 1:
// if I want to end the abstract chain
// To implement an abstract class, must:
// implement all the abstract method in the class
// put extends (the abstract class)

  public Student() {
    super();
  } // this part is default done, unless not empty;


  // Must implement the abstract method
  public void sleep() {
    System.out.println("I am student, sleeping");
  }

  public void read() {
    System.out.println("I am student, reading");
  }

  public static void main(String[] args) {
    Student student = new Student();
    student.sleep(); // on Student
    student.read(); // on Student
    student.run(); // on Person
    student.eat(); // on Adult
    student.getAge(); // 0, adult.getAge -> person.getAge
  }
}
