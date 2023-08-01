/*Question : Given an integer n,
 add a dollar sign ("$") and a comma (",") as the thousands separator and return it in string format. */
/*Constraints:

0 <= n <= 231 - 1 */
public class JavaQuest29 {
  public static void main(String[] args) {
    System.out.println(separator(85));// $85
    System.out.println(separator(0));// $0
    System.out.println(separator(1000));// $1,000
    System.out.println(separator(123987405));// $123,987,405

  }

  public static String separator(int n) {
    // code here
    if (n < 1000) {
      return String.valueOf("$" + n);
    }

    String s = String.valueOf(n);
    StringBuilder sb = new StringBuilder("$");

    // System.out.println(s.length() % 3);

    int startIdx = 0; 
    int endIdx = 3;
    int round = s.length() / 3;
    if (s.length() % 3 != 0) {
      round++;
      endIdx = s.length() % 3;
    }

    for (int i = 0; i < round; i++) {
      sb.append(s.substring(startIdx, endIdx)).append(",");
      startIdx = endIdx;
      endIdx += 3;
    }

    sb.deleteCharAt(sb.length()-1);

    return sb.toString(); 
  }

}
