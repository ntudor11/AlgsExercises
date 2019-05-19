import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Quick {
  private static int partition(Comparable[] a, int lo, int hi) {
    int i = lo;
    int j = hi+1;

    while (true) {
      while (less(a[++i], a[lo])) {
        if (i == hi) break; // find item on left to swap
      }

      while (less(a[lo], a[--j])) {
        if (j == lo) break; // find item on right to swap
      }

      if (i >= j) break; // check if pointers cross
      exch(a, i, j); // swap
    }

    exch(a, lo, j); // swap with partitioning item
    return j; // return index of item now known to be in place
  }

  // is v < w ?
  private static boolean less(Comparable v, Comparable w) {
    if (v == w) return false;   // optimization when reference equals
    return v.compareTo(w) < 0;
  }

  // exchange a[i] and a[j]
  private static void exch(Object[] a, int i, int j) {
    Object swap = a[i];
    a[i] = a[j];
    a[j] = swap;
  }

  public static void sort(Comparable[] a) {
    StdRandom.shuffle(a);
    sort(a, 0, a.length-1);
  }

  private static void sort(Comparable[] a, int lo, int hi) {
    if (hi <= lo) return;
    int j = partition(a, lo, hi);
    sort(a, lo, j-1);
    sort(a, j+1, hi);
  }

  private static boolean isSorted(Comparable[] a) {
    return isSorted(a, 0, a.length - 1);
  }

  private static boolean isSorted(Comparable[] a, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++)
            if (less(a[i], a[i-1])) return false;
        return true;
    }

  private static void show(Comparable[] a) {
    for (int i = 0; i < a.length; i++) {
      StdOut.println(a[i]);
    }
  }

  public static Comparable select(Comparable[] a, int k) {
    if (k < 0 || k >= a.length) {
      throw new IllegalArgumentException("index is not between 0 and " + a.length + ": " + k);
    }
    StdRandom.shuffle(a);
    int lo = 0, hi = a.length - 1;
    while (hi > lo) {
      int i = partition(a, lo, hi);
      if      (i > k) hi = i - 1;
      else if (i < k) lo = i + 1;
      else return a[i];
    }
    return a[lo];
  }

  public static void main(String[] args ) {
    String[] a = StdIn.readAllStrings();
    Quick.sort(a);
    show(a);
    assert isSorted(a);

    // shuffle
    StdRandom.shuffle(a);

    // display results again using select
    StdOut.println();
    for (int i = 0; i < a.length; i++) {
      String ith = (String) Quick.select(a, i);
      StdOut.println(ith);
      }
  }
}
