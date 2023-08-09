package arraylist1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList {
  public static void main(String[] args) {
    //fixed-length
    // for both primitive and class
    int[] arr = new int[] {1, 2, 3};
    Integer[] integers = new Integer[] {1, 3, 2};

    // resize, create new object
    integers = new Integer[] {1, 3, 2, 4};
    // integers[2] = " abc"; // compile-time error

    // Declaration
    ArrayList<Integer> numbers;
    // Initialization, create Arraylist object
    numbers = new ArrayList<>();
    ArrayList<Integer> numbers2 = new ArrayList<>();
    numbers2.add(1);
    numbers2.add(3);
    numbers2.add(2);
    numbers2.add(4);
    numbers2.add(null);
    // numbers2.add((Integer) Long.valueOf(3)); // Cannot cast Long to Integer
    // variable-length

    // Conversion, ArrayList -> Array
    Integer[] arr2 = new Integer[numbers2.size()];
    // Define output array type for toArray() perform conversion
    arr2 = numbers2.toArray(arr2); 
    for (Integer in : arr2) {
      System.out.println(in);
    }
    System.out.println(Arrays.toString(arr2)); // [1, 3, 2, 4]

    //***The mechanism of ArrayList is:
    // When you .add(something), it is doing delete array -> create array -> delete array -> create array...
    
    // when you use ArrayList, what you scarifice is performance
    // e.g
    // ArrayList<Integer> numbers2 = new ArrayList<>(); // new empty array
    // numbers2.add(1); // new length 1 array
    // numbers2.add(3); // new length 2 array
    // numbers2.add(2); // new length 3 array
    // numbers2.add(4); // new length 4 array

    // ArrayList do not support primative
    // ArrayList<int>
    // so you can either use Integer, or just use array
    // but Integer can have null, a chance to have mistake

    // Access elemetns in ArrayList
    for (int i = 0; i < numbers2.size(); i++) {
      System.out.println(numbers2.get(i)); // Possible to have IndexOutOfBound
    }

    // System.out.println("For each version:");
    // for (Integer in : numbers2) {
    //   System.out.println(numbers2.get(in));
    // }

    int original = numbers2.set(2, 100); // unbox
    System.out.println("original=" + original); // 2
    System.out.println(numbers2.get(2)); // 100

    System.out.println(numbers2.isEmpty()); // false
    System.out.println((numbers2.size() == 0)); // false

    ArrayList<Integer> numbers3 = new ArrayList<>();
    numbers3.add(1000);
    numbers3.add(2000);

    numbers2.addAll(numbers3); // add all items from number3 to number2
    System.out.println(numbers2.size()); // 7

    // Remove
    numbers2.remove(2); // remove by index
    System.out.println(numbers2.size()); // 6

    numbers2.removeAll(numbers3); // remove Integer 1000, 2000
    System.out.println(numbers2.size()); // 4 

    System.out.println(numbers2.indexOf(1000)); // -1
    System.out.println(numbers2.indexOf(3)); // 1

    System.out.println(numbers2.toString()); // [1, 3, 4, null]

    System.out.println(numbers2.contains(3)); // true
    System.out.println(numbers2.contains(900)); // false
    System.out.println(numbers2.containsAll(numbers3)); // false;
    System.out.println(numbers2.add(2));
    System.out.println(numbers2.lastIndexOf(2)); // 4, size=5, 2 is at 0 1 2 3 [4]

    numbers2.add(1, 4); // put 4 on index 1 and shift 1 slot  to right for all elements after index 1
    System.out.println(numbers2); // [1, 4, 3, 4, null, 2]

    // some test for addAll and removeAll
    // If I let ArrayList number2 addAll number3
    // [1, 3, 4, null, 2] + [1000, 2000] -> [1, 3, 4, null, 2, 1000, 2000]
    // then I remove the element on index 1 of ArrayList number 3
    // and then I removeAll number3 from number 2
    // it will still only remove 1000 as ArrayList number3 now only have 1000
    // 2000 still remain on number2
    // So is very simple to use
    System.out.println(numbers2.addAll(numbers3));
    System.out.println(numbers2.toString());
    numbers3.remove(1);
    numbers2.removeAll(numbers3);
    System.out.println(numbers2.toString());

    numbers2.clear(); // remove all the elemets
    System.out.println(numbers2.size()); // 0

    ArrayList<String> strs = new ArrayList<>();
    strs.add("abc");
    strs.add("def");
    strs.add("xyz");
    strs.add("def");

    System.out.println(strs.subList(1, 2)); // def, from idx 1 to idx 1
    // Remove the first occurance of "def"
    strs.remove("def"); // remove by Object 
    System.out.println(strs); // [abc, xyz, def]
    strs.remove(1); // remove by index
    System.out.println(strs); // [abc, def]

     Iterator<String> iterator = strs.iterator();
    // turn ArrayList to Iterator can use a lot of useful method
    // like hasNext()
    // .next() will move to next element
    while (iterator.hasNext()) {
      System.out.println(iterator.next()); // abc def
    }
    for (String s : strs) {
      System.out.println(s);
    }
    
    Object[] objects = strs.toArray(); // ArrayList<String> -> Object[]
    for (Object o : objects) {
      if (o instanceof String) { // to prevent strs is not String array or String ArrayList
        String str = (String) o;
        System.out.println(str);
      }        
    }

    // Array -> ArrayList
    String[] strings = new String[] {"hello", "world", "!"};

    List<String> s2 = new ArrayList<>(); // List is interface
    // e.g.
    // Move m = new Student(); // because if move implement to students, student must have all the method design on move
    // List implement to ArrayList, List is an interface
    s2.add("abc"); 
    // add() method must be reflecting the add() in ArrayList, 
    // becuse List is just and interface, if the object is ArrayList, 
    // as ArrayList implement List, it must be override the add() method

    // *** Read only -> big bug
    List<String> stringList = Arrays.asList(strings);
    // stringList.add("ijk"); // run-time error, no compile error
    // java.lang.UnsupportedOperationException 

    // Read & Write (Solution of the big bug)
    List<String> stringList2 = new ArrayList<>(Arrays.asList(strings));
    stringList2.add("ijk");
    System.out.println(stringList2); // [hello, world, !, ijk]
    // Must remember because array -> ArrayList is a very frequently action in business world

    
  }
}