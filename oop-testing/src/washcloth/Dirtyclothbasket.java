package washcloth;

import java.util.ArrayList;
import java.util.List;

public class Dirtyclothbasket {

  private List<Dirtycloth> dirtyclothes;

  public Dirtyclothbasket() {
    dirtyclothes = new ArrayList<>();
  }

  public void storeDirtyCloth(Dirtycloth dirtycloth) {
    this.dirtyclothes.add(dirtycloth);
  }

  public List<Dirtycloth> getDirtyclothes() {
    return this.dirtyclothes;
  }

  public void checkDirtyClothBasket() {
    for (Dirtycloth dc : dirtyclothes) {
      System.out.println(dc.getFabricsType());
    }
  }
}
