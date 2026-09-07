
public class P1 {
    
    //adj matrix represenation
    public static void main(String[] args){
        int u = 4, v = 4;

        int[][] graph = new int[u+1][v+1];

        graph[1][2] = 1;
        graph[2][1] = 1;

        graph[1][3] = 1;
        graph[3][1] = 1;

        graph[2][4] = 1;
        graph[4][2] = 1;

        graph[3][4] = 1;
        graph[4][3] = 1; 


        for(int i = 0; i<v+1; i++){
            for(int j = 0; j<u+1; j++){
                System.out.print(graph[i][j]+ "  ");
            }
            System.out.println();
        }
    }
}
