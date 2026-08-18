
// public class sulution {
//     public static boolean isPrime(int n){
//         for(int i=2;i<=Math.sqrt(n);i++){
//             if(n%i==0){
//                 return false;
//             }
//             else{
//                 return true;
//             }
//         }
//         return false;
//     }

//     public static void main(String[] Darshan){
//         int n=2;
//         System.out.println(isPrime(n));
//     }
// }



// public class Solution {
//         public static int lengthOfLastWord(String s) {
//             int idx = 0;
//             s =s.trim();
//             for(int i =s.length()-1;i>=0;i--) {
//                 if(s.charAt(i)==' '){
//                     idx =s.length()-i-1;
//                     break; 
//                 }
//             }
//             return idx;
//         }

//     public static void main(String[] Darshuuu) {
//         String s = "hello world darshan is good boy  gentle alooooo";
//         int res = lengthOfLastWord(s);
//         System.out.println(res);
//     }
// }


// class Solution {
//     public static char[] reverseString(char[] s) {
//         int left =0, right =s.length-1;
//         while(left<right){
//             char temp = s[left];
//             s[left]=s[right];
//             s[right]=temp;


//             left++;
//             right--;
//         }
//         return s;
//     }
      


//     public static void main(String[] darshan){
//         char[] s= {'h','e','l','l','o'};
//         char[] res = reverseString(s);
//         for(char ch :res){
//             System.out.println(ch+" ");
//         }
//     }
// }
//     public static boolean wordPattern(String pattern, String s) {
//        HashMap<String,Integer> map1 = new HashMap<>();
//         HashMap<Character,Integer> map2 = new HashMap<>();
     
//         String[] arr =s.split(" "); 
//         for(int i=0;i<arr.length;i++){
//             map1.put(arr[i],map1.getOrDefault(arr[i],0)+1);
//             map2.put(s.charAt(i),map2.getOrDefault(s.charAt(i),0)+1);
//         }
//         if (map1.equals(map2)){
//             return true;
//     }
//     return false;
//     }


//     public static void main(String[] args) {
//         String pattern = "abba";
//         String s = "dog cat cat dog";
//         boolean res = wordPattern(pattern,s);
//         System.out.println(res);
//     }
// }


class Solution {

    public static String reverseVowels(String s) {

        StringBuilder sb = new StringBuilder(s);

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (!isVowel(sb.charAt(left))) {
                left++;
            }
            else if (!isVowel(sb.charAt(right))) {
                right--;
            }
            else {

                char temp = sb.charAt(left);

                sb.setCharAt(left, sb.charAt(right));
                sb.setCharAt(right, temp);

                left++;
                right--;
            }
        }
        System.out.println(sb);
        return sb.toString();
    }

    public static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }

    public static void main(String[] args) {

        String s = "IceCreAm";

        System.out.println(reverseVowels(s));
    }
}