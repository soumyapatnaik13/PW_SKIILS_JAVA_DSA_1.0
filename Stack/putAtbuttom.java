import java.util.Stack;
public class putAtbuttom {
    public static void main(String[] args) {
        int ele=9;
        Stack<Integer> st= new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        putElement(st,ele);
        System.out.println(st);
    }
    static void putElement(Stack <Integer> s, int ele){
        Stack<Integer> store= new Stack<>();
        while(s.size()>0){
            store.push(s.pop());
        }
        s.push(ele);
        while(!store.isEmpty()){
            s.push(store.pop());
        }
    }
}
