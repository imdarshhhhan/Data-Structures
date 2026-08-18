public class factr{
    public static int fact(int n){
    int factt =1;
   for(int i =1; i<=n;i++) {
    factt*=i;
   }
   return factt;
}

 public static void main(String args[]) {
    int result = fact(7);
    System.out.println(result);
 }
}