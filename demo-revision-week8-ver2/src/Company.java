import java.util.ArrayList;
import java.util.List;

public class Company {
    List<Staff> staffs;
    private static int counter;
    
    public Company() {
        staffs = new ArrayList<>();
    }

    public Company(List<Staff> staffs) {
        this.staffs = staffs;
    }

    public List<Staff> getStaffs() {
        return this.staffs;
    }

    /**
     * Get staff name by staff id
     * @param staffId
     * @return
     */

    public String getStaffsName(int staffId) {
        return this.staffs.stream() //
            .filter(s -> s.getId() == staffId) // List<Staff>
            .map(s -> s.getName())
            .findAny() // here is returning Optional<String>
            .orElse(null); // String
    }

    public void add(Staff staff) {
        this.staffs.add(staff);
        counter++;
    }

    public static void main(String[] args) {
        Company company = new Company();
        company.getStaffs().add(new Staff(1, 20000, "John"));
        company.add(new Staff(2, 10000, "Peter"));
        // if I get the list first by getStaffs() and use the add function in List
        // May miss to perfrom the extra command written in the add function in this class
        company.getStaffsName(1); // "John"
        System.out.println(company.getStaffsName(1));
    }
}
