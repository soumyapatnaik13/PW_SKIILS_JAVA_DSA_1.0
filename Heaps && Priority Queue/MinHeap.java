import java.util.*;
public class MinHeap{
    public static void main(String[] args) {
    PriorityQueue<Integer> min= new PriorityQueue<>();
    // store,remove the value in log n time
    // get that minimum value it will take O(1)
    min.add(2);
    min.add(1);
    min.add(3);
    min.add(4);
    System.out.println(min.peek());
    System.out.println((min.poll()));
    System.out.println(min.size());

}
}