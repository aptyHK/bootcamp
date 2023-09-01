import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        // One Table -> Many Records (where age > 60's person)
        // here we will get many person with age > 60
        System.out.println(getFromDb("Lau".toString()));
        // result: [Person(name=Eric Lau), Person(name=Peter Lau)]
        System.out.println(getFromDb("Chan".toString()));
        // result: [Person(name=John Chan)]

        // flatMap()
        List<String> addresses = new ArrayList<>();
        addresses.add("Hong Kong");
        addresses.add("Mainland");
        addresses.add("Japan");
        Person9 p1 = new Person9("Ann", addresses);

        List<String> addresses2 = new ArrayList<>();
        addresses2.add("Hong Kong");
        addresses2.add("US");
        Person9 p2 = new Person9("Betty", addresses);

        List<Person9> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        // return all addresses (List<String>) from List<Person>
        System.out.println(getAllAddress(persons));
        // if only use map, it will for each a person
        // cannot put list<String> addresses to a list and put to a list to return
        // so need to use flatmap to 
        System.out.println(getAllName(persons));
        // map, for each a element, collect all elements to the list
        // return the list<String>

        // filter + map
        List<String> names = new ArrayList<>();
        for (Person9 p : persons) {
            names.add(p.getName());
        }
        System.out.println(names);

        // map vs flatmap
        // map handle single element
        // flatmap handle element need to unbox (like list<>)
    }

    public static List<String> getAllAddress(List<Person9> persons) {
        return persons.stream() //
                .flatMap(person -> person.getaddresses().stream())
                .collect(Collectors.toList());
    }

    public static List<String> getAllName(List<Person9> persons) {
        return persons.stream() //
                .map(person -> {return person.getName();})
                .collect(Collectors.toList());
    }

    // public static List<String> getFullName(String lastName) {

    // }

    public static List<Person> getFromDb(String lastName) {
        // List of Person
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John Chan"));
        persons.add(new Person("Eric Lau"));
        persons.add(new Person("Peter Lau"));

        return persons.stream() //
                .filter(p -> p.getName().endsWith(lastName)) //
                .collect(Collectors.toList()); // List<Person>
    }
}
