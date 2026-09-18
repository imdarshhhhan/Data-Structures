class MaxConOnes2 {
    public static int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        int maxLen = 0;
        if(n == 1)return 1;
        if(n == k)return k;
        for(int j= 0; j<n; j++){
            if(nums[j] == 0)k--;
            while(k <0){
                if(nums[i] == 0){
                    k++;
                }
                i++;
            }
            maxLen = Math.max(maxLen , j - i+1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] nums = {0,0};
        System.out.println(longestOnes(nums,1));
    }
}