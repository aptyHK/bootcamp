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
    // if you want to check is a equal to b
    // if a b is String use a.equal(b)
    // if a b is char use a == b
    // if a b number use a == b

    int score = 89;
    char grade = ' ';
    
    if (score >= 90) { // false
      grade = 'A'; // NOT execute
    } else if (score >= 80) { // true, or can write as (score >= 80 && score <= 89) is also doing the same thing, it is more clear which it would easier to maintain if there has a lot to maintain 
      grade = 'B'; // execute
    } else if (score >= 70) { // no checking
      grade = 'B'; 
    } else if (score >= 60) { // no checking
      grade = 'B'; 
    } else { // no checking
      grade = 'F'; 
    }
    // grade? > B

    int age = 65;
    boolean isElderly = age >= 65; // true 

    if (isElderly) { // instead of using age >= 65, which you may not get the meaning when you read it
      System.out.println("your ticket price is $2");
    }

    // e.g company want to add a new rule: set ticket fee for elderly to $2
    // so you need to add a condition to adjust the price
    // in fact, older than 65 is elderly
    // instead of write if (age >= 65) { ticket price = 2}
    // set a boolean to check age >=65 is elderly
    // then set if (isElderly) { ticket price = 2}
    // which it is a good programming style that looks more readable to the business scope 
    // simply write (if age >= 65) may not able to get the meaning behind when you read the line

    // switch
  }

}
