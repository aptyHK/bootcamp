public class Student {

  private String firstName;
  private String lastName;
  private int age;

  // All-argument constructor -> new object (instance)
  public Student(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  } // If I don't want people create empty student, we don't need to create empty constructor

  public String fullName() {
    return this.firstName.concat(" ").concat(this.lastName); // p.s. because firstName is String, so can use String method concat
  }

  public boolean isAdult() {
    if (this.age >= 18) {
      return true;
    }
    return false;
  }

  // Behaviors / Methods

  // *** I can design my own way to let outsider retrieve certain data
  // e.g. if I only want people see student full name  
  // I don't need to create get setter for first name last name

  // public String getFirstName() {
  //   return this.firstName;
  // }

  // public void setFirstName(String firstName) {
  //   this.firstName = firstName;
  // }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
