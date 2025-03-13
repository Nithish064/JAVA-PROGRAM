package matrix;

public class Subtraction {
    public static void main(String[] args) {
        int[][] matrixA = {
            {5, 6, 7},
            {8, 9, 10},
            {11, 12, 13}
        };

        int[][] matrixB = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] result = subtractMatrices(matrixA, matrixB);
        System.out.println("Result of Matrix Subtraction:");
        printMatrix(result);
    }

    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        validateDimensions(a, b);
        int rows = a.length;
        int cols = a[0].length;
        int[][] difference = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                difference[i][j] = a[i][j] - b[i][j];
            }
        }
        return difference;
    }

    private static void validateDimensions(int[][] a, int[][] b) {
        if (a.length != b.length || a[0].length != b[0].length) {
            throw new IllegalArgumentException("Matrices must be of the same dimensions.");
        }
    }

    public static void printMatrix(int[][] matrix) {
        // Using simple for loops instead of enhanced for loops
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}