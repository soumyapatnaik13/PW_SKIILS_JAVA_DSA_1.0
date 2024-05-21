import java.util.Comparator;
import java.util.PriorityQueue;

public class MaxHeap {
       public static void main(String[] args) {
    PriorityQueue<Integer> max= new PriorityQueue<>(Comparator.reverseOrder());
    // store,remove the value in log n time
    // get that minimum value it will take O(1)
    max.add(2);
    max.add(1);
    max.add(3);
    max.add(4);
    System.out.println(max.peek());
    System.out.println((max.poll()));
    System.out.println(max.size());

}
}
