public class primerange {
    public static int primerange(int n) {
        for(int i=2;i<=Math.sqrt(n);i++) {
            if (n%i!=0) {
                System.out.println(i);
            }
        }
        return 1;
    }
    public static void main(String args[]){
        System.out.println(primerange(100));
    }
}
