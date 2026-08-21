public class twiceElement {

    static boolean check_twice(int arr[]) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {  // better loop
                if(arr[i] == arr[j]) {
                    return true;  // found duplicate
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};

        boolean result = check_twice(arr);

        if(result) {
            System.out.println("Duplicate element exists");
        } else {
            System.out.println("All elements are unique");
        }
    }
}