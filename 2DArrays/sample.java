class sample {

    public void sortColors(int[] nums) {
        int n = nums.length;
        int[] count = new int[3];

        // Count frequency
        for (int i = 0; i < n; i++) {
            count[nums[i]]++;
        }

        // Print count array
        System.out.println("Count array:");
        for (int i = 0; i < count.length; i++) {
            System.out.println("Index " + i + " -> " + count[i]);
        }
    }

    public static void main(String[] args) {
        sample obj = new sample();

        // Sample input (like LeetCode sortColors: 0,1,2)
        int[] nums = {2, 0, 2, 1, 1, 0};

        obj.sortColors(nums);
    }
}