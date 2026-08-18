public class P3 {

    public static void backTrck(int n){

        if(n==10)return;

        backTrck(n+1);
        System.out.println(n);

    }

    public static int sumOfirstN(int n){
        if(n==1){
            return 1;
        }

        int res = n + sumOfirstN(n-1);
        return res;
    }

    public static int facto(int n){
        if(n==1)return 1;

        return n*facto(n-1);
    }

    public static int fibbo(int n){
        if(n<3)return 1;
        int res = fibbo(n-1) + fibbo(n-2);
        return res;
    }

    public static void main(String[] args) {+
        //backTrck(1);
        //int ans = sumOfirstN(10);
        System.out.println(fibbo(6));
    }
}
