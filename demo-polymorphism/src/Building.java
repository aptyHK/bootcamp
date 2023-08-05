public abstract class Building {
  
  double height;

  public void print() {
    System.out.println("I am building");
  }

  public void print2() {
    this.print();
  }

  public void print3() {
    System.out.println("I am building");
  }
}
