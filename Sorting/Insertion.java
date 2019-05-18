import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Insertion {

  public static void sort(Comparable[] a) {
    int N = a.length;
    for (int i = 0; i < N; i++) {
      for (int j = i; j > 0; j--) {
        if (less(a[j], a[j-1])) {
          exch(a, j, j-1);
        } else {
          break;
        }
      }
    }
  }

  private static boolean less(Comparable v, Comparable w) {
    return v.compareTo(w) < 0;
  }

  private static void exch(Object[] a, int i, int j) {
    Object swap = a[i];
      a[i] = a[j];
      a[j] = swap;
  }

  private static void show(Comparable[] a) {
      for (int i = 0; i < a.length; i++) {
          StdOut.println(a[i]);
      }
  }

  public static void main(String[] args) {
    String[] a = StdIn.readAllStrings();
    Selection.sort(a);
    show(a);
  }
}
