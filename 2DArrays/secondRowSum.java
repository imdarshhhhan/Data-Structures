public class secondRowSum {
    public static int sumOfSecond(int[][] nums) {
        int m = nums.length;
        int n = nums[0].length;
        int sum = 0;
        for(int i=0;i<n;i++) {
            sum+=nums[1][i];
        }
        return sum;
    }



    public static void main(String[] args) {
        int[][] nums = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int res = sumOfSecond(nums);
        System.out.println(res);
    }
 }