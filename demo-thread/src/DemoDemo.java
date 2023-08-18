import java.util.LinkedList;
import java.util.List;

public class DemoDemo {
    public static void main(String[] args) {
        int[] num = new int[] { 1, 2, 5, 0 };
        int k = 56;

        System.out.println(Math.pow(10, 4)); // 10000

        String kStr = String.valueOf(k);
        int kLength = kStr.length();
        System.out.println(kLength);

        int addForNext = 0;
        List<Integer> kMulti = new LinkedList<>();

        for (int i = 0; i < num.length - kLength; i++) {
            kMulti.add(num[i]);
        }

        System.out.println(kMulti);
        StringBuilder sb = new StringBuilder();
        for(int i = num.length - kLength; i < num.length; i++) {
            sb.append(num[i]);
        } 
        String str = String.valueOf(Integer.valueOf(sb.toString()) + k);
        for (char c : str.toCharArray()) {
            kMulti.add(c - '0');
        }

        System.out.println(kMulti);
    }
    public int letStrBeInt(String str) {
        return Integer.valueOf(str);
    }
}
