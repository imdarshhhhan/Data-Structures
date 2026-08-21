public class BinarySearch {
    static int BS(int arr[],int key){
        int st=1,end=arr.length-1;
        while(st<=end) {
    int mid = (st+end)/2;

            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>=key) {
                end = mid-1;
            }
            else{
                st = mid+1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int key  = 8;

        int index = BS(arr,key);
        System.out.println("key at :"+ index);
    }
}
