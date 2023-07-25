import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        // *** Most frequently use -> round, pow, absolute

        // round
        System.out.println(Math.round(5.5)); // 6
        System.out.println(Math.round(5.4)); // 5
        System.out.println(Math.round(5.49)); // 5
        // So round method only check first decimal place

        // max, min
        System.out.println(Math.max(2, 6)); // 6
        System.out.println(Math.min(2, 6)); // 2

        // absolute value
        System.out.println(Math.abs(-6)); // 6

        // square root
        System.out.println(Math.sqrt(9)); // 3.0
        System.out.println(Math.sqrt(22)); // 4.69....
        System.out.println(Math.sqrt(-4)); // NaN

        int num = -26; // you know sqrt this number would have problem
        if (num > 0 && Math.sqrt(num) == 5) { // in this if, check num > 0 first, so the program would exit first before NaN happen
            // do something
        }

        // random -> generate a number between 0 to 1
        System.out.println(Math.random()); 

        // floor, celing
        //

        // base 10:
        // log10 -> 1 (10 pow of 1 is 10)
        // log1000 -> 3 (10 pow of 3 is 1000)
        // base 2:
        // log8 -> 3 (2 pow of 3 is 8)

        double number = 2.0;
        double naturalLog = Math.log(number); // naturalLog
        System.out.println(naturalLog);

        double number2 = 10;
        double log10 = Math.log10(number2); // log 10
        System.out.println(log10);
        System.out.println(Math.log10(1000)); // 3

        int[] nums = new int[] {-100, 100, 90, 50};
        // turn all num to positve -100 -> 100
        // sum all
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += Math.abs(nums[i]);
        }
        System.out.println(sum);
        
        // abs -> round example
        sum = 0;
        double[] arr = new double[] {-5.64, 5.23, 9.800, 6.55}; 
        // abs -> round -> sum all
        for (int i = 0; i < arr.length; i++) {
            // System.out.print((int)Math.abs(Math.round(arr[i])+" ");
            sum = sum + (int) Math.abs(Math.round(arr[i]));
            // sum += Math.abs(Math.round(arr[i]));
        }
        System.out.println(Math.round(-5.64));
        System.out.println(sum); // 6 + 5 + 10 + 6 = 27

        // pow example
        int cubeLength = 5;
        double volume = Math.pow(cubeLength, 3); 
        // double volume = (int) Math.pow(cubeLength, 3); // or you can downcast if need
        System.out.println(volume);

        // ............
        int[] bases = new int[] {2, 3, 4, 5};
        int[] index = new int[] {3, 4, 5, 6};
        int[] result = new int[bases.length]; // pow all bases with the index
        for (int i = 0; i < bases.length; i++) {
            result[i] = (int) Math.pow(bases[i], index[i]);
        }        
        System.out.println(Arrays.toString(result));
        
    }
}
