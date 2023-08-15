package revision;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class Demo {
  public static void main(String[] args) {
    // ArrayDeque & LinkedList -> different underlying structure
    Deque<String> arrayDeque = new ArrayDeque<>(); // array
    arrayDeque.addFirst("a");
    arrayDeque.addLast("a");
    arrayDeque.pollFirst();
    arrayDeque.pollLast();

    Deque<String> linkedDeque = new LinkedList<>(); // LinkedList
    linkedDeque.addFirst("a");
    linkedDeque.addLast("a");
    linkedDeque.pollFirst();
    linkedDeque.pollLast();

    Queue<String> arrayDeque2 = new ArrayDeque<>(); // array
    arrayDeque2.add("a");
    arrayDeque2.poll();

    Queue<String> linkedQueue = new LinkedList<>(); // LinkedList
    linkedQueue.add("a");
    linkedQueue.poll();

    // So 2 things need to consider about which class and which object choose
    // class -> method can use
    // object -> underlying structure

    Queue<String> pQueue = new PriorityQueue<>(); // array
    pQueue.add("a");
    pQueue.poll();

    List<Integer> arrayList = new ArrayList<>(); // array
    arrayList.add(3);
    arrayList.remove(3);
    List<Integer> linkedList = new LinkedList<>(); // Linked List
    linkedList.add(3);
    // linkedList.poll(); // has been limited since the class is List
    linkedList.remove(3);

    // List<Integer> linkedList = new LinkedList<>();
    // ^ what can I do -> method in List ^ How to do -> LinkedList

    List<String> stack = new Stack<>();
    stack.add("abc");
    stack.remove(0);
    // Usually when you use Stack, you want to pop and push
    // stack.pop("abc"); // but Class List do not have pop and push method
    // stack.push(0); //

    Vector<String> stack2 = new Stack<>();
    stack2.add("abc");
    stack2.remove(0);
    // Also no push and pop

    Stack<String> stack3 = new Stack<>();
    stack3.add("abc");
    stack3.remove(0);
    stack3.push("xyz");
    stack3.pop();
    // So Stack must assign to Stack classx
  }
}
