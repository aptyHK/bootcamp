package queue1;

import java.util.ArrayDeque;

public class DemoArrayDeque {
  public static void main(String[] args) {
    ArrayDeque<String> strings = new ArrayDeque<>();
    strings.add("abc");
    strings.add("def");
    strings.add("abc");
    System.out.println(strings.poll()); // abc
    System.out.println(strings.size()); // 2
    strings.addLast("xyz");
    System.out.println(strings.poll()); // def
    strings.addFirst("ijk");
    System.out.println(strings.peek()); // ijk
    System.out.println(strings.pollFirst()); // ijk, pollFirst = pull()
    System.out.println(strings.pollLast()); // xyz
  }
}
