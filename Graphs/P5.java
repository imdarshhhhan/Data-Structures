
import java.util.ArrayList;
import java.util.List;

class P5 {

    static int noOfProvins(List<List<Integer>> gp, int v){
        List<Integer> list = new ArrayList<>();
        boolean[] vis = new boolean[v+1];
        int cnt = 0;
        for(int i=1; i<vis.length; i++){
            if(vis[i] != true){
                dfs(gp, vis, i,list);
                cnt++;
            }
        }
        return cnt;
    }
    static void dfs(List<List<Integer>> gp, boolean[] vis, int node, List<Integer> list){
        
        vis[node] = true;
        list.add(node);

        for(int item : gp.get(node)){
            if(vis[item] != true){
                vis[item] = true;
                dfs(gp, vis, node,list);
            }
        }
    }


    public static void main(String[] args) {
       List<List<Integer>> gp = new ArrayList<>();

       int v = 6;
       for(int i =0; i<=v; i++){
            gp.add(new ArrayList<>());
       }
       gp.get(1).add(2);
       gp.get(1).add(3);

       gp.get(2).add(1);

       gp.get(3).add(1);


       gp.get(4).add(5);

       gp.get(5).add(4);


       System.out.println(noOfProvins(gp, v));
    
   } 
}