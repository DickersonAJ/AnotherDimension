public class Tester {

  public static void main(String[] args) {
    int[]a = {1, 2, 3};
    System.out.println(ArrayOps.sum(a));
    System.out.println(ArrayOps.largest(a));
    int[][]b = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
    System.out.println(ArrayOps.sumRows(b)[2]);
    System.out.println(ArrayOps.largestInRows(b)[1]);
    System.out.println(ArrayOps.sum(b));
  }

}
