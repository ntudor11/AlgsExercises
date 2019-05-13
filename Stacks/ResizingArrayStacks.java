
import edu.princeton.cs.algs4.StdIn;

public class ResizingArrayStacks {
  private String[] s;
  private int N = 0;

  public ResizingArrayStacks() {
    s = new String[1];
  }

  public void push(String item) {
    if (N == s.length) {
      resize(2 * s.length);
    }
    s[N++] = item;
  }

  private void resize(int capacity) {
    String[] copy = new String[capacity];
    for (int i = 0; i < N; i++) {
      copy[i] = s[i];
    }
    s = copy;
  }

  public String pop() {
    String item = s[--N];
    s[N] = null;
    if (N > 0 && N == s.length/4) {
      resize(s.length/2);
    }
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
