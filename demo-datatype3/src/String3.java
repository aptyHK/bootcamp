
public class String3 {

    // String Literal 
    public static void main(String[] args) throws Exception {

        // *****Compare to other object, String has it own heap rules

        String str = "abc";
        String str2 = "abc";
        System.out.println(str.equals(str2)); // true, "abc" is same as "abc"
        System.out.println(str == str2); // true, same value (literal pool)
        // ***String Literal Pool -> "abc"
        // instead of create a new object in heap "hello" "hello"
        // str and str2 are pointing to object "hello" in the heap

        String str3 = "abcd";
        System.out.println(str == str3); // false, there object is not sync

        // ***String immutability
        // You cannot use address to amend a string
        str = "abc100";
        // str2 = "abc";
        // if you edit the value of str
        // str no longer pointing to "abc" in the memory
        // new object "abc100" would be create in heap and point by str
        System.out.println(str == str2); // false, because "abc100"'s address is not equal to "abc" -> immutable -> new String("abc100")
        
        String temp = str;
        str = new String("abc100"); // force to create a new object to carry "hello"
        System.out.println(temp == str);// false
        String str99 = "abc100";
        System.out.println(str99 == str);
        System.out.println(str99 == temp);


        Integer a = 10;
        a = a + 20; // the a after = is a copy of a 
        // a = 30
        

    }
}
