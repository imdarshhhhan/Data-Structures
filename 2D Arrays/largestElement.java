public class largestElement {
    static int searchLargest(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int largest = -1;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(matrix[i][j]>largest){
                    largest = matrix[i][j];
                }
            }
        }
        return largest;
    }

        static int searchSmallest(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(matrix[i][j]<smallest){
                    smallest = matrix[i][j];
                }
            }
        }
        return smallest;

    }

    public static void main(String args[]) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int result = searchLargest(matrix);
        int result2 = searchSmallest(matrix);
        System.out.println("Largest element is "+ result);
        System.out.println("smallest element is "+ result2);


    }
}
