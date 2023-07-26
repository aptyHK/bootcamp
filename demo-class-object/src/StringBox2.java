import java.util.Arrays;

public class StringBox2 {
  
  char[] string;

  public StringBox2(char[] sources) {

    //this.string = string; 
    // it will make the new object char array have the same address with the array create outside
    // then if you edit the array outside, would also change the value in the object char array
    // which is not good

    this.string = Arrays.copyOf(sources, sources.length);
  }

  public char[] getString() {
    return this.string;
  }

  public void setString(char[] string) {
    this.string = string;
  }

  public StringBox2 append(String s) {
    // String -> toCharArray()
    char[] res = new char[this.string.length + s.length()];
    for (int i = 0; i < this.string.length; i++) {
      res[i] = this.string[i];
    }
    for (int i = 0; i < s.length(); i++) {
      res[i+s.length()-2] = s.charAt(i);
    }
    this.string = res;
    return this;
  }

  public String toString() {
    return String.valueOf(this.string);
  }

  public static void main(String[] args) {
    char[] chars = new char[] {'a', 'c', 'b'}; 
    StringBox2 sb = new StringBox2(chars);
    System.out.println(sb.string); // a c b 
    chars[1] = 'x';
    System.out.println(sb.string); // a x b
    // ?????? Why change the array outside can change the value inside
    // Suppose the array can only control by the method the designer provide
    // approach 1:
    // make a for loop in the constructor to put each box to the array
    // approach 2:
    // this.string = Arrays.copyOf(sources, sources.length)
    // ----
    // So now the array in the object no longer share same address with the array outside
    // as the constructor just copy the source from outside array to the array in object
    // then when print sb.string, changing outside array no longer affect the result;
    System.out.println(sb.append("Hello").toString());
  }
}
