package Order;
public class Order {
  
  private Transaction[] transactions; // one order can have many transcations

  public Order(Transaction[] transactions) {
    // Pass by reference
    this.transactions = transactions;
  }

  

  // 2) on Order.java, write a getTotal() -> to sum up all the subtotal

  public double getTotal() {
    double total = 0;
    for (int i = 0; i < this.transactions.length; i++) { // clear describe is transaction of "this" order by adding this.
      total += this.transactions[i].getSubtotal(); // object.method()
    }
    return total;
  }
}