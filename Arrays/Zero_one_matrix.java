class Zero_one_matrix {

    public int[][] setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean col = false;

        // Step 1: Mark rows & columns
        for (int i = 0; i < n; i++) {
            if (matrix[i][0] == 0)
                col = true;

            for (int j = 1; j < m; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Step 2: Set zeroes from bottom
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 1; j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }

            if (col)
                matrix[i][0] = 0;
        }

        return matrix;
    }

    public static void main(String args[]) {

        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        Zero_one_matrix obj = new Zero_one_matrix();  // ✅ create object
        obj.setZeroes(matrix);                        // ✅ call method

        int n = matrix.length;                        // ✅ define n
        int m = matrix[0].length;

        // Print matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}