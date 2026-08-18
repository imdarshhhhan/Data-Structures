
import java.util.ArrayList;

public class P8 {


    static boolean  isSortedd(int[] arr ,int i, int n ){
        if(i==n-1){
            return true;
        }
        return arr[i]<arr[i+1] && isSortedd(arr, i+1, n);
    }

    static int linearSearch(int[] arr, int i, int k){
        int n = arr.length;
        if(i==n){
            return -1;
        }
        if(arr[i]==k){
            return i;
        }

        return linearSearch(arr, i+1, k);
    }

    static ArrayList<Integer> findAllIdx(int[] arr, int i, int k){
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        if(i==n){
            return list;
        }

        if(k == arr[i]){
            list.add(i);
        }

        ArrayList<Integer> ans = findAllIdx(arr, i+1, k);
        list.addAll(ans);
        return list;
    }
    public static void main(String[] args) {

        int[] arr = {1,5,2,3,5,4,5,6};
        System.out.println(findAllIdx(arr, 0, 5));
        
    }
}
