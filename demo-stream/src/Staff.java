public class Staff {
  String name;
  Department department;
  int performance;

  public Staff(String name, Department department, int performance) {
    this.name = name;
    this.department = department;
    this.performance = performance;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public String toString() {
    return "Staff[name=" //
        + this.name // 
        + ", " //
        + department // 
        + "]"; 
  }
}
