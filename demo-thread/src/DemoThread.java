import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemoThread {

    public static void main(String[] args) {
        // Approach 1: Runnable (lambda) to implement thread
        // Task logic
        Runnable printout = () -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("i=" + i);
            }
        };

        // Task
        Thread thread = new Thread(printout); // Task management // step 4

        System.out.println("start thread"); // step 1
        // thread.start(); // step 2
        System.out.println("end thread"); // step 3
        // start thread
        // end thread
        // Hello Thread

        // Approach 2: Create PrintOut class implement Runnable
        Thread thread2 = new Thread(new PrintOut());
        System.out.println("start thread 2"); // step 1
        thread2.start(); // step 2
        System.out.println("end thread 2"); // step 3

        // Approach 3: Create PrintOut2 Class extends Thread
        Thread thread3 = new Thread(new PrintOut2());
        thread3.start();
        
        try {
            thread.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {

        }
        // Main Thread would will for thread1, 2, 3 arrive
        // then continue run the rest of the code
        System.out.println("Main Thread End");
    }
}

// start thread
// end thread
// start thread 2
// end thread 2
// On PrintOut class
// i=0 
// i=1
// i=2
// i=3
// i=4
// i=5
// ....