public enum Color {
  RED("#FF0000"), //
  GREEN("#00FF00"), //
  BLUE("#0000FF")
  ;

  private String colorCode;

  Color(String colorCode) {
    this.colorCode = colorCode;
  }

  public String getColorCode() {
    return this.colorCode;
  }
}
