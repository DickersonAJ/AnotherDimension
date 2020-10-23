public class Tester {

  public static void main(String[] args) {
    int[]a = {1, 2, 3};
    System.out.println(ArrayOps.sum(a));
    System.out.println(ArrayOps.largest(a));
    int[][]b = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
    System.out.println(ArrayOps.sumRows(b)[2]);
    System.out.println(ArrayOps.largestInRows(b)[1]);
    System.out.println(ArrayOps.sum(b));
    System.out.println(ArrayOps.sumCols(b)[0]);
    System.out.println(ArrayOps.isRowMagic(b));
    int[][]c = { {1, 2, 3}, {0, 0, 6}, {5, 1, 0} };
    System.out.println(ArrayOps.isRowMagic(c));
    System.out.println(ArrayOps.isColMagic(c));
    int[][]d = { {1, 2, 3}, {1, 1, 0}, {1, 0, 0} };
    System.out.println(ArrayOps.isColMagic(d));
  }

}
