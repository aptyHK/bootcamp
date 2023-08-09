package queue1;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class DemoArrayQueue {
  public static void main(String[] args) {
    Deque<String> deque = new LinkedList<>(); // Polymorthism
    Queue<String> queue = new LinkedList<>(); // Polymorthism

    // Queue, smaller range, because deque extend queue
    // Deque must have all the things Queue because Deque extends Queue

    // Why not LinkedList<String> queue = new LinkedList<>();
    // It have more method can use than Queue
    // Technically, no difference

    // Point 1:
    // Most important, narraw down the range, to increase readability
    // So I dont't need to guess is the LinkedList used the method in Deque or LinkedList
    // I can sure it only applied method that exist in Queue
    // When I apply Deque<String>, is like telling people:
    // I am going to use addFirst / addLast
    // So need to be precise about Class applied
    // This is when interface need to be exist
    // I can use change to use Deque / LinkedList anytime when need to use their function
    // Or go back down to queue
    // As long as the object instance is allow to put into them

    // Point 2:
    // use to defend user provide unnecessary type of data
    // e.g. I just want to simply do add an element to the queue
    // But if the queue use PriorityQueue, it will resequence
    // which this is not what you need
    // so you have able to stop user input PriorityQueue (run1() method in this file)
    // Or you can pre see there would have a lot of add() action (See example run3() method in this file)
    // As you know the add() in Linked list is more efficient than add() in Arraylist (node vs array)
    // so you can limit user only can give you a Linked list make sure the performance is the best
    // Is important to think the exact range of input parameter (no matter premitive, object) when design method (Polymorthism)

    // Point 3:
    // LinkedList extended List, Queue
    List<String> list = new LinkedList<>();
    // So now create a LinkedList, but hide all the Queue method
    // Can only use method in List

    queue.add("adc");
    deque.add("adc");
    deque.addFirst("def");
    deque.addLast("ijk");

    run1(new LinkedList<>()); // LinkList
    run1(new ArrayDeque<>()); // Array
    // run1(new PriorityQueue<>()); // Compile-error, PriorityQueue did not implement deque and only implement queue

    run2(new LinkedList<>()); // LinkedList
    run2(new ArrayDeque<>()); // Array
    run2(new PriorityQueue<>());

    run3(new LinkedList<>());
    // run3(new ArrayList<>());
    // run3(new ArrayDeque<>());
  }

  public static void run1(Deque<String> deque) {
    deque.addFirst("ss");
    deque.addLast("ss");
  }

  public static void run2(Queue<String> queue) {
    queue.add("ss");
    queue.add("ss");
  }

  public static void run3(LinkedList<String> deque) {
    deque.addFirst("ss");
    deque.addLast("ss");
  }
}

// List - simply list
// queue - a queue
// set - no sequence and cannot duplicate
