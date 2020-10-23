public class ArrayOps {

  public static int sum(int[] arr) {
    int total = 0;
    for (int i = 0; i < arr.length; i++) {
      total+=arr[i];
    }
    return total;
  }

  public static int largest (int[] arr) {
    int large = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > large) {
        large = arr[i];
      }
    }
    return large;
  }

  public static int[] sumRows(int[][] matrix) {
    int[]sum = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      sum[i] = sum(matrix[i]);
    }
    return sum;
  }

  public static int[] largestInRows(int[][] matrix) {
    int[]bigs = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      bigs[i] = largest(matrix[i]);
    }
    return bigs;
  }

  public static int sum(int[][] arr) {
    return (sum(sumRows(arr)));
  }

  public static int[][] invert(int[][] matrix) {
    int[][]inverse = new int [matrix[0].length][matrix.length];
    for (int i = 0; i < matrix[0].length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        inverse[i][j] = matrix[j][i];
      }
    }
    return inverse;
  }

  public static int[] sumCols(int[][] matrix) {
    return sumRows(invert(matrix));
  }

  public static boolean isRowMagic(int[][] matrix) {
    int e = sum(matrix[0]);
    for (int i = 0; i < matrix.length; i++) {
      if (sum(matrix[i]) != e) {
        return false;
      }
    }
    return true;
  }

  public static boolean isColMagic(int[][] matrix) {
    return (isRowMagic(invert(matrix)));
  }

}
