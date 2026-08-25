public class P3 {
    static int sumOfDig(int n){
        int sum=0;
        for(; n>0; n/=10){
            sum+=(n % 10);

        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOfDig(123));
    }
}
