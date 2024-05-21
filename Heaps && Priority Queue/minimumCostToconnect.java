import java.util.PriorityQueue;
public class minimumCostToconnect{
    public static void main(String[] args) {
        int []arr={2,7,4,1,8};
        int ans=findMinCost(arr);
        System.out.println(ans);
    }
    static int findMinCost(int []arr){
        int cost=0;
        PriorityQueue<Integer> minHeap= new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
           minHeap.add(arr[i]);//1 2 4 7 8
        }
        while(minHeap.size()>1){
            int x=minHeap.poll();
            int y=minHeap.poll();
            cost +=(x+y);
            minHeap.add(x+y);
        }
        return cost;
    }
}