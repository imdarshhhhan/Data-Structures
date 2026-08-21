public class ParameterisedRec {

    public static void sumofNatural(int i , int n , int sum){
        if(i>n){
            System.err.println(sum);
            return;
        }

        sumofNatural(i+1, n ,sum+i);
    }
    public static void main(String[] args) {
        sumofNatural(1, 10, 0);
    }
}
