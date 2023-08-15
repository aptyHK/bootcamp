package map;

import java.util.HashMap;
import java.util.Map;

public class AnimalMap<T> {

  //Map<String, String> map2;
  Map<T, String> map;
    //^

    public AnimalMap() {
      map = new HashMap<>();
    }

    //-------------
    //            v
  public void put(T key, String animal) {
    map.put(key, animal); 
  }



  // public void put(String key, String animal) {
  //   map2.put(key, animal); 
  // }

  public static void main(String[] args) {
    AnimalMap<String> map1 = new AnimalMap<>();
    map1.put("key1", "Dog");

    AnimalMap<Integer> map2 = new AnimalMap<>();
    map2.put(1, "Dog");
  }
}
