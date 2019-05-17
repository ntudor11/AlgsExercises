import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import java.util.Iterator;

public class StackIterator<Item> {

  public static void main(String[] args) {
    Stack<String> stack = new Stack<String>();
    while (!StdIn.isEmpty()) {
      String item = StdIn.readString();
      if (!item.equals("-"))
          stack.push(item);
      else if (!stack.isEmpty())
          StdOut.print(stack.pop() + " ");
    }
    StdOut.println("(" + stack.size() + " left on stack)");
  }
}
