import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class reverseAqueue{
    public static void main(String[] args) {
        // FIFO
        // abstarct class(interface),can not create obj 
        Queue<Integer> q= new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
        Stack<Integer>st= new Stack <>();
         while(q.size()>0){
            st.push(q.poll());
         }
         while(!st.isEmpty()){
            q.add(st.pop());
         }
         System.out.println(q);
    } 
}