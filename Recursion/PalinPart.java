import java.util.ArrayList;
import java.util.List;


//Sub strings without duplicates
class PalinPart {
    static List<List<String>> ans;
    static List<List<String>> subStrings(String s){
        List<String> temp = new ArrayList<>();
        ans = new ArrayList<>();
        helper(s, temp);
        return ans;
        
    }

    static void helper(String s, List<String> temp ){
        if (s.length() == 0) {
            ans.add(new ArrayList<>(temp));
            return ;
        }
        for(int i =0; i<s.length(); i++){
            String part = s.substring(0,i+1);
            if(!temp.contains(part)){
                temp.add(part);
                helper(s.substring(i+1), temp);
                temp.removeLast();
            }
        }

    }
    public static void main(String[] args) {
        System.err.println(subStrings("aab"));
    }
}