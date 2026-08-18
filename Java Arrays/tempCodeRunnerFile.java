
class productofarray {
    public static int arr_product(int[] nums, int n ) {
        ArrayList<Integer> ans = new ArrayList<>(n);
        int product = 1;
        for(int i=0;i<n;i++) {
            product *=nums[i];
            ans.add(product);
    }
        return product;

    }


    public static void main(String args[]) {
        int[] nums = {1,2,3,4};
        int n = nums.length;

        int result = arr_product(nums, n);
        System.out.println("product is :"  + result);

        for(int i=0;i<ans.length;i++) {
            System.out.println(ans[i]);
        }

    }
}