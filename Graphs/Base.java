
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Base {
    public static void main(String[] args) {
       List<List<Integer>> gp = new ArrayList<>();

       int v = 8;
       for(int i =0; i<v; i++){
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

       System.out.println(BfsTraversal(gp,1,v));
    
   } 
}