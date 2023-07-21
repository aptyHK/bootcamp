public class Computer {

  private int ram;
  private double weight;
  private String color;

  // Constructors
  public Computer() {

  }
  // why it is a constructor but no method?
  // 1) no return type
  // 2) Constructor name = class name
  // if meet both 1) and 2), this must be a constructor

  // empty constructor
  // if only one contructor in the file, write or not write -> same
  //
  // non empty constructor
  // if you make your own constructor, the default empty constructor would be delete
  // if you still want an empty constructor, you must need to create one

  public Computer(String color) {
    this.color = color;
  }

  public Computer(int ram, double weight, String color) {
    this.ram = ram;
    this.weight = weight;
    this.color = color;
  }

  public void printSpec() {
    System.out.println("The spec of this pc is:");
    System.out.println("Ram: " + this.ram);
    System.out.println("Weight: " + this.weight);
    System.out.println("Color: " + this.color);
  }

  public String getColor() {
    return this.color;
  }

  public void setRam(int ram) {
    this.ram = ram;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public void setColor(String color) {
    this.color = color;
  }

}
