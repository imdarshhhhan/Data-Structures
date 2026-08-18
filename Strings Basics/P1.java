class P1 {

    public static String zigZag(String str ,int k){
        if(k==1 ||str.length() <k)return str;

        StringBuilder [] arr = new StringBuilder[k];

        for(int i =0;i<k;i++){
            arr[i] = new StringBuilder();
        }


        int row = 0;
        boolean goingDown = false;;
        for(char ch : str.toCharArray()){
            arr[row].append(ch);
        
        if(row==0 || row == k-1){
            goingDown = !goingDown;
        }

            row+=goingDown?1:-1;
        }
        StringBuilder sbb = new StringBuilder();
        for(StringBuilder sb : arr ){
            sbb.append(sb);
        }
        return sbb.toString();
    }
    public static void main(String args[]){
        String str = "PAYPALISHIRING";
        int k  = 3;

        String res = zigZag(str, k);
        System.out.println(res);
    }
}