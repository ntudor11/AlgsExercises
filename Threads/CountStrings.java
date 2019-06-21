import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;
import java.lang.Number;

public class CountStrings {

  public static void main(String[] args){
    String[] colors = {"red", "white", "blue", "green", "blue", "red"};

    int N = 100;
    String[] colors2 = new String[N];

    Set<String> colorSet = new HashSet<String>(Arrays.asList(colors));

    System.out.println(colorSet.size());

    LinkedList<Double> myList = new LinkedList<>();

    int i=20;
    double d=i;

    myList.add(3.0);
    myList.add(6.1);
    myList.add(9.0);
    myList.add(d);

    int a = 4;
    double b = 3.14;
    //Double c = a.intValue() + b.doubleValue();
    int c = a + b;
    System.out.println(c);

    System.out.println(myList.toString());

    myList.remove(0);
    System.out.println(myList.toString());
  }
}
