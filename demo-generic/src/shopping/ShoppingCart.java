package shopping;

import java.util.ArrayList;

public class ShoppingCart { // <T extends CheckOutItem> {

  private ArrayList<CheckOutItem> items;

  public ShoppingCart() {
    items = new ArrayList<>();
  }

  // public void add(T item) {
  //   items.add(item);
  // }

  public int totalAmount() {
    int sum = 0;
    for (CheckOutItem item : this.items) {
      sum += Math.max(0, item.getPrice() * Math.max(0, item.getQuantity()));
    }
    return sum;
  }

  public void add(int quantity, DisplayItem displayItem) {
    // construct CheckoutItem;
    CheckOutItem checkoutItem = new CheckOutItem(quantity, displayItem.getPrice());
    items.add(checkoutItem); 
  }

  public void clear() {
    this.items.clear();
  }

  // public boolean remove(T food) {
  //   return items.remove(food);
  // }

  public static void main(String[] args) {
    ShoppingCart cart1 = new ShoppingCart();
    cart1.add(2, new Rice());
    System.out.println(cart1.totalAmount());
    // cart1.add(new Food()); // Food is abstract
    // ShoppingCart<Drink> cart2 = new ShoppingCart<>();
    // ShoppingCart<Food> cart3 = new ShoppingCart<>();
    // ShoppingCart<Rice> cart4 = new ShoppingCart<>();
    // ShoppingCart<Object> cart5 = new ShoppingCart<>(); // cannot put Object into <>, because Object is on top of Food

  }
}
