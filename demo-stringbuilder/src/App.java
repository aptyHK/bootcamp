import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        
        // why need to use StringBuilder?
        // very simple
        // append is faster than + in string

        StringBuilder strBuilder = new StringBuilder("Hello");
        // s -> address (reference)
        strBuilder.append(" World");
        System.out.println(strBuilder.toString()); // String -> Hello
        System.out.println(strBuilder); // lol still output the value in the String even it is an object
        // Well..you can understand toString is a get method

        strBuilder.append(1.3f);
        System.out.println(strBuilder.toString()); // Hello World1.3

        // Hello World1.3true4000
        System.out.println(strBuilder.append(true).append(4000L).length()); // 22

        String str = " he llo ";
        String[] strs = str.trim().replace('h', 'e').split(" ");
        System.out.println(Arrays.toString(strs));

        StringBuilder s2 = new StringBuilder("start");
        s2.append('a').toString();
        // append is StringBuilder -> toString make s2 as a string
        //s2.append('a').toString().append();
        // as s2 no longer as StringBuilder, so can't append again
        s2.charAt(3);
        // But you can still use the method in the String class
        StringBuilder s3 = s2.append('a'); // After append is still StringBuilder
        String s4 = s3.toString(); // String
        s4.charAt(3); // r 

        // How to insert a " " between ll?
        StringBuilder s5 = new StringBuilder("Hello"); // Hello
        s5.insert(3, ' '); // 3 is the index after the first l
        System.out.println(s5.toString()); // Hel lo
        s5.insert(0, "world").append("world"); // why don't we assign back to s5? -> becuase s5 is the address, when I go to the memory address and edit, it would make a permenant change to the original value
        System.out.println(s5.toString()); // worldHel loworld
        
        // deleteCharAt(idx)
        s5.deleteCharAt(3); // access to the address of s5 and permenant delete char at idx 3
        s5.append("abc"); // access to the address of s5 and permenant append "abc" after s5
        s5.toString(); // StringBuilder object本身就係一個box 儲存一個string，toString() 只係轉左return value
        
        // System.out.println(s5.toString());

 
    }
}
