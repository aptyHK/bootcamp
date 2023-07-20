public class WhileLoop {
  public static void main(String[] args) {
    
    // while
    int count = 0;
    while (count < 5) { // continue condition: true/ false
      count++;
    }
    // count = 5

    boolean isHoliday = false;
    int counter = 0;
    while(!isHoliday) { // while isHoliday = false, keep run the loop
      counter++;
      System.out.println("I already worked for " + counter + " day(s)");
      if (counter >= 6) {
        isHoliday = true;
        System.out.println("I can finally have my holiday T_T");
      }
    }

    int c = 0;
    while (c >= 0 && c < 5) {
      System.out.println(c); // 0 1 2 3 4
      c++;
    } 
    System.out.println(c); // c = 5, after the while loop
    
    int a = 0;
    int b = 10;
    while (a < 5 || b > 0) {
      System.out.println("hello");
      a++;
      b--;
    }
    // 1 - a b
    // 2 - a b
    // 3 - a b
    // 4 - a b
    // 5 - a b -> a = 5, so a won't meet the condition on the next condition checking
    // 6 -   b
    // 1 -   b
    // 8 -   b
    // 9 -   b
    // 10 -  b -> b = 0, b also won't meet condition when do the next condition checking
    // both false, so loop stop

    // break, continue;
    int k = 0;
    while (k < 6) { // 0 1 2 3 4 5
      //System.out.println("break: hello"); // 0 1 2 3 
      k++; // -> 1 2 3 4
      if (k > 3) { // 1 2 3 4
        break;
      }
    }

    int j = 0;
    while (j < 6) { // 0 1 2 3 4 5
      
      j++; // -> 1 2 3 4
      if (j > 3) { // 1 2 3 4
        continue;
      }
      System.out.println("break: hello" + j); // 1 2 3
    }

  }
}
