public class TestSynchronizedLock {
    int x;
    Object lock1 = new Object();
    Object lock2 = new Object();
    
    // Deadlock = thread are waiting for each other -> infinity

    public int calculate(int amount) {
        int total = amount;
        synchronized (this.lock1) {
        this.x++;
    }
        // this.increment(); // x++
        return total + this.x;
    }
    // can be more than one sychronized code block
    // better just lock necessary part
    // public synchronized void increment() {
    //     this.x++;
    // }

    public static void main(String[] args) {

        TestSynchronizedLock obj = new TestSynchronizedLock();

        Runnable formula = () -> {
            for (int i = 0; i < 1000000; i++) {
                obj.calculate(0);
            }
        };

        Thread thread1 = new Thread(formula);
        Thread thread2 = new Thread(formula);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {

        }
        System.out.println(obj.x); // 2000000
    }
}
