// Day 1 (11th July) learning java

public class Helloworld {
  public static void main(String[] args) {


    String str = "";

    for (byte i = 127; i < 128; i++){
    str += i;
    if (i < 0) {
    break;
    }
    System.out.println(str);

    // //System.out.println(a*b);
    // System.out.println("I am Andy"); // end with semi-colon
    // System.out.println("Hello!"); //end with semi-colon
    // System.out.println("testing different types of character @%&#^* 123 asda | 李"); // can print different types of character
    // }
  }
}

}