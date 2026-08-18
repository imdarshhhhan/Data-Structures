public class subArray {
    static void printsub_arr(int arr[]) {
        int sum= 0;
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end  = j;
                for(int k =start;k<end+1;k++){
                    sum +=k;
                    System.out.print(arr[k]+ " ");
                }   
                System.out.println();        
        }
        System.out.println();
    }
    System.out.println(sum);
    }


    public static void main(String args[]) {
        int arr[] = {1,2,3,4};
        printsub_arr(arr);
        }
}

