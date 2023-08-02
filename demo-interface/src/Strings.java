// Write my own String
public class Strings implements CharSequence {

  char[] arr; // "abc". [a, b, c]
  
  private Strings(String str) {
    arr = new char[str.length()];
    // char[] arr = str.toCharArray();
    for (int i = 0; i < str.length(); i++) {
      arr[i] = str.charAt(i); // String.charAt()
    }
  }

  public static Strings valueOf(String str) {
    return new Strings(str);
  }

  @Override
  public char charAt(int idx) {
    return this.arr[idx];
  }

  @Override
  public int length() {
    return arr.length;
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    if (end < start || start < 0 || end < 0 || start > this.arr.length - 1
        || end > this.arr.length)
      return String.valueOf(this.arr);
    // return String, StringBuilder, StringBuffer
    StringBuilder sb = new StringBuilder();
    for (int i = start; i < end; i++) {
      sb.append(this.arr[i]);
    }
    return sb;
  }


  public static void main(String[] args) {
    String str = "abc"; 
    // public final class String
    //implements java.io.Serializable, Comparable<String>, CharSequence,
    //           Constable, ConstantDesc {

    // When click on String, can see it do implement CharSequence

    Strings s = Strings.valueOf("abc");
    System.out.println(s.subSequence(1, 3)); // bc
  }
}
