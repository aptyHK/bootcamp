package ds;

import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPQ {
  public static void main(String[] args) {
    // Priority: natural order by default
    Queue<String> queue = new PriorityQueue<>();
    queue.add("bcd");
    queue.add("abc");
    queue.add("def");
    System.out.println(queue.poll()); // abc

    // Priority: Custom order by comparator
    Queue<String> custom = new PriorityQueue<>(new SortByDecending());
    // Compare to Collections.sort, the compartor put on the add() method
    // PriorityQueue put the comparator inside the () when declare the PriorityQueue
    // Which this design stop you change the Priority algothirm every add, which is a good design
    custom.add("bcd");
    custom.add("abc");
    custom.add("def");
    System.out.println(custom.poll()); // def
  }
}
