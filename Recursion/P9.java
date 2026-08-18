
import java.util.ArrayList;
import java.util.List;

public class P9 {

    static List<List<String>> subSeq(String p , String up){

        if(up.isEmpty()){
            List<List<String>> res = new ArrayList<>();
            List<String> list = new ArrayList<>();
            list.add(p);
            res.add(list);
            return res;
        }
        char ch = up.charAt(0);
        List<List<String>> left = subSeq(p +ch, up.substring(1));
        List<List<String>> right = subSeq(p, up.substring(1));
        left.addAll(right);
            return left;

    }
    public static void main(String[] args) {
        
        List<List<String>> res = subSeq("", "ABC");
        System.out.println(res);
    }
}
