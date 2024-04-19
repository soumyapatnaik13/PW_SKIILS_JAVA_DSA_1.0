import java.util.LinkedList;
import java.util.Queue;;
public class removeEvenIdx {
    public static void main(String[] args) {
        Queue<Integer>q= new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        Queue<Integer>helper= new LinkedList<>();
        int i=0;
        while( ! q.isEmpty()){
           if(i%2==1){
             helper.add(q.peek());
           }
           q.poll();
           i++;
        }
        while(helper.size()>0){
            q.add(helper.poll());
        }
        System.out.println(q);
    }
}
