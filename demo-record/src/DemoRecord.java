import java.util.HashSet;
import java.util.Set;

public class DemoRecord {
    public static void main(String[] args) throws Exception {
        Person person = new Person("John", 30);
        Person1 person1 = new Person1("John", 30);
        Person1 anotherPerson = new Person1("John", 30);

        System.out.println(person.getName());
        System.out.println(person1.name());

        System.out.println(person.getAge());
        System.out.println(person1.age());

        System.out.println(person1.equals(anotherPerson)); // true
        System.out.println(person1); // Person1[name=John, age=30], already override the object toString

        // HashMap, Set -> equals(), hashCode
        Set<Person1> set = new HashSet<>();
        set.add(person1);
        System.out.println(set.add(anotherPerson)); // false
    }
}
