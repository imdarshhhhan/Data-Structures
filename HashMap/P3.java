
import java.util.HashMap;

class P3 {
    public static int maxBinarySubArr(int[] arr, int k){
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0,1);
        int n = arr.length;
        int pre = 0;
        int cnt =0;
        for(int i=0; i<n; i++){
            pre += arr[i];
            if(map.containsKey(pre - k)){
                cnt += map.get(pre - k);
            }
            map.put(pre, map.getOrDefault(pre,0)+1);
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1,0,1};
        System.out.println(maxBinarySubArr(arr ,2));
    }
}