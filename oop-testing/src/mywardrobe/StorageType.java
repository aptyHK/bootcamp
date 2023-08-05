package mywardrobe;

public enum StorageType {

  HINGEDDOOR("DO1"), //
  SLIDINGDOOR("DO2"), //
  FOLDINGDOOR("DO3"), //
  TAMBOURDOOR("DO4"), //
  POCKETDOOR("DO5"), //
  STANDARDDRAWER("DR1"), //
  DEEPDRAWER("DR2"), //
  JEWELRYDRAWER("DR3"), //
  SHOEDRAWER("DR4"), //
  PULLOUTWIREBASKET("DR5"), // 
  SLIDINGTRAY("DR6"),
  CUSTOMIZEDDRAWER("DR7") //
  ;

  String id;
  
  private StorageType(String id) {
    this.id = id;
  }
}
