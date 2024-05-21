import java.util.PriorityQueue;

public class kthlargestElement {
    public static void main(String[] args) {
        int []arr={3,2,1,5,6,4};
        int k=2;
        PriorityQueue<Integer> minHeap= new PriorityQueue<>();
        int ans=findElement(arr,minHeap,k);
        System.out.println(ans);
}
  static int findElement(int []arr, PriorityQueue<Integer> minHeap,int k){
     for(int i=0;i<arr.length;i++){
        minHeap.add(arr[i]);
        //so inserting element in heap took log (n) time so size of heap is k so time complexity is nlog(k)> nlog(n)
        if(minHeap.size()>k){
            minHeap.remove();//removing n-k element and total num of element n-k log(k),k is d num of element inside heap
        }
     }

     return minHeap.peek();
  }
}
