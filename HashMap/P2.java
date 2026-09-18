import java.util.*;

public class P2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Darshan");
        list.add("Rahul");
        list.add("Arjun");
        list.add("Kiran");
        list.add("Vikram");
        list.add("Rohit");
        list.add("Aditya");
        list.add("Suresh");
        list.add("Manoj");
        list.add("Akash");
        list.add("Prakash");
        list.add("Nikhil");
        list.add("Varun");
        list.add("Karthik");
        list.add("Anil");
        list.add("Ravi");
        list.add("Surya");
        list.add("Abhishek");
        list.add("Harish");
        list.add("Vivek");

        Map<String ,Integer> map = new HashMap<>();
        for(String item : list){
            map.put(item, item.length());
        }
        Map<String, Integer> m2 = new TreeMap<>();

        for(String it : list){
            if(it.length()>5)map.put(it,it.length());
        }
        System.out.println(map);
        for()
    }
}
