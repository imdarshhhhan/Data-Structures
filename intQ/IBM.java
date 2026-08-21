public class IBM {

    static int difference(String s){
        int n = s.length();
        int mid = n/2;
        int n1 = Integer.parseInt(s.substring(0,mid));
        int n2 = Integer.parseInt(s.substring(mid,n));
        return n2-n1;
    }
    public static void main(String args[]){
        String s = "122123";
        System.out.println(difference(s));
    }
}