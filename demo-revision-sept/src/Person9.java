import java.util.List;

public class Person9 {
    private String name;
    private List<String> addresses;

    // public Person9(String name) {
    //     this.name = name;
    // }

    public Person9(String name, List<String> addresses) {
        this.name = name;
        this.addresses = addresses;
    }

    public String getName() {
        return this.name;
    }

    public List<String> getaddresses() {
        return this.addresses;
    }
}
