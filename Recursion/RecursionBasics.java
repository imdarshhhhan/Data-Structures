

public class RecursionBasics {
    static void printDesc(int n){

        if(n==100){
            System.out.print(n);
            return;
        }
        System.out.print(n+ " ");
        printDesc(n+1);
    }

    static int  factorial(int n){
        if(n==0){
            return 1;
        }
        int res =  n*factorial(n-1);
        return res;
    }

    static int sumOfN(int n){
        if(n==1){
            return 1;
        }
        int sum = n+sumOfN(n-1);
        return sum; 
    }

    static int fibb(int n){
        if(n==0){
            return 0;
        }
            if(n==1){
            return 1;
        }
        int fibNm1= fibb(n-1);
        int fibNm2 = fibb(n-2);
        return fibNm1 + fibNm2;
    }


    static boolean isSorted(int[] arr , int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i+1]>arr[i]){
            return false;
        }
        boolean result = isSorted(arr,i+1);
        return result;
    }

    static int firstOccurence(int[] arr, int key , int i){
        if(i==0){
            return i;
        }
        if(arr[i]==key){
            return i;
        }
        int result = firstOccurence(arr, key, i-1);
        return result;
    }


    static int lastOcc(int[] arr, int key , int i){
        if(i==arr.length){
            return -1;
        }

        int isFound = lastOcc(arr, key, i+1);
        if(isFound==-1 && arr[i]==key){
            isFound = i;
            return isFound;
        }
        return isFound;
    }

    static int powerOfN(int x, int n, int i){
        int power = 1;
        if(i==n){
            return power;
        }
        power = powerOfN(2,10,i+1);
        return power;

    }

    static int binarySearch(int[] arr, int key,int start,int end){
        int mid = (start + end)/2;
        if(arr[mid]==key){
            return mid;
        }
        else if(arr[mid]>key){
            binarySearch(arr,key 0,mid);
        }
        else {
            binarySearch(arr, key,mid+1,end);
        }
        return -1;
    }



public static void main(String[] Darshan){
    int arr[] = {1,2,3,4,5,6,7,8,9};
    //int res = lastOcc(arr, 5,0);
    // int x = 2, n=10;
    // int res = powerOfN(x, n, 0);
    // System.out.print(res);  
    int start =0;
    int end = arr.length;
    int res = binarySearch(arr, 8, start, end);
    System.out.println(res);
    }
}