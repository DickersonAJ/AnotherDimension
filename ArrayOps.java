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

}
