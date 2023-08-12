package washcloth;

import java.util.ArrayList;
import java.util.List;

public class Person implements Wear, Washcloth, Washcarefully {

  // behavior
  @Override
  public Dirtycloth wearCloth(Cloth cloth) {
    return new Dirtycloth(cloth);
  }

  public Dirtyclothbasket locateDirtyClothBasket() {
    return new Dirtyclothbasket();
  }

  public void putDirtyClothToBasket(Dirtycloth dirtycloth, Dirtyclothbasket dirtyclothbasket) {
    dirtyclothbasket.storeDirtyCloth(dirtycloth);
  }

  @Override
  public List<Dirtycloth> sortTheCloth(Dirtyclothbasket basket) {
    List<Dirtycloth> sortDirtyCloth = new ArrayList<>();
    for (Dirtycloth dirtyCloth : basket.getDirtyclothes()) {
      if (dirtyCloth.getFabricsType().checkIsWashable() == true)
        sortDirtyCloth.add(dirtyCloth);
    }
    return sortDirtyCloth;
  }

  @Override
  public void loadCloth(WashingMachine machine, Dirtycloth dirtyCloth) {
    machine.add(dirtyCloth);
  }

  @Override
  public void addDetergent(WashingMachine machine, Detergent detergent) {

  }

  @Override
  public void setMachineTimer(WashingMachine machine, int time) {
    machine.setTimer(time);
  }

  @Override
  public void startMachine(WashingMachine machine) {
    
  }

  @Override
  public void pickUpCloth(WashingMachine machine) {

  }

  @Override
  public void dryTheCloth() {

  }

  public static void main(String[] args) {
    // Object require in start 
    Person andy = new Person();
    WashingMachine myWashingMachine = new WashingMachine();

    Cloth[] clothBundle = new Cloth[10]; 
    for (int i = 0; i < 10; i++) { // lazy, just gen 10 random clothes;
      clothBundle[i] = new Cloth(FabricsType.randFabricsType());
    }

    Dirtyclothbasket basket1 = andy.locateDirtyClothBasket();

    for (int i = 0; i < clothBundle.length; i++) {
        Dirtycloth newDirtyCloth = andy.wearCloth(clothBundle[i]);
        andy.putDirtyClothToBasket(newDirtyCloth, basket1);
    }

    // basket1.checkDirtyClothBasket();

    List<Dirtycloth> sortedDirtycloths = andy.sortTheCloth(basket1); 

    for (int i = 0; i < sortedDirtycloths.size(); i++) {
      andy.loadCloth(myWashingMachine, sortedDirtycloths.get(i));
    }
    
    myWashingMachine.checkMachineStorage();
  }
}
