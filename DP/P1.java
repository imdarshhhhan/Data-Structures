//factorail of num using DP
import java.util.Arrays;
public class P1 {
    static int fact(int[] dp , int n){
        if(n<2){
            return n;
        }
        if(dp[n] != -1)return dp[n];

        return fact(dp, n -1) + fact(dp, n -2);
    }

    static int factOof1Space(int n){
        int prev1 = 1;
        int prev2 = 0;
        int curr =0;
        for(int i =2 ;i <= n; i++){
            curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return curr;
    }
    public static void main(String[] args) {
        int n = 6;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(factOof1Space(n));

    }
}