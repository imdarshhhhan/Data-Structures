public class AddStr {
    public static String addStrings(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        char ch1 ;
        char ch2 ;
        int right = n-1;
        int ptr = m-1;
        int n1=0;
        int n2 = 0;
        int sum =0;
        int carry =0;
        StringBuilder sb = new StringBuilder("");

        while(right>=0 || ptr>=0||carry ==1){
        while(right>=0){
            ch1 = num2.charAt(right);
            n1 = ch1;
            right--;
        }
        while(ptr>=0){
            ch2 = num1.charAt(ptr);
            n2 = ch2;
            ptr--;
        }
        if(carry==1){
        sum = n1+n2+carry;
        }
        else {
            sum = n1+n2;
        }
        if(sum>=10){
        sb.append(sum%10);
        carry = 1;
        }
        else {
            sb.append(sum);
        }
        sum=0;
      }
      return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String num1 = "121";
        String num2 = "23";
        String res = addStrings(num1,num2);
        System.out.println(res);
    }
}