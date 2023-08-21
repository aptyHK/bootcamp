import java.util.ArrayList;
import java.util.List;

// run order:
// static method called by static variable
// static code block
// Start of main
// (when new an Object)
// static method called by instance variable
// Object initialization code block

public class NotThatEasy {
    
    static final List<Character> characters = method();
    private static final char[] chars = {'J','a','c','k','y'};

    final int x = method2();

    static List<Character> method() {
        System.out.println("I am static method called by static variable");
        return new ArrayList<>();
    }

    static int method2() {
        System.out.println("I am static method called by instance variable");
        return 1;
    }

    static{ // static code block, run before main
        System.out.println("I am static code block");
        //characters = new ArrayList<>();
    }
    
    // object initialization code block, run when object create
    {
        System.out.println("Object initialization code block");
    }

    public static void main(String[] args) {
        // Once you click the run button:
        // 1. compile
        // 2. Run -> Class loader -> stack memory
        System.out.println("Start of main");
        NotThatEasy obj = new NotThatEasy();
        NotThatEasy obj2 = new NotThatEasy();
    }
}
