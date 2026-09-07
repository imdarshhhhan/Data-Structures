//weighted graph -- adj matrix

public class P3 {
    public static void main(String[] args) {
        int v = 4, u = 4;
        int[][] gp = new int[u+1][v+1];

        gp[1][2] = 10;
        gp[2][1] = 10;
        
        gp[1][3] = 40;
        gp[3][1] = 40;

        gp[2][4] = 20;
        gp[4][2] = 20;

        gp[3][4] = 30;
        gp[4][3] = 30;

        for (int i = 0; i < v+1; i++) {
            for(int j=0; j<=u; j++){
                System.out.print(gp[i][j]+ "    ");
            }
            System.out.println();
        }
    }
}
