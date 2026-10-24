
import java.util.*;
class P2 {
    public static List<Integer> targetIndices(int[] nums, int target) {
        int n = nums.length;
        TreeSet<Integer> ts = new TreeSet<>();
        Arrays.sort(nums);
        int l = 0, r = n-1;
        while(l <r){
            int m = l + (r -l)/2;
            if(nums[m] == target){
                int i= m , j = m;
                while(i >= 0 && nums[i] == target){
                    ts.add(i);
                    i--;
                }
                while(j < n && nums[j] == target){
                    ts.add(j);
                    j++;
                }
                break;
            }
            else if(nums[m] > target) r = m -1;
            else {
                l = m +1;
            }
        }
        return new ArrayList<>(ts);
    }
    public static void main(String args[]){
        System.out.print(targetIndices(new int[]{1,2,2,3,5},2));
    }
}