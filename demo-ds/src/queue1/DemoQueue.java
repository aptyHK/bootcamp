package queue1;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class DemoQueue {
  public static void main(String[] args) {

    // *** When use queue, use while loop better than for loop

    LinkedList<String> queue = new LinkedList<>();
    // First In First Out
    queue.add("hello");
    queue.add("world");
    System.out.println(queue.peek()); // hello, just look at the end and see what is it
    System.out.println(queue.poll()); // hello, take the element at the end out
    System.out.println(queue.peek()); // world, look again
    System.out.println(queue.poll()); // world
    System.out.println(queue.size()); // 0

    queue.add("abc");
    queue.add("def");
    queue.add("xyz");
    System.out.println(queue.remove("def")); // true
    System.out.println(queue.poll()); // abc
    System.out.println(queue.poll()); // xyz

    System.out.println(queue.offer("ijk")); // true, add()
    System.out.println(queue.offer("abc")); // true, add()
    System.out.println(queue.offer("ijk")); // true, add()
    System.out.println(queue.size()); // 2

    if (queue.contains("ijk")) {
      queue.remove("ijk");
    }

    LinkedList<String> backup = queue;
    while(!queue.isEmpty()) {
      System.out.println(queue.poll()); // abc, ijk;
    }
    System.out.println(backup.size()); // 0

    LinkedList<Integer> queueNum = new LinkedList<>();
    queueNum.add(10);
    queueNum.add(10); // 2nd even number
    queueNum.add(9);
    queueNum.add(0); 
    queueNum.add(-3);
    queueNum.add(100);
    // remove 2nd even number (0)
    // 10, 9, -3, 100
    int countEven = 0;
    int element = 0;
    System.out.println("Start");
    int size = queueNum.size();
    int i = 0;
    while (i++ < size) { // 0, 1, 2, 3, 4, 5 < 6
      element = queueNum.poll();
      System.out.println(element);
      if (element % 2 == 0 && ++countEven == 2)
          continue;
      queueNum.add(element);
    }
    System.out.println(queueNum);
  }
}
