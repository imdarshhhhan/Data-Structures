import java.util.*;

public class Conditions {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int but  = sc.nextInt();

        if(but==1) {
            System.out.println("hello");
        }
        else if (but ==2){
            System.out.println("namaste");
        }
        else if(but==3) {
            System.out.println("bonjur");
        }
        else{
            System.out.println("invalid ");
        }
    }
}