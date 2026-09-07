class LibMngmtSys {
    
    boolean checkBook(int count){
        if(count >0){
            System.out.println("Book is Availbale ! you can purchase Now");
            return true;
        }
        return false;
    }
    void purchaseBook(int count){
        if(checkBook(count)){
            count--;
            System.out.println("You have sucessfully purchased the book , Come again!");
        }
    }
    void submitBook(int count){
        count++;
        System.out.println("Thank you for submission , Come again!");
    }
    void renevalBook(){
        
    }
    public static void main(String[] args) {
        
    }
}