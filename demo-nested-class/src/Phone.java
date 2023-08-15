// Builder Pattern Demo
public class Phone {
  private String number;
  private Color color;
  private double weight;

  private Phone(Builder builder) { // private
    this.number = builder.number;
    this.color = builder.color;
    this.weight = builder.weight;
  }

  public static Builder builder() {
    return new Builder();
  }

  @Override
  public String toString() {
    return "[number=" + this.number //
        + ",color=" + this.color //
        + ",weight=" + this.weight //
        + "]";
  }

  public static class Builder { 
    // With same attributes of outer class
    private String number;
    private Color color;
    private double weight;

    public Builder number(String number) {
      this.number = number;
      return this;
    }

    public Builder color(Color color) {
      this.color = color;
      return this;
    }

    public Builder weight(double weight) {
      this.weight = weight;
      return this;
    }

    public Phone build(){
      return new Phone(this);
    }
  }

  public static void main(String[] args) {

    // Chain Method; replace different number of args constructors
    Phone phone = Phone.builder() // 
    .color(Color.GREY) //
    .number("1234567") //
    .weight(3.7d) //
    .build();



    System.out.println(phone.toString());
  }
}
