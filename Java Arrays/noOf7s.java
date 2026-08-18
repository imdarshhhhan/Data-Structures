public class noOf7s {
    public  static int noOfsevens(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int count = 0;
        for(int i =0;i<m;i++){
        for(int j=0;j<n;j++) {
            if(matrix[i][j]==7) {
                count++;
            }
        }
        }
        return count;

    }
    public static void main(String[] args){
        int[][] matrix = {
            {4,7,8},
            {8,8,7}
        };
        int res = noOfsevens(matrix);
        System.out.println(res);
    }
}
