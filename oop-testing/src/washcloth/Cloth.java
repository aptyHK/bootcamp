package washcloth;

public class Cloth {

  private FabricsType fabricsType;

  public Cloth(FabricsType fabricsType) {
    this.fabricsType = fabricsType;
  }

  public String getFabricsTypeName() {
    return fabricsType.name();
  }

  public FabricsType getFabricsType() {
    return fabricsType;
  }

}
