public class ReverseString {
  public static void main(String[] args) {
    String str = "hello";
    // expected output: olleh

    // // my first version
    // for (int i = str.length(); i > 0; i--) {
    // System.out.print(str.charAt(i-1));
    // }

    // Vincent's version
    String reversed = "";
    for (int i = str.length() - 1; i >= 0; i--) { // vincent's advice: basically it would be always like this syntax when do reverse, so can try to memorize it
      reversed += str.charAt(i); // += is not best optimize, but this is the only tool we have now
    }
    System.out.println(reversed);
  }
}
