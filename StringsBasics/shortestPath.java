public class shortestPath {
    public static float shortDistance(String str) {
        int n = str.length();
        int x=0,  y= 0;
        for(int i=0;i<n;i++) {
            char dir = str.charAt(i);

            if(dir =='N'){
                y++;
            }
            else if(dir=='S'){
                y--;
            }
            else if (dir =='E') {
                x++;
            }
            else {
                x--;
            }
        }
        int xSquare = x*x;
        int ySquare = y*y;
        return (float)Math.sqrt(xSquare + ySquare);
    }


    public static void main(String[] args ) {
        String str = "WNEENESENNN";
        System.out.println(shortDistance(str));
        }
}
