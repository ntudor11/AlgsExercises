import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import java.security.SecureRandom;
import java.util.Arrays;

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

    SecureRandom generator = new SecureRandom();

    //int[] a = In.readInts(args[0]);
    int[] data = new int[1000000];

    for(int i=0; i<data.length; i++) {
      data[i] = 10 + generator.nextInt(900000);
    }

    Arrays.sort(data);

    System.out.printf("%s%n%n", Arrays.toString(data));

    int key = 26;
    StdOut.println(binarySearch(data, key));

  }
}
