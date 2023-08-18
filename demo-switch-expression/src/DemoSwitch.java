public class DemoSwitch {
    // static final (constant) (0-2)
    // instance variable (1X)
    // static variable (1-2)
    // constructors
    // public instance methods // main logic
    // static methods // tools
    // private method

    public static void main(String[] args) throws Exception {
        System.out.println(grade(90));

        Weekday weekday = Weekday.TUE;
        // Approach 1
        // use lambda + enum with switch, different with without lambda
        // - force you write all possible case
        // - can put multiple case on 1 outcome
        // - no need to write default case because already checked all
        int result = switch (weekday) {
            case MON, TUE -> 1;
            // case TUE -> 2;
            case WED -> 3;
            case THU -> 4;
            case FRI -> 5;
        };

        // Arpproach 2
        int result2 = switch (weekday) {
            case MON, TUE: // condition is not allowed in Java 17
                System.out.println("Monday or Tuesday");
                yield 1; // yield mean return + break
            case WED:
                System.out.println("Wednesday");
                yield 3;
            case THU:
                System.out.println("Thursday");
                yield 4;
            case FRI:
                System.out.println("Friday");
                yield 5;
        };

        // String str = "hello world!!!";
        // String result2 = switch(str) {
        // case str.length() > 4 -> "length > 5";
        // }

    }

    public static char grade(int score) {
        char grade = ' ';
        switch (score) {
            case 90:
                grade = 'A';
                break;
            case 80:
                grade = 'B';
                break;
            case 70:
                grade = 'C';
                break;
            case 60:
                grade = 'D';
                break;
            default:
                grade = 'F';
                break;
        }
    }
}
