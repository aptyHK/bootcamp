public class Customer extends Human implements Orderable {

    public static int counter = 0;

    public Customer(String name) {
        super(name);
    }

    
    @Override
    public void order() {
        counter++; // instance method still can control static variable
    }

    public void humanOrder() {
        super.order();
    }
}
