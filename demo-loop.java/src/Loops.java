public class Loops {
  public static void main(String[] args) {
    // For Loop
    // for (intialization; condition; update)
    for (int i = 0; i < 4; ++i) {
      // System.out.println(i);
      // System.out.println("Hello");

      // Logic flow:
      // i < 0 -> 0 < 4, print the first Hello
      // ++i -> i = 1 -> i < 4 -> 1 < 4, print the second Hello
      // ++i -> i = 2 -> i < 4 -> 2 < 4, print the third Hello
      // ++i -> i = 3 -> i < 4 -> 3 < 4, print the forth Hello
      // ++i -> i = 4 -> !(i < 4) -> exit loop
    }

    for (int i = 8; i > 0; --i) {
      // System.out.println("i = " + i);
      // System.out.println("Hello");
    }

    // for (byte i = 8; i < 150; ++i) {
    // System.out.println("i = " + i);
    // !! When use byte, the loop would turn to an interesting way
    // if it reach to the max byte size 127 on the loop, when perform ++, it would return to the minimum value of byte which is -128
    // Therefore, if the condtion set like i < 150 then i++ or i > -180 then i--, it will become an infinity loop
    // e.g.
    // ....
    // i = 125
    // i = 126
    // i = 127
    // i = -128
    // i = -127
    // ....
    // it would never reach to the loop end condition of i is not smaller then 150
    // }
    for (double i = 0.1; i < 10; i += 0.4) {
      // System.out.println("i = " + i); // !the output would have problem
      // System.out.println("Hello");
    }

    for (char c = '0'; c <= 'Z'; c++) { // char example
      // System.out.println(c);
    }

    String yourName = "Andy Yip";
    for (int i = 0; i < yourName.length(); i++) { // sample case with String and some String method
      // System.out.print(yourName.charAt(i));

    }

    int max = 10;
    int count = 0;
    for (int i = 0; i < max; i++) {
      count += 1;
    }

    // 0, count+=1 1
    // i++ 1, count+=1 2
    // i++ 2, count+=1 3
    // i++ 3, count+=1 4
    // i++ 4, count+=1 5
    // i++ 5, count+=1 6
    // i++ 6, count+=1 7
    // i++ 7, count+=1 8
    // i++ 8, count+=1 9
    // i++ 9, count+=1 10
    // i++ 10, i is not < 10, loop end
    // result: count = 10

    // System.out.println(count); // 10

    // 1. sum up all odd number
    // 2. sum up all odd number, except 5
    // 3. (my extra) sum up all odd number but exclude all number that can divide by 3

    int sum = 0;
    int sumWithout5 = 0;
    int sumWithoutdividableBy3 = 0;
    for (int i = 0; i < 10; i++) {

      if (i % 2 == 1) { // all odd number
        sum += i;
        System.out.println("i is: " + i + " and current sum is: " + sum);
      }

      if (i % 2 == 1 && i != 5) { // all odd number exclude 5
        sumWithout5 += i;
      }

      if (i % 2 == 1 && i % 3 != 0) {
        sumWithoutdividableBy3 += i;
        System.out.println(
            "i is: " + i + " and current sum no dividable by 3 is: " + sum);
      }
    }
    System.out.println("Final sum is: " + sum); // 25
    System.out.println("Final sum without 5 is: " + sumWithout5); // 20
    System.out.println(
        "exclude all number that can divide by 3: " + sumWithoutdividableBy3); // 20

    for (int i = 0; i < 5; ++i) {
      System.out.println("hello");
      if (i > 2)
        ;
      {
        break;
      }
    }

    // i = 0, hello
    // i = 1, hello
    // i = 2, hello
    // i = 3, hello
    // break;

    // continue
    for (int i = 0; i < 6; i++) {
      System.out.println("Hello " + i);
      if (i > 3) {
        continue; // go to the next iteration
      }
      System.out.println("bye " + i);
    }

    //
    // i = 0; i < 6 -> hello 0, not i > 3 -> bye 0
    // i++; i = 1; i < 6 -> hello 1, not i > 3 -> bye 1
    // i++; i = 2; i < 6 -> hello 2, not i > 3 -> bye 2
    // i++; i = 3; i < 6 -> hello 3, not i > 3 -> bye 3
    // i++; i = 4; i < 6 -> hello 4, i > 3 -> (continue go to the next iteration)
    // i++; i = 5; i < 6 -> hello 5, i > 3 -> (continue go to the next iteration)
    // i++; i = 6; !(i < 6) -> exit

    // find number that can divisible by both 2 and 3
    for (int i = 0; i < 20; i++) {
      if (i % 2 == 0 && i % 3 == 0 && i != 0) {
        System.out.print(i + " ");
      }
    }

    System.out.println("");

    // find number that can divisible by 5 or 11
    for (int i = 0; i < 100; i++) {
      if (i != 0) {
        if (i % 5 == 0 || i % 11 == 0) {
          System.out.print(i + " ");
        }
      }
    }

    // nested loop
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.println("Hello");
      }
    } // how many hello?

    // i = 0, j = 0, hello
    // i = 0, j = 1, hello
    // i = 0, j = 2, hello
    // i = 0, j = 3, exit the inner loop with j
    // i = 1, j = 0, hello
    // i = 1, j = 1, hello
    // i = 1, j = 2, hello
    // i = 1, j = 3, exit the inner loop with j
    // i = 2, j = 0, hello
    // i = 2, j = 1, hello
    // i = 2, j = 2, hello
    // i = 2, j = 3, exit the inner loop with j
    // i = 3, j = 0, hello
    // i = 3, j = 1, hello
    // i = 3, j = 2, hello
    // i = 3, j = 3, exit the inner loop with j
    // i = 4, exit the outer loop with i

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < i + 1; j++) {
        // System.out.print("*");
      }
      // System.out.println("");
    }


    // *
    // **
    // ***
    // ****
    // *****

    // not allow System.out.print("*");



    for (int i = 0; i < 5; i++) {
      String starDisplay = "";

      for (int j = 0; j < i + 1; j++) {
        starDisplay += "*";
      }

      System.out.println(starDisplay);

      if (i == 4) {

        for (int k = i; k > 0; k--) {
          starDisplay = "";
          for (int l = 0; l < k; l++) {
            starDisplay += "*";
          }
          System.out.println(starDisplay);
        }
      }
    }



    // String starDisplay = "";

    // for (int i = 0; i < 5; i++) {
    // starDisplay += "*";
    // System.out.println(starDisplay);
    // }

  }
}
