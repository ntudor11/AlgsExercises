import edu.princeton.cs.algs4.*;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Stack<Item> {
  private Node first = null;

  private class Node {
    Item item;
    Node next;
  }

  public boolean isEmpty() {
    return first == null;
  }

  public void push(Item item) {
    Node oldfirst = first;
    first = new Node();
    first.item = item;
    first.next = oldfirst;
    System.out.println(item + " pushed");
  }

  public Item pop() {
    Item item = first.item;
    first = first.next;
    System.out.println(item + " popped");
    return item;
  }

  public static void main(String[] args) {
    Stack stack = new Stack();

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
