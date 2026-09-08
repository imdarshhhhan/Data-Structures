
import java.util.ArrayList;
import java.util.List;

class Dfs {
    static List<Integer> dfsTraversal(List<List<Integer>> gp,int node,  int v){
        int[] vis = new int[v+1];
        List<Integer> list = new ArrayList<>();
        helper(gp,node,v,vis,list);
        return list;
    }
    static void helper(List<List<Integer>> gp,int node,  int v, int[] vis ,  List<Integer> list){
        vis[node] = 1;
        list.add(node);

        for(int num : gp.get(node)){
            if(vis[num] == 0){
                helper(gp, num, v, vis, list);
            }
        }
    }
    public static void main(String[] args) {
       List<List<Integer>> gp = new ArrayList<>();

       int v = 7;
       for(int i =0; i<=v; i++){
            gp.add(new ArrayList<>());
       }
       gp.get(1).add(2);
       gp.get(1).add(3);

       gp.get(2).add(1);
       gp.get(2).add(4);
       gp.get(2).add(5);

       gp.get(3).add(1);
       gp.get(3).add(6);
       gp.get(3).add(7);

       gp.get(4).add(2);

       gp.get(5).add(2);

       gp.get(6).add(3);

       gp.get(7).add(3);

       System.out.println(dfsTraversal(gp,1,v));
    
   } 
}