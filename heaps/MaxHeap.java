import java.util.ArrayList;
import java.util.List;

class MaxHeap {
    public static void insert(List<Integer> maxhp , int val){
        maxhp.add(val);
        int i = maxhp.size() -1;

        while(i >0){
            int parentIdx = i/2;
            if(maxhp.get(parentIdx) < maxhp.get(i)){
                swap(i,parentIdx, maxhp);
                i = parentIdx;
            }
            else {
                return;
            }
        }
    }
    static void swap(int f, int s , List<Integer> list){
        int temp = list.get(s);
        list.set(s,list.get(f));
        list.set(f,temp);
    }
    public static void main(String[] args) {
        int[] arr = {2,1,6,4,45,32,23,9,67};
        List<Integer> maxHeap = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            insert(maxHeap, arr[i]);
        }

        System.out.println(maxHeap);
    }
}