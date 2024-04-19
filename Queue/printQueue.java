import java.util.LinkedList;
import java.util.Queue;
public class printQueue {
    public static void main(String[] args) {
        Queue<Integer>q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        Queue<Integer>helper= new LinkedList<>();
       while(! q.isEmpty()){ 
// ! not operator negates the value so when q has some value it will b true but with not operator it negates the true to false
       helper.add(q.poll());
}
     System.out.println(helper);
       while( ! helper.isEmpty()){
        q.add(helper.poll());
       }
     
    } 
}
