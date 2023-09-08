public class Polymorphism {

    public static void main(String[] args) {
        // static polymorphism (overloading)
        // get(int x) is different to get(String x)
        // compile-time check

        // dynamic polymorphism (Parent class, Interface)
        // Customer extend Human implements Orderable
        Human customer = new Customer("John");
        customer.order();
        System.out.println(Customer.counter); // 1

        Customer customer2 = new Customer("Peter");
        customer2.order();
        System.out.println(Customer.counter); // (+1)

        Human human = new Human("Mary");
        human.order();
        System.out.println(Customer.counter); // (+2)

        // Customer human2= new Human(); // Cannot assign Parent class to child
        // cannot call order() from human directly
        // but it is just hide but not destroy
        // can still call when super.

        customer2.humanOrder(); // instance = customer()
        System.out.println(Customer.counter); // (+2)

        // Interface
        Orderable customer3 = new Customer("Eric");
        // why compile won't report error so firm?
        // becuase when implement the interface
        // already gurantee would fufill everything on the contract
        customer.order(); // (+1)

        Orderable[] orders = new Orderable[] { new Customer("Peter"), new Driver() };
        // no problem, because both class did implement orderable

        Orderable order = getByName(orders, "Peter"); // Customer
        order.order();
        Orderable order2 = getByName(orders, "Vincent"); // Driver
        order2.order(); // above line returned a driver in the end, when driver call order(), counter (+3)

    }

    public static Orderable getByName(Orderable[] orders, String name) {
        for (Orderable order : orders) {
            if (order instanceof Customer) {
                Customer customer = (Customer) order;
                if (name.equals(customer.getName())) // because only customer have name, but driver not, so need to confirm is the object is customer
                    return customer;
            }
        }
        return new Driver();
    }
}
