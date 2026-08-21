public class largest_number {
    static int get_largest(int arr[]){
        int largest = Integer.MIN_VALUE;    //-INFINITY
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
            largest = arr[i];
            }
    } 
    return largest;
 }

public static void main(String args[]) {
    int arr[] = {1,4,3,6,7,3,9,45,87,23,452};
    int el = get_largest(arr);
    System.out.println("largest element "+ el);
}

}
