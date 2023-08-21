public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder sBuilder = new StringBuilder();
        StringBuffer sBuffer = new StringBuffer(); // similar but thread safe (methods are all added synchronized)
        // sbuilder (reference) -> object (StringBuilder Object) -> object (array)

        Runnable appendS = () -> {
            for (int i = 0; i < 100000; i++) {
                sBuilder.append("s");
            }
        };

        Thread thread1 = new Thread(appendS);
        Thread thread2 = new Thread(appendS);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {

        }
        System.out.println(sBuilder.length());
        // May have chance to get Exception in thread "Thread-0" java.lang.ArrayIndexOutOfBoundsException: 
        // If use StringBuffer, no such issue
    }
}
