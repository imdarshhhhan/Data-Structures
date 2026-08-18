public class bintodec {
    public static void bintodec(int n) {
        int myNum = 101;
        int pow=0;
        int decnum = 0;
        while(n>0) {
            int lastDigit = n%10;
            decnum = decnum + lastDigit *((int)Math.pow(2,pow));
            pow++;
            n = n/10;
        }
        System.out.println("decimal number of " + myNum + " " + "is" + " " + decnum);


 }
    public static  void dectobin(int n) {
        int binNum = 0;

        while(n>0) {
            int rem = n%2;
            binNum = binNum*10+ rem;
            n=n/2;
        }
        System.out.println(binNum);
    }
    public static void main(String args[]) {
    dectobin(9);
    }
}
