import java.util.HashMap;
import java.util.Map;

public class P1 {

    public static int longestTwoDistinctEleSubarr(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        int i=0; 
        int max =0;
        for(int j =0; j<nums.length; j++){
            map.put(nums[j], map.getOrDefault(nums[j], 0)+1);
            while(map.size()>2){
                map.put(nums[i], map.get(nums[i]) -1);
                if(map.get(nums[i]) == 0){
                    map.remove(nums[i]);
                }
                i++;
            }
            max = Math.max(max, j-i +1);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(longestTwoDistinctEleSubarr(nums));
    }
}