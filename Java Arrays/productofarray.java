class productofarray {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int total = 1;

        // Step 1: calculate total product
        for(int i = 0; i < n; i++) {
            total *= nums[i];
        }

        // Step 2: divide by each element
        for(int i = 0; i < n; i++) {
            ans[i] = total / nums[i];
        }

        return ans;
    }

    public static void main(String args[]) {

        int[] nums = {1, 2, 3, 4};

        productofarray obj = new productofarray();

        int[] result = obj.productExceptSelf(nums);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}