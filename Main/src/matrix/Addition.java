package matrix;

public class Addition {
    public static void main(String[] args) {
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrixB = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        // Perform matrix addition
        int[][] result = addMatrices(matrixA, matrixB);

        // Print the result
        System.out.println("Result of Matrix Addition:");
        printMatrix(result);
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] a, int[][] b) {
        // Check if matrices are of the same size
        if (a.length == 0 || a.length != b.length || a[0].length != b[0].length) {
            throw new IllegalArgumentException("Matrices must be of the same dimensions.");
        }

        int rows = a.length;
        int cols = a[0].length;
        int[][] sum = new int[rows][cols];

        // Add corresponding elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
