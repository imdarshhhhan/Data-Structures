
// import java.util.HashMap;

// class Sulution {
//     public static int romanTOint(String str) {
//         HashMap<Character, Integer> map = new HashMap<>();
//     for(int i=0;i<str.length();i++){
//     switch(str.charAt(i)) {
//     case 'I':
//         map.put(str.charAt(i), 1);
//         break;

//     case 'V':
//         map.put(str.charAt(i), 5);
//         break;

//     case 'X':
//         map.put(str.charAt(i), 10);
//         break;

//     case 'L':
//         map.put(str.charAt(i), 50);
//         break;

//     case 'C':
//         map.put(str.charAt(i), 100);
//         break;

//     case 'D':
//         map.put(str.charAt(i), 500);
//         break;

//     case 'M':
//         map.put(str.charAt(i), 1000);
//         break;

//     }
// }  
//     // sum = map.get(str.charAt(0));
//     int sum = map.getOrDefault(str.charAt(0), 0);

//     for(int i=1;i<str.length();i++) {

//        int prev =  map.get(str.charAt(i-1));
//        int curr = map.get(str.charAt(i));
//         if(prev < curr ){
//           sum-=prev;
//         }
//         else if(prev> curr ){
//             sum+=curr;
//         }
//         else {
//             sum+=curr;
//         }
//     }
//         return sum;
//     }

//     public static void main(String[] args) {
//         String str = "IVLX";
//         int res = romanTOint(str);
//         System.out.println(res);
        
//     }
// }
// import java.util.*;

// class Sulution {
//     public static boolean isValid(String s) {
//         boolean res = true;
//         int n = s.length();
//         if(n%2!=0){
//             res = false;
//         }
//         HashMap<Character,Character> map = new HashMap<>();

//         map.put('(',')');
//         map.put('{','}');
//         map.put('[',']');
//         map.put(')','(');
//         map.put('}','{');
//         map.put(']','[');

 
//         for(int i=0,j=1;i<n;i++){
//             char ch = s.charAt(i);
//             char targetChar= map.get(ch);
//             if(s.charAt(j)==targetChar && (j-i)%2!=0){
//                 res = true;
//             }
//         }
     
//         for(int i=n-1,j=n-2;i>=0;i--){
//             char ch = s.charAt(i);
//             char targetChar= map.get(ch);
//             if(s.charAt(j)==targetChar && (i-j)%2!=0){
//                 res = true;
//             }
//         }
//         return res;
//     }


//     public static void main(String[] args){
//         String s = "()[";
//         boolean res = isValid(s);
//         System.out.println(res);
//     }
// }


class sulution {
    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
            else{
                return true;
            }
        }
        return false;
    }

    public static void main(String[] Darshan){
        int n=200;
        System.out.println(isPrime(n));
    }
}