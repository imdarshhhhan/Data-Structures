public class subStr {
    public static void main(String[] args) {
        String str = "helloworld";
        System.out.println(str.substring(0,5));

        String[] frts = {"apple","banana", "mango"};
        String largest = frts[0];
        for(int i=1;i<frts.length;i++) {
            if(largest.compareToIgnoreCase(frts[i])<0){
                largest = frts[i];
            }
        }
        System.out.println(largest);
     }
}
