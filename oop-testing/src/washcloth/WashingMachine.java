package washcloth;

import java.util.ArrayList;
import java.util.List;

public class WashingMachine {

  private List<Dirtycloth> machineStorage;
  private int timer;

  public WashingMachine() {
    machineStorage = new ArrayList<>();
  }

  public void add(Dirtycloth dirtyCloth) {
    this.machineStorage.add(dirtyCloth);
  }

  public void setTimer(int time) {
    this.timer = time;
  }

  public int getTimer() {
    return this.timer;
  }

  public void start() {
    
  }

  public void stop() {
    
  }

  public void checkMachineStorage() {
    System.out.println("[Machine Storage status]");
    for (Dirtycloth dc : machineStorage) {
      System.out.println(dc.getFabricsType());
    }
  }
}
