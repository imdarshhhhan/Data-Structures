class P5 {

    public static void bubbleSort(int[] arr , int i , int n){
        if(n==1 || n==0)return;

        if(i>=n-1){
            bubbleSort(arr, 0, n-1);
            return;
        }

        if(arr[i]>arr[i+1]){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        bubbleSort(arr, i+1, n);

    }

    public static void insertionSort(int[] nums, int n) {
        /*for(int i =1;i<n;i++){
            int key = nums[i];
            int j = i-1;

            while(j>-1 && nums[j]>key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }*/

        if(n<2){
            return;
        }
        insertionSort(nums,n-1);

        int key = nums[n-1];
        int j = n-2;

        while(j>=0 && nums[j]>key){
            nums[j+1] = nums[j];
            j--;
        }

        nums[j+1] = key;
      
    }

    public static void quick(int[] arr , int n){
        
    }

            public static void main(String[] args) {
        int[] nums = {5,1,-1,4,9,2,100,45};

        int n = nums.length;
        for(int num : nums){
            System.err.print(num + "->");
        }
        System.err.println();
        insertionSort(nums, n);
        System.err.println("after sorting : ");
        for(int num : nums){
            
            System.err.println(num + " ");
        }
    }
}