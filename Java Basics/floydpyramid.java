public class floydpyramid {
    /*floydpyramidpublic static void floydpyramid(int n) {
        int counter =1;
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }*/
    public static void zero_one_triangle(int n) {
        for(int i=1; i<=n;i++) {
            for(int j=1;j<=i;j++){
                if((i+j)%2==0) {
                    System.out.print(1);
                }
                else if((i+j)%2!=0){
                    System.out.print(0);
                }
                
            }
            System.out.println();
        }
    }
    public static void butterfly_pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==4||i==5||j==1||j==8){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }


    public static void solid_rombus(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");

            }
            for(int j=1;j<=n;j++){
                System.out.print("*"+" ");
            }
        
            System.out.println();
        }
    }

    public static void hollow_rombus(int n) {
        for(int i=1;i<=n;i++){
          for(int j=1;j<=n-i;j++){
                System.out.print("  ");
          }
          for(int j=1;j<=n;j++){
                    if(i==1||i==n||j==1||j==n){
                System.out.print("*"+" ");
            }
            else{
                System.out.print("  ");
            }
            }
            System.out.println();
        }
    }

    public static void diamond(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n;i>=1;i--){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
    // floydpyramid(5);
    // zero_one_triangle(5);
    // butterfly_pattern(8);
    // solid_rombus(5);
    // hollow_rombus(5); 
    diamond(4); 
    }
}
