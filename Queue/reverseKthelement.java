import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class reverseKthelement {
    public static void main(String[] args) {
        Queue<Integer>q= new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        int k=5;
        Queue <Integer>s=reverseK(q,k);
        System.out.println(s);

    }
    static Queue<Integer> reverseK(Queue<Integer>q,int k){
      int len= q.size();
      int addEle=len-k;//stores the len - k value that will help us to iterate through the queue after reverse
      Stack<Integer>st = new Stack<>();
      int i=1;
    
      while(i<=k){//reverse
        st.push(q.poll());
        i++;
      }

      while(! st.isEmpty()){ //stores that reverse value again inside the queue
        q.add(st.pop());
      }
      i=1;
      while(i<=addEle){// rearrange the queue 
        q.add(q.poll());
        i++;
      }

      return q;
    }
    
}
