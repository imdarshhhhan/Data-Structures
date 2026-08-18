public class mergeSort {
    public static void merge_sort(int[] arr, int left, int right) {
        if(left<right) {
            int  mid = (left + right)/2;
            merge_sort(arr,left,mid);
            merge_sort(arr,mid+1,right);
            merge(arr,left,mid,right);

        }
    }

    public static void merge(int[] arr, int left, int mid,  int right) {
            int l_size = mid -left +1;
            int r_size = right - mid ;

            int[] left_temp  = new int[l_size];
            int[] right_temp = new int[r_size];

            for(int i=0;i<l_size;i++) {
                left_temp[i] = arr[left + i];
            }
            for(int j=0;j<r_size;j++) {
                right_temp[j] = arr[mid + 1+ j];
            }
            int i =0,j=0, k = left;
            while(i<l_size && j< r_size) {
                if(left_temp[i]<=right_temp[j]){
                    arr[k] = left_temp[i];
                    i++;
                }
                else {
                    arr[k] = right_temp[j];
                    j++;
                }
                k++;
            }
        while(i<l_size) {
            arr[k] = left_temp[i];
            i++;
            k++;
        }

         while(j<r_size) {
            arr[k] = right_temp[i];
            j++;
            k++;
        }

    }
    public static void main(String args[]) {
        int[] arr = {3,4,2,8,1,5,7,4,6};
         merge_sort(arr,0,arr.length-1);
        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
