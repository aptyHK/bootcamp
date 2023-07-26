package Order;
public class Transaction {

  private int itemNo; // every item should have an unique code
  private ItemDesc itemDesc; // every item should have a description
  private int quantity; // how many of each item has been picked in the transcation
  private double unitPrice; // each item should have its price

  public Transaction(int itemNo, ItemDesc itemDesc, int quantity, double unitPrice) {
    this.itemNo = itemNo;
    this.itemDesc = itemDesc;
    this.quantity = quantity;
    this.unitPrice = unitPrice;
  }

  // 1) on Transaction.java, write a method getSubtotal() -> don't do static and input raw data
  
  public double getSubtotal() {
    return this.unitPrice * this.quantity; 
  }

  public int getItemNo() {
    return this.itemNo;
  }

  public ItemDesc getItemDesc() {
    return this.itemDesc;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public double getUnitPrice() {
    return this.unitPrice;
  }

  public void setItemNo(int iNo) {
    this.itemNo = iNo;
  }

  public void setItemDesc(String iDesc) {
    this.itemDesc = iDesc;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public void setUnitPrice(double unitPrice) {
    this.unitPrice = unitPrice;
  }


}
