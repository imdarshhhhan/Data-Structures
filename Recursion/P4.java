class P4 {


    public static void reverseArr(int[] arr ,int left , int n){
        if(left>=n/2)return ;

        swap(arr, left, n-left-1);
        reverseArr(arr, left+1, n);
    }

    private static void swap(int[] arr , int left , int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static boolean isPal(String s, int i,int n){
        if(i>=n/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(n-i-1))return false;
        return isPal(s,i+1,n);
    }
    public static void main(String args[]){
        String s = "MADAM";
        int n = s.length();
        System.err.print(isPal(s, 0, n));

    }
}