package hashmap1;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {
  public static void main(String[] args) {
    // We always have to relay on index to look for something
    // Hash map will help you solve this issue

    // Background: String[int], Array must use int as index
    // limitation: you can only access the element by int index
    // Solution HashMap<>
    HashMap<String, String> map = new HashMap<>();
    // <String, String> -> <key, value>
    map.put("abc", "hello world"); // entry
    map.put("bcd", "I am Developer"); // entry
    System.out.println(map.size()); // 2 entries
    // Map.Entry -> Key + Value

    // if Duplicated (), (equals(), hashCode()), override
    map.put("abc", "hello world !!!"); // override the entry with key "abc"
    System.out.println(map.get("abc")); // hello world!!!
    System.out.println(map.size()); // 2 entries

    System.out.println(map.isEmpty()); // false
    System.out.println(map.toString()); // {bcd=I am Developer, abc=hello world !!!}
    System.out.println(map); // {bcd=I am Developer, abc=hello world !!!}

    if (!map.containsKey("abc"))
      return;

    // Loop entries
    for (Map.Entry<String, String> entry : map.entrySet()) {
      // left: do each element as entry right: turn map to entry set
      System.out.println(entry.getKey() + ":" + entry.getValue());
      // bcd:I am Developer
      // abc:hello world !!!
    }

    // Loop key
    for (String key : map.keySet()) {
      // left: do each element as entry right: turn map to entry set
      System.out.println(key);
      // bcd
      // abc
    }

    // Loop value
    for (String value : map.values()) {
      System.out.println(value);
      // I am Developer
      // hello world !!!
    }

    // System.out.println(map.remove("abc")); // hello world!!!
    map.remove("abc"); // remove dedicate value by key "abc"
    System.out.println(map.toString()); // {bcd=I am Developer}
    System.out.println(map.remove("bcd", "I am NOT Developer")); // false
    System.out.println(map.remove("bcd", "I am Developer")); // true

  }

}
