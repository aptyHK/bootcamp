package washcloth;

public interface Washcloth {
  
  void loadCloth(WashingMachine machine, Dirtycloth dirtycloth);
  void addDetergent(WashingMachine machine, Detergent detergent);
  void setMachineTimer(WashingMachine machine, int time);
  void startMachine(WashingMachine machine);
  void pickUpCloth(WashingMachine machine);
  void dryTheCloth();
}
