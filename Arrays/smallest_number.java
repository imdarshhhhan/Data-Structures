public class smallest_number {
       static int get_smallest(int arr[]){
         int smallest = Integer.MAX_VALUE;    //+ infinity

        for(int i=0;i<arr.length;i++){

            if(smallest>arr[i]){
            smallest = arr[i];
            }
    } 
    return smallest;
 }

public static void main(String args[]) {
    int arr[] = {1,4,3,6,7,3,9,45,87,23,452};
    int el = get_smallest(arr);
    System.out.println("smallest element is : "+ el);
}

}
