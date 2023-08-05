public class App {
    public static void main(String[] args) throws Exception {
        // enum
        // 1. Finite number of members (Direction: LEFT, RIGHT, UP, DOWN)
        // Example 1:(Direction: LEFT, RIGHT, UP, DOWN)
        // Example 2:(Weekday: Monday, Tuesday...)
        // Example 3:(Season: Spring, Summer...)
        // 2. Growth of enum elements


        System.out.println(Direction.EAST); // EAST
        System.out.println(Direction.EAST.name()); // EAST
        System.out.println(Direction.NORTH);

        Direction east = Direction.EAST;
        System.out.println(east == Direction.NORTH); // false
        // enum use == is perfect, anytime
        // because is unique in whole runtime
        // so when assign enum to many object reference
        // they are all pointing to the same unique address
        System.out.println(east != Direction.NORTH); // true

        // values()
        for (Direction d : Direction.values()) { // .values() is the method use to call the array, Direction.values() is static method
            System.out.println(d.name());
        }

        System.out.println(Direction.SOUTH.ordinal()); // 1
        System.out.println(Direction.EAST.ordinal()); // 0

        System.out.println(Direction.EAST.getDegree()); // 90
        System.out.println(Direction.EAST.getDirection()); // d

    }
}
