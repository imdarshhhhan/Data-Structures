public class P12 {

    static int fibboIter(int n){
        int i = 0;
        int a = 0, b = 0 ,c = 1;
        
        while(i<n-1){
            a = b;
            b = c;
            c = a + b;
            i++;
        }
        return c;
    }

    static void tae(int n){
        
    }

    public static void main(String[] args){
        System.out.println(fibboIter(6));
    }
}
