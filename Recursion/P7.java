public class P7 {
    static void ms(int[] arr, int low, int high){
        if(low>=high){
            return;
        }
            int mid = low + (high - low)/2;

            ms(arr, low, mid);
            ms(arr, mid+1,high);

            merge(arr, low, mid, high);
        }


    static void merge(int[] arr, int low, int mid, int high){
        int[] temp = new int[high-low+1];

        int left = low;
        int right = mid+1;
        int k = 0;

        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp[k++] = arr[left++];
            }
            else {
                temp[k++] = arr[right++];
            }
        }

        //copy the left over elements in the left half
        while(left<=mid){
            temp[k++] = arr[left++];
        }
        //right half
        while(right<=high){
            temp[k++] = arr[right++];
        }

        //copy the elemts to original array
        for(int i = 0;i<temp.length;i++){
            arr[i+low] = temp[i];
        }
    }


    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2};

        int n = arr.length;
        ms(arr, 0, n-1);
        for(int num : arr){
            System.out.println(num);
        }
    }
}
