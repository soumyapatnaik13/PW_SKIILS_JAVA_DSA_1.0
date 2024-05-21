import java.util.PriorityQueue;

public class kthelementUsingMinheap {
    public static void main(String[] args) {
        int []arr={10,2,3,8,-4,-2,6};
        int k=2;
        //use min heap
        PriorityQueue<Integer> minHeap= new PriorityQueue<>();
        for(int ele:arr){// to store each element in heap take log(n)time
            //so we are adding n element which will take n log(n)
          minHeap.add(ele);
        }

        for(int i=1;i<k;i++){
            minHeap.remove();
        }
      // and removing element in heap takes log(n)
      
      //so combine both add and remove => n log(n)+ k log(n)=> approx n log(n)
      // while using in built merge sort we can achive that without using space 
      
        System.out.println(minHeap.peek());
    }
}
