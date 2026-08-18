
import java.util.ArrayList;

public class P2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for(int num : list){
            System.out.println(num*num);
        }
        for(int n : list){
            System.out.println(n*n); 
        }
    }
}
