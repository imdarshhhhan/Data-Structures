public class countInversions {
    public static int count(int[] arr) {
        int count = 0;
        int n = arr.length;
        for(int i=0; i<n;i++) {
            for(int j =i+1;j<n;j++) {
                if(arr[i]>arr[j]){
                    swap(arr, i, j );
                    count+=1;
                }
            }
        }
        return count;

    }
    public static void swap(int[] arr, int a , int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


    public static void main(String args[]) {
        int[]  arr = {2,4,1};
        System.out.println("count is " + count(arr));
    }
}
