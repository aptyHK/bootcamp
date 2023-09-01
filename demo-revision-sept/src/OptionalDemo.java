import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        List<String> addresses = new ArrayList<>();
        addresses.add("Hong Kong");
        addresses.add("Mainland");
        addresses.add("Japan");
        Person9 p1 = new Person9("Ann Chan", addresses);

        List<String> addresses2 = new ArrayList<>();
        addresses2.add("Hong Kong");
        addresses2.add("US");
        Person9 p2 = new Person9("Betty Chen", addresses);

        List<Person9> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        // return all addresses (List<String>) from List<Person>
        System.out.println(getFromDb(persons, "Chan")); // true, because can find the last name
        System.out.println(getFromDb(persons, "Lau")); // false, did not add any Lau

        Optional<Person9> result = getFromDb2(persons, "Chan");
        result.ifPresent(person -> { // the whole thing is about: if present n, print the address of n
            // System.out.println(person.getName());
            person.getaddresses().stream() // 
                .forEach(addr -> {
                    System.out.println(addr);
                });
        });

    }

    public static Optional<Person9> getFromDb2(List<Person9> persons //
            , String lastName) {
        return persons.stream() //
                .filter(p -> p.getName().endsWith(lastName))
                .findAny() // Optional<Person9>
        ;
    }

    public static boolean getFromDb(List<Person9> persons //
            , String lastName) {
        return persons.stream() //
                .filter(p -> p.getName().endsWith(lastName))
                .findAny() // Optional<Person9>
                .isPresent();
    }
}
