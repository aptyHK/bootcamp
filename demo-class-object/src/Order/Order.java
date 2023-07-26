package Order;
public class Order {
  
  private Transaction[] transactions; // one order can have many transcations

  public Order(Transaction[] transactions) {
    // Pass by reference
    this.transactions = transactions;
  }
}
