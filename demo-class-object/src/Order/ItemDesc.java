package Order;

import java.util.Arrays;

public class ItemDesc {
  
  private String header;
  private String body;
  
  public ItemDesc(String header, String body) {
    this.header = header;
    this.body = body;
  }

  public static void main(String[] args) {
    ItemDesc itemdesc = new ItemDesc("Item A", "90% discount! Just for today");
    ItemDesc itemdesc2 = new ItemDesc("Item B", "Special offer!");
    //    v
    Transaction t = new Transaction(1, itemdesc, 3, 10.5);
    Transaction t2 = new Transaction(2, itemdesc2, 4, 20.5);
    //    v
    Order order = new Order(new Transaction[] {t, t2});

    // System.out.println(order.getTotal());


    int[] nums = new int[] {1,2,3,2};
    
    int num = 123456789;
    String str = Integer.toString(num);
    System.out.println(str.length());
    System.out.println(str.substring(0, str.length() / 2));
    System.out.println(str.substring(str.length() / 2));
    System.out.println(Integer.valueOf(str.substring(0, str.length() / 2)));

    int[] hashTable = new int[9];
    System.out.println(Arrays.toString(hashTable));
    StringBuilder str2 = new StringBuilder("");
    System.out.println(str2.append(1));
  }
}

// homework
// 1) on Transaction.java, write a method getSubtotal() -> don't do static and input raw data
// 2) on Order.java, write a getTotal() -> to sum up all the subtotal

