public record Person1(String name, int age) {

    //***if want to confirm no one can update the object after it constructed, use record
    
    // Immutable Object
    // final class, support generics public record Person1<T>(T name, int age) {
    // Support interface, but cannot further extend (do extends Object)
    // private final String name;
    // private final int age;
    // No empty constructor, All-argument constuctor ONLY
    // All getters
    // No Setters (final instance variable) 
    // custom static methods, static variable
    // custom constant
    // custom instance methods
    // No other instance variables
    // Already @Overrid equals(), hashCode(), toString()

    static int counter = 0; // class variable, not belong to object

    static final int MAX_VALUE = 100;

    // Tools
    public boolean isElderly(int age) {
        return this.age >= 65;
    }
}
