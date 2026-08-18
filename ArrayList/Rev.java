import java.util.*;

public class Rev {
    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(4);
        list.add(6);
        for(int i=0;i<list.size();i++) {
            int temp = list.get(1);
            list.set(1,list.get(3));
            list.set(3,temp);
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
