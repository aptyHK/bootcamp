package checked;

import java.util.Arrays;

// The good practice is:
// Only try catch something that you as a developer cannot control
// 

public class Student {
  String name;

  public Student() {
    
  }

  public Student(String name) {
    this.name = name;
  }

  public void setName(String name) throws NameToLongException {
    
    if (name.length() > 10)
      throw new NameToLongException("Name is too long (>50)");
    this.name = name;
  }

  public static void main(String[] args) {
    Student student = new Student("John");
    try {
      // checked exception
      System.out.println("abc");
      student.setName("Peter abc abc abc"); // if exception, throw it to the caller
    } catch (NameToLongException e) {
      System.out.println(e.getMessage());
      System.out.println("Name too long > 10");
    } catch (Exception e) { // null pointer, /0
      System.out.println(e.getMessage());
    } finally {
      System.out.println("finally");
    }

    Student student2 = new Student();
    //student2.name.length(); // null pointer, compile time can't check
    // If have problem is unchecked exception


    
  }
}

