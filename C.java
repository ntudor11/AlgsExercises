import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class C {
  public static void c(String line) {
    int n = line.length();
    for (int i = 0; i < n; i++) {
      boolean found = false;
      for (int j = i+1; j < n; j++) {
        if(line.charAt(i) == line.charAt(j)){
          found = true;
        }
        if (found) {
          StdOut.print(line.charAt(i));
        }
      }
    }
  }

  public static void main(String[] args) {
    c("THEQUICKBROWNFOXJUMPSOVERTHELAZYDOG");
  }
}
