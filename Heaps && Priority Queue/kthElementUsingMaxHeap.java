import java.util.Comparator;
import java.util.PriorityQueue;

public class kthElementUsingMaxHeap {
    public static void main(String[] args) {
        int []arr={10,2,3,8,-4,-2,6};
        int k=3;
        //use min heap
        PriorityQueue<Integer> maxHeap= new PriorityQueue<>(Comparator.reverseOrder());
        for(int ele :arr){
         maxHeap.add(ele);
         //only add k element in the heap so tm=> nlog(k)
         if(maxHeap.size()>k){ 
            maxHeap.remove();// removing n-k 
            //so time complexity nLog(k) which is better than n log n
         }
        }
// if we remove maximum element which is n-k times then in the k top will lies the kth element
// num = 8 and we remove 5 element then the 8-5=3
        System.out.println(maxHeap.peek());

    }
}
