import edu.princeton.cs.algs4.*;
import edu.princeton.cs.algs4.StdOut;

public class FixedCapacityStackOfStrings {
  private String[] s;
  private int N = 0;

  public FixedCapacityStackOfStrings(int capacity) {
    s = new String[capacity];
  }

  public boolean isEmpty() {
    return N == 0;
  }

  public void push(String item) {
    s[N++] = item;
  }

  public String pop() {
    String item = s[--N];
    s[N] = null; // for avoiding loitering
    return item;
  }

  public static void main(String[] args) {
    StackOfStrings stack = new StackOfStrings();

    while(!StdIn.isEmpty()) {
      String s = StdIn.readString();
      if (s.equals("-")) {
        //StdOut.print(stack.pop());
        System.out.println(stack.pop());
      } else {
        stack.push(s);
      }
    }
  }
}
