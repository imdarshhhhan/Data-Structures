import java.util.ArrayList;
import java.util.List;


class Pair{
    int v;
    int w;
    Pair(int v , int w){
        this.v = v;
        this.w = w;
    }
}
public class P4 {
    public static void main(String[] args) {
        
        List<List<Pair>> gp = new ArrayList<>();

        int n = 5;
        for(int i =0; i < n; i++){
            gp.add(i,new ArrayList<>());
        }
        gp.get(1).add(new Pair(2,10));
        gp.get(2).add(new Pair(1,10));

        gp.get(2).add(new Pair(4,20));
        gp.get(4).add(new Pair(2,20));

        gp.get(1).add(new Pair(3,40));
        gp.get(3).add(new Pair(1,40));

        gp.get(4).add(new Pair(4,30));

        for(int i =0; i<n; i++){
            for(int j =0; j < gp.get(i).size(); j++){
                System.out.print("( vertex :" + gp.get(i).get(j).v + ", weight :" +gp.get(i).get(j).w + ")");
            }
            System.out.println();
        }
    }


}