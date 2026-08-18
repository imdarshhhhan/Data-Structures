public class maxsum {
    static void printsub_arr_sum(int arr[]) {

        int max_sum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end  = j;
                currSum = 0;
                for(int k =start;k<end+1;k++){
                currSum +=arr[k];
                }
                System.out.println(currSum);

                if(max_sum < currSum) {
                    max_sum = currSum;
            }   
        }
    }
        System.out.print("max sum is :" + max_sum );        

    }
    public static void main(String args[]) {
        int arr[] = {1,2,3,4};
        printsub_arr_sum(arr);
        }
}
