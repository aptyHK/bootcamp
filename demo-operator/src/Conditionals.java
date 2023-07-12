public class Conditionals {

  public static void main(String[] args) {
    // if, else if, else
    int i = 10;
    if (i > 9) { // asking if i > 9, if yes, execute the block of the codes
      System.out.println("i = " + i); // i = 10
    }

    // flow control: if-else
    if (i < 8) { // not fulfill
      System.out.println("i is smaller than 8"); // won't execute as not fulfill the if condition
    } else { // p.s. else cannot use before used if
      System.out.println("i is larger than 8"); // would execute this block of code as fulfill the condition
    }

    // else-if
    if (i > 12) { // not fulfill
      System.out.println("i is larger than 12"); // won't execute
    } else if (i <= 12 && i > 0) { // fulfill
      System.out.println("i is smaller than 12 and larger than 0"); // will execute
    } 

    int a = 2;
    int b = 5;
    int box = 0;

    if (a > b) {
      box = 10;
    } else {
      box = 19;
    } // box = 19, if else can also help you decide the value of variable by condition  
    
    int number = 11;
    if (number % 2 == 1) {
      // do something here
      System.out.println("The number is an odd number!"); // because all even number / 2 will not have remainder
    } else if (number % 2 == 0 && number > 0) {
      System.out.println("The number is an even number!"); 
    } else {
      System.out.println("I want a positive number =]");
    }

    // String
    String str = "Monday";
    if (str.equals("Monday")) {
      System.out.println("Monday is a weekday");
    } 

    if (str.charAt(4) > 'a') {
      System.out.println("the fifth letter is a letter after a");
    } else if (str.charAt(4) == 'a') {
      System.out.println("the fifth letter is a!");
    }

    if (str.length() > 10) { //
      System.out.println(" str length > 10");
    } else {
      System.out.println("length is...");
    }
    
    if (str.equals("Monday") || str.charAt(4) == 'a' || str.length() > 10) {
      System.out.println("At least it met one of the condition~");
    }

    // switch
  }

}
