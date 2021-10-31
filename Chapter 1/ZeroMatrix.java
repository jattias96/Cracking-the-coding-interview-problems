/*

Write an algorithm such that if an element in an M x N matrix is 0, its entire
row and column are set to 0.

*/

public class ZeroMatrix {
  public static int[][] zeroMatrix(int[][] matrix) {
    boolean[] xAxis = new boolean[matrix[0].length];
    boolean[] yAxis = new boolean[matrix.length];

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] == 0) {
          xAxis[j] = true;
          yAxis[i] = true;
        }
      }
    }

    for (int i = 0; i < yAxis.length; i++) {
      if (yAxis[i] == true) {
        for (int j = 0; j < matrix[i].length; j++) {
          matrix[i][j] = 0;
        }
      }
    }

    for (int j = 0; j < xAxis.length; j++) {
      if (xAxis[j] == true) {
        for (int i = 0; i < matrix.length; i++) {
          matrix[i][j] = 0;
        }
      }
    }

    return matrix;
  }

  // TODO complete
  // public static int[][] zeroMatrixInPlace(int[][] matrix) {
    
  // }

  public static void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (j == matrix[i].length - 1) System.out.print(matrix[i][j]);
        else System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int[][] matrix = new int[][]{
      {1,2,0,4},
      {1,2,3,4},
      {1,2,3,4}
    };

    printMatrix(matrix);
    System.out.println();

    matrix = zeroMatrix(matrix);

    printMatrix(matrix);
  }
}
