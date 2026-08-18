import java.util.*;
public class creation {
    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int n =matrix.length ,m = matrix[0].length;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                matrix[i][j] = sc.nextInt();
            }
        }


     for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
            System.out.print(matrix[i][j] + " ");                
            }    
        System.out.println();
        }
}
}