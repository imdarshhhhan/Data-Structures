class P5 {
    public static int compareVersion(String v1, String v2) {
        StringBuilder sb1 = new StringBuilder("");
        StringBuilder sb2 = new StringBuilder("");

        int m = v1.length();
        int n = v2.length();
        int i = 0;
        while(i < m){
            if(sb1.contains(".")){
                if(v1.charAt(i) != '.'){
                    sb1.append(v1.charAt(i));
                }
            }
            i++;
        }
        int j = 0;
        while(j < n){
            if(sb2.contains(".")){
                if(v2.charAt(j) != '.'){
                    sb2.append(v2.charAt(j));
                }
            }
            j++;
        }
        System.out.println(sb1);
        System.out.print(sb2);
        return 0;
    }
    public static void main(String args[]){
        String v1 = "1.001";
        String v2 = "1.00";
        System.out.print(compareVersion(v1,v2));
    }
}