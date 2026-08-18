import java.util.LinkedList;
public class linkedlist {
    public static void main(String args[]) {
        var cars = new  LinkedList<Integer>();
        cars.addFirst(1);
        cars.addFirst(3);
        cars.addFirst(2);

        for(int i =0;i<cars.size();i++) {
            System.out.println(cars.get(i));
        }
    }
}