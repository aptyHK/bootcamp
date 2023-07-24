import java.util.Arrays;

// ******Reference and object are two different things

public class Array3 {
  
  public static void addOne(int[] arr) { // arr -> pass the object address, 
    for (int i = 0; i < arr.length; i++) {
      arr[i] += 1; // It will edit the original value in the memory
    }
  } 

  public static String concat(String s1, String s2){ // all wrapper class pass by value, a copy of a and b throw into the method
    s1 = "hello"; // edit the copy
    return s1 + s2;
  }

  public static void main(String[] args) {
    int[] nums = new int[] {3, 4, 8};
    addOne(nums); // only need to put the object address of the array nums to the method

    System.out.println(Arrays.toString(nums)); // when check nums again, i give the address, I can see the new value

    // call concat
    String a = "abc";
    String b = "def";
    String result = concat(a,b); 
    // result = hellodef
    // and a still remain abc
  }
}
