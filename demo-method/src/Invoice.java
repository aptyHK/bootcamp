public class Invoice {

  // A method to calculate total price for a item (double)
  public static double eachItemTotalPrice(int quantities, double unitPrices) {

    // double[] eachItemTotalPrice = new double[quantities.length];
    // for (int i = 0; i < quantities.length; i++) {
    // eachItemTotalPrice[i] = quantities[i] * unitPrices[i];
    // System.out.println(eachItemTotalPrice[i]);
    // }
    // return eachItemTotalPrice;

    // you can set multiple return keyword
    // Below method call early return -> can do some checking / filter before the main logic
    if (quantities < 0 || unitPrices < 0) {
      return 0;
    }
    return quantities * unitPrices; // main logic
  }

  // A method to calculate total amount of the invoice
  public static double invoiceTotal(double[] eachItemTotalPrice) { // 5 * 10.9, 10 * 100.3 -> return new array
    double invoiceTotal = 0.0d;
    for (int i = 0; i < eachItemTotalPrice.length; i++) {
      invoiceTotal += eachItemTotalPrice[i];
      // System.out.println(invoiceTotal);
    }
    return invoiceTotal;
  }


  public static void main(String[] args) {
    int[] quantities = new int[] {10, 20, 8, 14, 40};
    double[] unitPrices = new double[] {10.9, 100.3, 2.1, 9.0, 1000.3};

    // double totalPriceItems = ;
    // double[] totalPriceItems = eachItemTotalPrice(quantities, unitPrices);
    double[] totalItemPrices = new double[quantities.length];

    // Loop
    // double invoiceTotalAmount = invoiceTotal(totalPriceItems);
    for (int i = 0; i < totalItemPrices.length; ++i) {
      totalItemPrices[i] = eachItemTotalPrice(quantities[i], unitPrices[i]);
    }

    double invoiceTotalAmount = invoiceTotal(totalItemPrices);
    System.out.println("Total amount=" + invoiceTotalAmount);

  }
}
