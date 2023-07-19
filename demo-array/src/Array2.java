import java.util.Arrays;

public class Array2 {
  public static void main(String[] args) {
    System.out.println(swap("ABCDEFGH", 2, 7));
  }

  public static String swap(String str, int idx1, int idx2) {
    // char[] chars = str.toCharArray();
    // char temp = chars[idx1];
    // chars[idx1] = chars[idx2];
    // chars[idx2] = temp;
    // return String.valueOf(chars);

    // Vincent's approach
    // define fail case first and fall to the main logic at last
    // the fail case from largest to smallest
    if (str == null) {
      return null;
    }
    if (str.isBlank()) {
      return str;
    }
    if (idx1 < 0 || idx1 >= str.length()) {
      return str;
    }
    if (idx2 < 0 || idx2 >= str.length()) {
      return str;
    }

    char[] chars = str.toCharArray();
    char temp = chars[idx1];
    chars[idx1] = chars[idx2];
    chars[idx2] = temp;
    //return String.valueOf(chars);
    return Arrays.toString(chars);
  }
}
