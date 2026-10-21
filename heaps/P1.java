import java.util.PriorityQueue;
class P1 {
    //sorting the nearly sorted array using PriorityQueue
    public void nearlySorted(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int idx = 0;
        for(int num : arr){
            pq.offer(num);
            if(pq.size() > k){
                arr[idx++] = pq.poll();
             }
        }
        while(!pq.isEmpty()){
            arr[idx++] = pq.poll();
        }
    }
}
