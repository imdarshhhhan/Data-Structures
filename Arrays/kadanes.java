public class kadanes {
    static int maxSubArray(int[] nums) {
        int maxsum = Integer.MIN_VALUE;
        int cursum = 0;
        int n = nums.length ;

        for(int i=0; i<n;i++){
            cursum +=nums[i];

        maxsum = Math.max(cursum,maxsum);

       if (cursum<0) {
        cursum =0;
        
       }
        }
        return maxsum;
    }

public static void main(String args[]) {
    int nums[] = {-1,-2,-5};
   int result =  maxSubArray(nums);
    System.out.println(result);
}
}