package com.hkjava.bootcamp;

/**
 * Hello world!
 *
 */
public class App {
    public static int add(int x, int y) {

        if (x > 1) {
            return y + anotherMethod(x + y);
        }
        return x + anotherMethod(x + y);
        // call a method in a method
        // it can create a lot of result
        // as you can't sure what value may anotherMethod return at the end
        // but it is not important what anotherMethod would return
        // because in this method
        // you only want to ensure this method is working
        // so you should not care about anotherMethod
        // you only need to confirm is add good logic
        // if you worry about another method
        // you should create another test case to test anothermethod
         
    }

    public static int anotherMethod(int z) {
        return (z + 13) / 100; 
    }

    public static int divide(int x, int y) {
        return x / y;
    }
}
