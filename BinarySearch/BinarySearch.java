import edu.princeton.cs.algs4.*;

public class BinarySearch {
  public static int binarySearch(int[] a, int key) {
    int lo = 0;
    int hi = a.length-1;

    while(lo<hi) {
      int mid = lo + (hi - lo)/2;
      if (key < a[mid]) {
        hi = mid - 1;
      } else if (key > a[mid]) {
        lo = mid + 1;
      } else {
        return mid;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] a = In.readInts(args[0]);
    int key = 3217;
    StdOut.println(binarySearch(a, key));  }
}
