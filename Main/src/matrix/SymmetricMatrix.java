package matrix;

public class SymmetricMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };

        boolean isSymmetric = isSymmetric(matrix);
        System.out.println("Is the Matrix Symmetric? " + isSymmetric);
    }

    public static boolean isSymmetric(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows != cols) {
            return false; // A symmetric matrix must be square
        }

        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < cols; j++) { // Only check half the matrix
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}