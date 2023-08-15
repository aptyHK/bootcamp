public class Computer {

  private Color color;
  private int ram;
  private String cpu;
  private String monitor;

  private Computer(Builder builder) {
    this.color = builder.color;
    this.ram = builder.ram;
    this.cpu = builder.cpu;
    this.monitor = builder.monitor;
  }

  public static Builder builder() {
    return new Builder();
  }

  @Override
  public String toString() {
    return "[color=" + this.color //
        + ", ram=" + this.ram //
        + ", cpu=" + this.cpu //
        + ", monitor=" + this.monitor //
        + "]";
  }

  public static class Builder {
    private Color color;
    private int ram;
    private String cpu;
    private String monitor;

    public Builder color(Color color) {
      this.color = color;
      return this;
    }

    public Builder ram(int ram) {
      this.ram = ram;
      return this;
    }

    public Builder cpu(String cpu) {
      this.cpu = cpu;
      return this;
    }

    public Builder monitor(String monitor) {
      this.monitor = monitor;
      return this;
    }

    public Builder instance() {
      System.out.println("Is is instance of builder? " + (this instanceof Builder));
      return this;
    }

    public Computer build() {
      return new Computer(this);
    }

  }

  public static void main(String[] args) {
    Computer computer1 = Computer.builder() //
        .color(Color.BLACK) //
        .cpu("Intel i9") //
        .monitor("OLED") //
        .ram(32) //
        .instance() // 
        .build();

    System.out.println(computer1.toString());

    System.out.println(computer1 instanceof Computer);
    //System.out.println(computer1 instanceof Builder);
  }

}
