import edu.princeton.cs.algs4.*;

public class QuickUnionUF {

  private int[] id; // access to component id (site indexed)
  private int count; // no of components

  public QuickUnionUF(int N) {
    id = new int[N];
    count = N;
    for (int i = 0; i < N; i++) {
      id[i] = i;
    }
  }

  public int count() {
    return count;
  }

  private int root(int i) {
    while(i != id[i] ) {
      i = id[i];
    }
    return i;
  }

  public boolean connected(int p, int q) {
    return root(p) == root(q);
  }

  public void union(int p, int q){
    int i = root(p);
    int j = root(q);
    id[i] = j;
  }

  public static void main(String[] args) {
    int n = StdIn.readInt();
    QuickUnionUF uf = new QuickUnionUF(n);
    while (!StdIn.isEmpty()) {
        int p = StdIn.readInt();
        int q = StdIn.readInt();
        if (uf.connected(p, q)) continue;
        uf.union(p, q);
        StdOut.println(p + " united to " + q);
    }
    StdOut.println(uf.count() + " components");
  }
}
