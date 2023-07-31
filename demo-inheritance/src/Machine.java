public class Machine {

  public Machine() {

  }

  public Machine(double weight) {
    this.weight = weight;
  }

  // In vincent's definition

  // machine should have weight
  private double weight;

  // a machine can start and stop

  public void start() {
    System.out.println("Start machine");
  }

  public void stop() {
    System.out.println("Stop machine");
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public double getWeight() {
    return this.weight;
  }

  // If I set a static final method in method and try to create an override method on laptop:
  // Why I need to final the method in the parent?
  // Because I don't want the child to override me so the program can be more consistant
  public static final String staticMethod(String x, String y) {

    return x + y;
  }

  public static Machine produce(int code) {
    switch (code) {
      case 1:
        return new Machine();
      case 2:
        return new Laptop();
    }
    return new Machine();
  }

  public static void stop(int code) { // which machine going to 
    Machine machine = Machine.produce(code);
    machine.stop(); // different child class will have different implementation
  } // // *** the good point is:
  // if I have new machine, I don't have to adjust the code
  // high level, easy to review

  public static void main(String[] args) {
    Machine machine1 = Machine.produce(1); // Machine
    machine1.stop(); // Stop machine
    Machine machine2 = Machine.produce(2); // Laptop
    machine2.stop(); // Laptop Stop...


    // logic to stop machine:
    // money = 100, stop the machine if money == 0
    // which machine
    // stop dedicate machine

    int pocketMoney = 100;
    boolean stopCondition = pocketMoney < 0; // ??? 
    int code = 1;

    if (stopCondition) {
      Machine.stop(code); // 1 is the machine code
    }

  }

}
