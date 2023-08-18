import java.util.LinkedList;
import java.util.List;

public class TestList {
    List<Character> characters = new LinkedList<>();

    public static void main(String[] args) {
        TestList t = new TestList();

        Runnable addInteger = () -> {
            for (int i = 0; i < 1000000; i++) {
                t.characters.add('a');
            }
        };

        Thread thread1 = new Thread(addInteger);
        Thread thread2 = new Thread(addInteger);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {

        }

        System.out.println(t.characters.size());
    }
}
