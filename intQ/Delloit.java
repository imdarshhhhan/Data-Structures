public class Delloit {
    static int removeDuplicate(int[] arr){
        int n = arr.length;
        int left = 0;
        for(int right = 0; right <n; right ++){
            if(left<2 || arr[left -2] != arr[right]){
                arr[left] = arr[right];
                left++;
            }
        }
        return left;
    }

    
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,1,2,2,3,3};
        System.out.println(removeDuplicate(arr));
    }
}
