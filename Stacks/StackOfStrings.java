import edu.princeton.cs.algs4.*;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class StackOfStrings {
  private Node first;

  private class Node {
    String item;
    Node next;
  }

  public boolean isEmpty() {
    return first == null;
  }

  public void push(String item) {
    Node oldfirst = first;
    first = new Node();
    first.item = item;
    first.next = oldfirst;
  }

  public String pop() {
    String item = first.item;
    first = first.next;
    return item;
  }

  public static void main(String[] args) {
    StackOfStrings stack = new StackOfStrings();

    while(!StdIn.isEmpty()) {
      String s = StdIn.readString();
      if (s.equals("-")) {
        StdOut.print(stack.pop());
      } else {
        stack.push(s);
      }
    }
  }
}
