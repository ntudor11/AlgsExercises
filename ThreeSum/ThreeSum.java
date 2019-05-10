import edu.princeton.cs.algs4.*;

public class ThreeSum {
  public static int count(int[] a) {
    int N = a.length;
    int count = 0;

    for (int i=0; i < N; i++) {
      for (int j=i+1; j<N; j++) {
        for (int k=j+1; k<N; k++) {
          int sum = a[i] + a[j] + a[k];
          if (a[i] + a[j] + a[k] == 0) {
            count++;
            System.out.println(a[i] + " " + a[j] + " " + a[k] + " = " + sum);
          }
        }
      }
    }
    return count;
  }

  public static void main(String[] args) {
    int[] a = In.readInts(args[0]);
    StdOut.println(count(a));
  }
}
