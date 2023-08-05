package mywardrobe;

public class Storage {
  
  // instance variables
  private int id;
  private StorageType storageType;
  private double length;
  private double width;
  private double height;
  private String specialAccessories;

  // constructor
  public Storage(StorageType storageType, double length, double width, double height) {
    this.storageType = storageType;
    this.length = length;
    this.width = width;
    this.height = height;
  }
}
