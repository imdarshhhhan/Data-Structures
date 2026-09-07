import java.util.ArrayList;
import java.util.List;

//adjacency list representation

class P2 {
    public static void main(String[] args) {
        List<List<Integer>> graph = new ArrayList<>();
        int v= 5;
        for (int i = 0; i <= v; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(1).add(2);
        graph.get(1).add(3);

        graph.get(2).add(1);
        graph.get(2).add(4);

        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(3).add(5);

        graph.get(4).add(2);
        graph.get(4).add(3);
        graph.get(4).add(5);

        graph.get(5).add(3);
        graph.get(5).add(4);
      
        for(int i = 0 ;i <=v; i++){
            for (int j = 0; j < graph.get(i).size(); j++) {
                System.out.print(graph.get(i).get(j) + "  ");
            }
            System.out.println();
        }


    }
}