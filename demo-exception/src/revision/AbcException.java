package revision;

public class AbcException extends RuntimeException {
    // by zero
    // null pointer
    // array size
    // concurrentModification

    // this four issues, no point to check them
    // because when happen such error
    // should just fix the code instead of catch them and do something
    // Therefore, should not check RuntimeException

    public AbcException() {
        super("abc exception");
    }

    public static void main(String[] args) {
        int a = 10 / 0;
    }
    
}
