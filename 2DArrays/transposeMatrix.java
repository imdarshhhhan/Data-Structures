public class transposeMatrix {

    public static int[][] transPose(int[][] matrix) {

        int m = matrix.length;       // rows
        int n = matrix[0].length;    // columns

        // Transpose matrix will have n rows and m columns
        int[][] resultArr = new int[n][m];

        // Fill transpose matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                resultArr[j][i] = matrix[i][j];
            }
        }

        return resultArr;
    }

    // Method to print matrix
    public static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        int[][] transpose = transPose(matrix);

        System.out.println("\nTranspose Matrix:");
        printMatrix(transpose);
    }
}