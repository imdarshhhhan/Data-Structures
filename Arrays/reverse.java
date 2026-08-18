public class reverse {
    static void reverse_arr(int arr[]){
    int st=0,end=arr.length-1;
    while(st<end){
    int temp=arr[end];
    arr[end]=arr[st];
    arr[st]=temp;
        st++;
    end--;
    }
    }

    public static void main(String args[]) {
        int arr[]= {1,3,4,6,7,89,};
        reverse_arr(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

