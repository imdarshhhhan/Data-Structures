public class S1 {
    static boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int[] prefix = new int[n+1];
        prefix[0] = nums[0];
        if(n==1 && prefix[0]%k==0)return false;
        

        for(int i =1;i<n;i++){
            
            prefix[i] = prefix[i-1]+nums[i];
            if(prefix[i]%k==0)return true;
            int j = 0;

            while(j<i){
                int x = prefix[i]-prefix[j];

                if(i-j>1 && x%k==0)return true;
                j++;
            }
            j=0;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,0};
        int k = 2;
        boolean res = checkSubarraySum(nums,k);
        System.out.print(res);
    }
}