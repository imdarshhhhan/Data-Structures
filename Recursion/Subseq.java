public class Subseq {
    static void subSeqGen(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subSeqGen(p + ch, up.substring(1));
        subSeqGen(p, up.substring(1));
    }

    static void subSet(int[] arr){
        int n = arr.length;

        
    }
    public static void main(String[] args) {
        subSeqGen("","abc");
    }
}
