public enum Color {
  RED("#FF0000"), //
  GREEN("#00FF00"), //
  BLUE("#0000FF")
  ;

  private String colorCode;
  int counter = 0;
  

  Color(String colorCode) {
    this.colorCode = colorCode;
  }

  public String getColorCode() {
    return this.colorCode;
  }

  public static void main(String[] args) {
    //System.out.println(Color.counter);
    // int age = Color.counter;
    //System.out.println(age);
  }
}
