import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person implements Swimable {

  String name;

  public Person(String name) {
    this.name = name;
  }

  // lambda - only can use when implements functional interface
  // functional interface - interface that only have 1 method

  @Override
  public void swim() {
    System.out.println("Person is swimming");
  }

  @Override
  public String toString() {
    return "[name=" + this.name + "]";
  }

  public static void main(String[] args) {
    // Person person = new Person();
    // person.swim();

    // Lambda: You have to use "return", if you use {}
    Comparator<Person> sortByNameDesc = (Person p1, Person p2) ->
      p2.name.charAt(0) > p1.name.charAt(0) ? 1 : -1;
    List<Person> persons = 
      Arrays.asList(new Person("Alison"), new Person("Eric"));
    Collections.sort(persons, sortByNameDesc);
    System.out.println(persons);
    

    Swimable person1 = () -> System.out.println("Person 1 is swimming");
    person1.swim(); // Person 1 is swimming

    Swimable person2 = () -> {
      System.out.println("Person 2 starts to swim");
      System.out.println("Person 2 stop swimming");
    };    
    person2.swim(); // Person 2 is swimming
  }
}
