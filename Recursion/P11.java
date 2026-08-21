import java.util.ArrayList;
import java.util.List;

class P11 {

    static void subSet(int[] arr, List<Integer> list , int idx){

        int n = arr.length;

        if(idx==n){
            System.out.println(list);
            return;
        }
        //take the element 
        list.add(arr[idx]);
        subSet(arr,list, idx+1);

        //backtrack (not take)

        list.remove(list.size()-1);
        subSet(arr,list, idx+1);
    }


     List<List<Integer>> subSetReturn(int[] arr ,int idx){


        int n = arr.length;

        if(idx==-1){
        List<List<Integer>> outer = new ArrayList<>();
            outer.add(new ArrayList<>());
            return outer;
        }

        List<List<Integer>> left = subSetReturn(arr, idx-1);
            int len = left.size();
            for(int i=0;i<len;i++){
                List<Integer> inner = new ArrayList<>(left.get(i));
                inner.add(arr[idx]);
                left.add(inner);
            }
            
        return left;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        P11 pp = new P11();
        System.out.println("subsets are : " + pp.subSetReturn(arr, 2));
        
    }
}