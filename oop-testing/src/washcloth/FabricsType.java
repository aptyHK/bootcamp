package washcloth;

public enum FabricsType {

  COTTON(0, true), //
  POLYESTER(1, true), //
  NYLON(2, true), //
  SPANDEX(3, true), //
  LINEN(4, false), //
  RAYON(5, false), //
  SILK(6, false), //
  WOOL(7, false), //
  ;

  private int id;
  private boolean isWashable;

  private FabricsType(int id, boolean isWashable) {
    this.id = id;
    this.isWashable = isWashable;
  }

  public boolean checkIsWashable() {
    return this.isWashable;
  }

  public static FabricsType randFabricsType() {
    int i = (int) (Math.random() * 8);
    switch (i) {
      case 0:
        return FabricsType.COTTON;
      case 1:
        return FabricsType.POLYESTER;
      case 2:
        return FabricsType.NYLON;
      case 3:
        return FabricsType.SPANDEX;
      case 4:
        return FabricsType.LINEN;
      case 5:
        return FabricsType.RAYON;
      case 6:
        return FabricsType.SILK;
      case 7:
        return FabricsType.WOOL;
    }
    return null;
  }

}
