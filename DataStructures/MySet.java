import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.LinkedList;

public class MySet {
  public static void main(String[] args) {
    String[] colors = {"red", "white", "blue", "green", "red", "blue", "magenta"};

    Set<String> mySet = new HashSet<>(Arrays.asList(colors));

    List<Double> myList = new LinkedList<>();

    myList.

    System.out.println(mySet.toString() + " has " + mySet.size() + " elements");
  }
}
