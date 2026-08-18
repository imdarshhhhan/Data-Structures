

public class pairs {
    static void get_pairs(int arr[]) {  
        int ct=0;
    for(int i=0;i<arr.length;i++){
    int curr = arr[i];
    for(int j=i+1;j<arr.length;j++){
        System.out.print("("+ curr + "," + arr[j]+ ")");
        ct++;
    }
        System.out.println();

    }
    System.out.println("total pairs : " + ct);
}


public static void main(String args[]) {
    int arr[] = {1,2,3,4,5,6,7,8,9};
    get_pairs(arr);

}
}