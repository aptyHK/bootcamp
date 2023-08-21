interface Reading {
    void read();
}

public class AnonymousExample {
    public static void main(String[] args) {
        // lambda verson
        Reading read1 = () -> {
            System.out.println("I am lambda, reading...");
        };
        read1.read();

        // Annoymous inner class
        // useful when:
        // java version not support lambda
        // interface has more than 1 method
        Reading read2 = new Reading() {
            int x; 

            @Override
            public void read() {
                this.x++;
                System.out.println("I am annoymous, reading ... x=" + x);
            }
        };
        read2.read();
        read2.read();
    }
}
