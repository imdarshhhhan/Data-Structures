import java.util.PriorityQueue;
class P3 {
    public static int minCost(int[] arr) {
        PriorityQueue<Integer> minHp = new PriorityQueue<>();
        
        for(int num : arr){
            minHp.offer(num);
        }
        int cost = 0;
        while(!minHp.isEmpty()){
            int tempSum = minHp.poll() + minHp.poll();
            cost += tempSum;
            if(!minHp.isEmpty()) minHp.offer(tempSum);
        }
        return cost;
    }
    public static void main(String args[]){
        System.out.println(minCost(new int[]{4,3,2,6}));
    }
}