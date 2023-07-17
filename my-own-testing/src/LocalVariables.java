public class LocalVariables {

  public static void main(String[] args) {

    // fundamental - declaration and initialization
    // variable declaration (rememeber to specify appropiate data type)
    int age; // Declaration of an integer variable named age
    double salary; // Declaration of a double variable named salary;
    String name; // Declaration of a Sting variable named name;

    // variable initialization
    // variable initialization included initial value to the declared variable
    // Assignment operator is "=" which assigns the value on the right side to the variable of the left side, WHICH IS NOT representing compare are they equal
    age = 25; // Declaration of an integer variable named age
    salary = 10000; // Declaration of a double variable named salary;
    name = "Andy"; // Declaration of a Sting variable named name;

    // Combining Declaration and initialization
    // It is important to know Java also allow combining declaration and initiialization into a single statement
    int luckyNumber = 11;

    // Initialization after Declaration
    // Additionally, variable can be initialize later in the code, but before they are used. This is especially useful in cases where the initial value is not known at the time of declaration (depends on your programming style, you  can just assign = 0 instead of left it empty)
    int age1;
    String name1 = "Ben";
    age1 = 30;

    // More about variables
    // Variable re-assignment
    // Variable can be re-assign with new value after their initialization. Can update the value by using the = operator
    double salary1 = 10000.0;
    salary1 = 12000.0;
    
    // Variable usage
    // Ensure you use the variable after you declare, otherwise it would become useless dump code
    // Also, variable not initialized may result in compilation errors or unexpected behaviour
    String lol;
    // .... -> not benn initialize and no usage

    // Variable scope and Lifetime
    // Understand that local variables exist only within the block where they are declared. One the block is finished execute, the variable goes out of the scope and is no longer accessible

    // Questions:
    // 1) How do we declare and initialize variables?
    // A: declare -> choose an appropiate data type > decide variable name. initialize -> Use the = operator, to assign the value of the right to the variable on the left
    // 2) What are the differences between them?
    // A: Cannot intialize before you declare the variable? 
    // 3) Pratice it until you are completely familiar with this.
    // A) Done pratice



  }

}
