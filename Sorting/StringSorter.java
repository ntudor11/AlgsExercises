import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Insertion;

public class StringSorter {
  public static void main(String[] args) {

    String[] a = StdIn.readAllStrings();

    for (int i=0; i<a.length; i++) {
      StdOut.println(a[i]);
    }

    System.out.println();

    Insertion.sort(a);
    for (int i=0; i<a.length; i++) {
      StdOut.println(a[i]);
    }
  }
}
