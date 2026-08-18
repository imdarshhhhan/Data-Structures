public class P6 {

    static void quickSort(int[] arr, int low , int high){
        if(low<high){
            int pivotIdx = partition(arr,low,high);

            quickSort(arr, low, pivotIdx-1);
            quickSort(arr, pivotIdx+1, high);
        }
    }

    static  int partition(int[] arr, int low , int high){
        int pivot = arr[high];
        int i = low-1;

        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);

        return i+1;

    }

    static void swap(int[] arr , int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2};

        int n = arr.length;
        System.err.print("before sorting :");

        for(int num : arr){
            System.err.print(num+" ->");
        }
        quickSort(arr,0, n-1);
        System.out.print("after sorting  : ");
        for(int num : arr){
            System.out.println(num);
        }
    }
}
