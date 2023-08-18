import java.util.concurrent.atomic.AtomicInteger;

public class TestAtomic {
    //int number;
    AtomicInteger number = new AtomicInteger(0);

    public static void main(String[] args) {
        TestAtomic i = new TestAtomic();
        // i.number++; // ***Non-Atomic Operation
        // the time when process number is 0 to ++ it as 1
        // it can be interupt (by thread)
        // then it is a Non-Atomic Operation
        // System.out.println(i.number); // 1

        Runnable increment = () -> {
            for (int x = 0; x < 1000000; x++) {
                i.number.incrementAndGet(); // Atomic Operation
            }
        };

        Thread thread1 = new Thread(increment);
        Thread thread2 = new Thread(increment);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {

        }
        System.out.println(i.number); // suppose need to be 20000, but now output like 1xxxx
    }
}
