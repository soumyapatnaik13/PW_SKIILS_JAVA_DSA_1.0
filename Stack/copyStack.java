import java.util.Stack;
public class copyStack{
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        Stack<Integer> rt= new Stack<>();
        while(!st.isEmpty()){
            rt.push(st.pop());
        }

        Stack <Integer> copy = new Stack<>();
        while(!rt.isEmpty()){
            copy.push(rt.pop());
        }
        System.out.println(copy);
    }
}