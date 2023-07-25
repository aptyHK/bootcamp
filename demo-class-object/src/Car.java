public class Car {

  // Instance Variables (Instance -> Object)
  // Or call Member variable
  private int noOfWheel; // 0
  private int capacity; // 0
  private String color; // null

  // Empty Constructor
  public Car() {

  }

  // All-arguments constructors (with all attributes) 
  public Car(int noOfWheel, int capacity, String color) {
    this.color = color;
    this.noOfWheel = noOfWheel;
    this.capacity = capacity;
  }

  

  public int getNoOfWheel() {
    return this.noOfWheel;
  } 

  public int getCapacity() {
    return this.capacity;
  }

  public String getColor() {
    return this.color;
  }

  public void setNoOfWheel(int noOfWheel) {
    this.noOfWheel = noOfWheel;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
