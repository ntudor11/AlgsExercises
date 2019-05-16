import edu.princeton.cs.algs4.*;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedQueueOfStrings {
  private Node first, last;

  private class Node {
    String item;
    Node next;
  }

  public boolean isEmpty() {
    return first == null;
  }

  public void enqueue(String item) {
    Node oldlast = last;
    last = new Node();
    last.item = item;
    last.next = null;
    if (isEmpty()) {
      first = last;
    } else {
      oldlast.next = last;
    }
    System.out.println(item + " enqueued");
  }

  public String dequeue() {
    String item = first.item;
    first = first.next;
    if (isEmpty()) {
      last = null;
    }
    System.out.println(item + " dequeued");
    return item;
  }

  public static void main(String[] args) {
    LinkedQueueOfStrings queue = new LinkedQueueOfStrings();

    while(!StdIn.isEmpty()) {
      String s = StdIn.readString();
      if (s.equals("-")) {
        StdOut.print(queue.dequeue());
      } else {
        queue.enqueue(s);
      }
    }
  }
}
