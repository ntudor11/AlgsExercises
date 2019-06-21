public class FindNumber {

  public static int findSum(int[] A, int N) {
    if (N <= 0 ) {
      return 0;
    } else {
      return (findSum(A, N-1) + A[N-1]);
    }
  }

  public static int findSum2(int[] array, int index) {
    if (index <= 0) {
      return 0;
    } else {
      return (array[index-1] + findSum2(array, index-1));
    }
  }

  public static int findTheMax(int[] array, int length) {
    if (length == 1) {
      return array[0];
    }
    int result = findTheMax(array, length-1);
    if (array[length-1] > result) {
      return array[length-1];
    } else {
      return result;
    }
  }

  public static int findTheMin(int[] array, int length) {
    if (length == 1) {
      return array[0];
    }

    int result = findTheMin(array, length-1);

    if(array[length-1] < result) {
      return array[length-1];
    } else {
      return result;
    }
  }

  public static void main(String[] args){

    int [] elements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] elements2 = {7, 20, 40, 2 ,3,4,5};

    System.out.println("Max element: " + findTheMax(elements, elements.length));

    System.out.println("Min element: " + findTheMin(elements, elements.length));

    System.out.println("1st Sum of elements: " + findSum(elements, elements.length));

    System.out.println("2nd Sum of elements: " + findSum2(elements, elements.length));

    System.out.println("Max element: " + findTheMax(elements2, elements2.length));

    System.out.println("Min element: " + findTheMin(elements2, elements2.length));

    System.out.println("1st Sum of elements: " + findSum(elements2, elements2.length));

    System.out.println("2nd Sum of elements: " + findSum2(elements2, elements2.length));

  }
}
