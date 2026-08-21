class P1 {

    public static void printName(int n){
        if(n==5){
            return;
        }
        printName(n+1);
        System.out.println("Darshan");

    }
    public static void main(String[] args) {
        printName(0);
        
    }
}