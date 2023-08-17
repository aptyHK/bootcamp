import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Department {
  String name;

  public Department(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Dept[name="
        + this.name
        + "]";
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Department))
      return false;
    Department department = (Department) obj;
    return Objects.equals(department.name, this.name);//this.name.equals(department.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name);
  }

  public static void main(String[] args) {
    List<Staff> staffs = Arrays.asList(new Staff("Mary", new Department("HR"), 50)
        , new Staff("Peter", new Department("IT"), 60)
        , new Staff("Eric", new Department("IT"), 70));
    // Map<Department, List<Staff>
    staffs.stream() //
        .collect(Collectors.groupingBy(staff -> staff.department)) // the thing collected is map, so still need to consume one more time
        .forEach((dept, staffList) -> System.out.println("check behind"));//System.out.println(dept + " " + staffList));
      // Department@19469ea2 [Staff@1fb3ebeb]
      // Department@2f2c9b19 [Staff@6d311334]
      // Department@13221655 [Staff@682a0b20]
      // So need to apply own toString

    Map<Department, List<Staff>> depts = staffs.stream() //
        .collect(Collectors.groupingBy(staff -> staff.department));
        
    depts.forEach((dept, staffList) -> System.out.println(dept + " " + staffList));

    // you expect 2 line as there are 2 department only
    // so you need to apply your own equals and hashcode
    // to let the groupingBy() can call your overrided equals and hash code when check department


    for (Staff staff : depts.get(new Department("IT"))) {
      System.out.println(staff.department + " " + staff.name);
    }

    //
    Map<Boolean, List<Staff>> gradeMap = staffs.stream() //
        .collect(Collectors.partitioningBy(staff -> staff.performance >= 60));

    gradeMap.entrySet().stream()
        .forEach(e -> System.out.println(e));    
  }
}

