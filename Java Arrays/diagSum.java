public class diagSum {
    public static int diagonalSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int sum= 0;
       for(int i=0;i<m;i++) {
        sum +=matrix[i][i];

        if(i!=(n-1-i)){
            sum+=matrix[i][n-1-i];
        }
       }
        return sum;
    }

    public static void main(String args[]) {
        int[][] matrix = {{1,2,3},
                            {4,5,6},
                            {7,8,9}
        };
        int result = diagonalSum(matrix);
        System.out.println("sum is : "+ result);

    }
}
