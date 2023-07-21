public class Number2 {

  int number1;
  int number2;

  public void setNumber1(int number1) {
    this.number1 = number1;
  }

  public void setNumber2(int number2) {
    this.number2 = number2;
  }

  public int divide() {
    this.print(); // non static method call non static method, but you can know they are still call by same object
    System.out.println(Number2.add(this.number1, this.number2)); // non static method call static method
    return this.number1 / this.number2;
  }

  public int divide(int num1) {
    Number2 a = new Number2();
    a.setNumber1(2000);
    a.setNumber2(1000);
    a.print();
    return num1 + this.number1 + this.number2; // well, you can do this if it has its meaning
  }

  public static int divide(int num1, int num2) {
    return num1 / num2;
  }

  public void print() {
    System.out.println("this.number1=" + this.number1);
    System.out.println("this.number2=" + this.number2);
  }

    public void print(int num1, int num2) {
    System.out.println("Parameter number1=" + number1);
    System.out.println("Parameter number2=" + number2);
  }

  public static int add(int number1, int number2) {
    return number1 + number2;
  }

  public static void main(String[] args) {
    Number2 n1 = new Number2();
    n1.setNumber1(26);
    n1.setNumber2(13);

    Number2 n2 = new Number2();
    n2.setNumber1(100);
    n2.setNumber2(10);

    // System.out.println(n1.divide());
    // System.out.println(n2.divide());
    // // using static method, can either add noting, or add the class name in front
    // // It is prefer to add the class name in front when you call static method, is easier to read
    // System.out.println(Number2.divide(9, 3));

    // n1.print();
    // n2.print();

    n1.divide(); 
    n1.divide(20);
    // inside divide() 
    // have call another method this.print(), non static method call non static method
    // also have call another method Number2.add(int int), non static method call static method
  }
}
