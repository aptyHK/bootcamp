import java.util.Arrays;
import java.util.Random;

public class Demo {

    private int age = 10;

    public static void main(String[] args) throws Exception {
        int[] nums = new int[3];
        // int[] nums; -> declaration
        // new int[3]; -> initialization
        nums = new int[10]; // re-assignment
        nums = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // re-assignment

        int[][] matrix = new int[3][4]; // new int[row][column]
        // 1, 1, 1, 1
        // 2, 2, 2, 2
        // 3, 3, 3, 3

        // random a number and assign to the 2D array

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = new Random().nextInt(13); // (int) (Math.random() * 12);
            }
        }
        System.out.println(matrix.length); // 3
        System.out.println(matrix[0].length); // 4 (column legnth of row 0)
        // martix[0] -> return int[]
        // martix[0][2] -> get the idx 2 from the array of the row 0
        System.out.println(Arrays.deepToString(matrix));

        int[] arr = new int[matrix.length * matrix[0].length]; // 12
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                arr[count++] = matrix[i][j];
            }
        }
        System.out.println(Arrays.toString(arr));

        int[] arr2 = new int[matrix.length * matrix[0].length]; // 12
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                //  0  1  2  3  4  5  6  7  8  9 10 11 12
                // 00 01 02 03 10 11 12 13 20 21 22 23 24
                arr[(i*matrix[i].length)+j] = matrix[i][j];
            }
        }
        System.out.println("testing not use index" + Arrays.toString(arr));

        // Covert 2D array to a String
        String str = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                str += matrix[i][j];
            }
        }
        System.out.println(str);

        // 3D array
        int[][][] arr3d = new int[1][2][3];
        // 4D array
        int[][][][] arr4d = new int[1][2][3][4];

        Demo[][] demo = new Demo[2][2];
        demo[0][0] = new Demo();
        demo[0][1] = new Demo();
        demo[1][0] = new Demo();
        demo[1][1] = new Demo();

        for (int i = 0; i < demo.length; i++) {
            for (int j = 0; j < demo[i].length; j++) {
                System.out.println(demo[i][j].age);
            }
        }

        String[][] strings = new String[][] {{"abc","def"}, {"xyz","ijk"}}; // {1st row}, {2nd row}
        for (int row = 0; row < strings.length; row++) {
            for (int column = 0; column < strings[row].length; column++) {
                System.out.println(strings[row][column]);
            }
        } 
    }
}
