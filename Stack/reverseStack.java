import java.util.Stack;
public class reverseStack{
    public static void main(String[] args) {
      Stack<Integer> st= new Stack<>();
      st.add(10);
      st.add(20);
      st.add(30);
      st.add(40);
      st.add(50);
      System.out.println(st);
      Stack<Integer> rt= new Stack<>();
      while(! st.isEmpty()){
        rt.push(st.pop());
      }
      System.out.println(rt);
    }
}