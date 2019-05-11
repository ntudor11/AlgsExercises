import edu.princeton.cs.algs4.*;
import java.util.Arrays;

public class ThreeSumFast {

  // public static int count(int[] a) {
  //   int N = a.length;
  //   Arrays.sort(a);
  //
  // }

  public static int count(int[] a) {
    int n = a.length;
    Arrays.sort(a);
    int count = 0;
    for (int i = 0; i < n; i++) {
      for (int j = i+1; j < n; j++) {
        int k = Arrays.binarySearch(a, -(a[i] + a[j]));
        if (k > j) {
          count++;
          System.out.println(a[i] + " " + a[j] + " " + a[k]);
        }
      }
    }
    return count;
  }

  public static void main(String[] args) {
    In in = new In(args[0]);
      int[] a = in.readAllInts();
      int count = count(a);
      StdOut.println(count);
  }
}
