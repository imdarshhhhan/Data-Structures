class P1 {
    public static int longestSubarray(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int maxLen = 0;
        int sum = 0;
        for(int right = 0;right<n;right++){
            sum += nums[right];
            if(sum == k){
                maxLen = Math.max(maxLen, right - left + 1);
            }
            else if (sum>k){
                while(sum>k){
                    sum-=nums[left];
                    left++;
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {10,5,7,2,1,-10};
        int k = 15;
        System.out.println(longestSubarray(nums,k));
    }
}