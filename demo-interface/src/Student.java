public class Student extends GameMember implements Runnable, Swimable, Move { // class signature

  private String name;
  int score = 0;

  // @Override
  // public void breath() {

  // }

  @Override
  public void bigJump() {
    
  }

  @Override
  public void run() {
    System.out.println("Student is running");
  }

  @Override
  public void swim() {
    System.out.println("Student is swimming");
  }

  @Override
  public void jump() {
    super.addScore(3);
  }

  // @Override
  // public void up() {
  //   this.score += 1;
  // }

  // @Override
  // public void down() {

  // }

  // @Override
  // public void left() {

  // }

  // @Override
  // public void right() {

  // }

  public static void main(String[] args) {
    Student s1 = new Student();
    System.out.println(Move.MAX_SPEED);

    // (After java 8) can assign new object to interface class
    Move student = new Student();
    // even the object actually is student
    // but method you can call now just base on the Move interface class
    student.jump();
    // student.down();
    // student.left();
    // student.right();
    System.out.println();

    Move dog = new Dog();
    dog.jump();
    // dog.down();
    // dog.left();
    // dog.right();

    Swimable swimable = new Student();
    swimable.swim();

    // Same for abstract class
    // Person person = new Student();
    // person.breath();
    // person.getAge();
  }
}

// The naming and method design for interface file is important

// e.g. Person.java <- void run() // this student is person, Not taht meaningful when implements
// Runnable.java <- void run // this student is runnable, which can already guess what has been implement

// suppose the design for interface should be as small as possible
// (of course need to be fulfill all necessary responsibilty)
