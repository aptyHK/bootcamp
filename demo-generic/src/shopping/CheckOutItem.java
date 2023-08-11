package shopping;

public class CheckOutItem extends Item {
  private int quantity;

  public CheckOutItem(int quantity, int price) {
    super(price);
    this.quantity = quantity;
  }

  public int getQuantity() {
    return this.quantity;
  }
}
