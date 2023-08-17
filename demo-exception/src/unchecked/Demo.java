package unchecked;
public class Demo {
  public static void main(String[] args) {

    try {
        System.out.println("Hello, World!");
        throw new CheckException();
    } catch (CheckException e) {
      
    }
    
  }
}
