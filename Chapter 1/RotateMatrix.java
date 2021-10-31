/*

Given an image represented by an N x N matrix, where each pixel in the image
is represented by an integer, write a method to rotate the image by 90 degrees.
Can you do this in place?

*/

public class RotateMatrix {
  public static void rotateMatrix(int[][] image) {
    for (int row = 0; row <= image.length / 2; row++) {
      for (int col = row; col < image.length - 1 - row; col++) {
        swap(image, row, col);
      }
    }
  }

  // FIXME
  public static void swap(int[][] matrix, int row, int col) {
    int matrixLen = matrix.length;
    
    int temp = matrix[row][col];
    matrix[row][col] = matrix[row][(matrixLen - 1) - col];
    matrix[row][(matrixLen - 1) - col] = matrix[(matrixLen - 1) - row][(matrixLen - 1) - col];
    matrix[(matrixLen - 1) - row][(matrixLen - 1) - col] = matrix[(matrixLen - 1) - row][col];
    matrix[(matrixLen - 1) - row][col] = temp;
  }
  
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
      {1,2,3},
      {8,9,4},
      {7,6,5}
    };
    printMatrix(matrix);

    System.out.println();

    rotateMatrix(matrix);
    printMatrix(matrix);
  }
}
