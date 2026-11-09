import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class DetectCycle {
    static int[] vis ;
    public static boolean isCycle(List<List<Integer>> adj) {
        int v = adj.size();
        vis = new int[v];
        
        for(int i =0; i<v; i++){
            if(vis[i] !=1){
                if(checkForCycle(v, i, adj)){
                    return true;
                }
            }
        }
        return false;
    }
    private static boolean checkForCycle(int v, int src, 
    List<List<Integer>> adj){
        vis[src] = 1;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(src, -1));
        while(!q.isEmpty()){
            Pair p = q.poll();
            int node = p.src;
            int parent = p.parent;
            for(int adjNode : adj.get(node)){
                if(vis[adjNode] != 1){
                    vis[adjNode] =1;
                    q.add(new Pair(adjNode,node));
                }
                else if(parent !=adjNode){
                    return true;
                }
            }
        }
        
        return false;
    }
    public static void main(String[] args) {
        List<List<Integer>> adj = new ArrayList<>();
        List<Integer> li = new ArrayList<>();

        li.add(2);li.add(3);
        adj.add(new ArrayList<>(li));
        li.clear();
        li.add(1);li.add(5);
        adj.add(new ArrayList<>(li));
        li.clear();
        li.add(1);li.add(6);
        adj.add(new ArrayList<>(li));
        li.clear();
        li.add(2);li.add(7);
        adj.add(new ArrayList<>(li));
        li.clear();
        li.add(3);li.add(7);
        adj.add(new ArrayList<>(li));
        li.clear();
        li.add(5);li.add(6);
        adj.add(new ArrayList<>(li));
        li.clear();

        System.out.println(isCycle(adj));
    }
}
class Pair {
    int src, parent;
    Pair(int s, int p){
        this.src = s;
        this.parent = p;
    }
}