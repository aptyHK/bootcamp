import java.util.List;

public class Student {
  String name;
  // constructor, getter, setter. static methpd & variable
  Bag bag;


  public Student(String name) {
    this.name = name;
    bag = new Student.Bag();
  }

  // method -> Bag.method, instance variable
  public int getSize() {
    return this.bag.getSize();
  }

  public void clearBag() {
    // Outer class access "static nested class" static method
    Bag.clear(this.bag);
  }

  public static void printHello() {
    System.out.println("Student hello first, then -> ");
    Grade.printHello();
  }

  @Override
  public String toString() {
    return "Student[name=" + this.name //
        + ", Bag[" + this.bag + "]" //
        + "]";
  }

  // Static nested class
  // Cannot Access Outer class Attribute
  private static class Bag {
    // Bag and Student are two different things
    //
    int size;
    List<String> strings;

    // constructor
    // getter, setter
    // static methpd & variable
    public int getSize() {
      return this.size;
    }

    public static void clear(Bag bag) {
      bag.strings.clear();
    }

    @Override
    public String toString() {
      return "Bag[size=" + this.size //
          + ", strings[" + this.strings + "]" //
          + "]";
    }
  }

  // Inner class (non-static nested class)
  public class Grade {

    private int score;

    public char getGrade() {
      switch (this.score) {
        case 90:
          return 'A';
        case 80:
          return 'B';
        case 70:
          return 'C';
        default:
          return 'F';
      }
    }

    public Grade(int score) {
      this.score = score;
    }

    public void printStudentGrade() {
      System.out.println(Grade.this.getGrade());
    }

    public static void printHello() {
      System.out.println("Grade print Hello");
    }
  }

  public static void main(String[] args) {
    Student student = new Student("John");
    Student.Grade grade = student.new Grade(70);
    grade.printStudentGrade();
    Student.printHello();
    System.out.println(student.toString());
  }
}

