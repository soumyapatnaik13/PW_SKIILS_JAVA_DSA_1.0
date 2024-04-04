import java.util.Stack;

public class reverseAstackRecursive {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        reverse(st);
        System.out.println(st);
    }
    static void reverse(Stack <Integer> st){
        // recursive will work inorder to find each element
        if(st.isEmpty()){
            return ;
        }
        int top=st.pop();//50 40 30 20 10
        reverse(st);
        insertAtButtom(st,top);
    }
    static void insertAtButtom(Stack <Integer> st,int t){
        //insert that element at the buttom
        if(st.isEmpty()){
            st.push(t);
            return;
        }
        else{
            int top=st.pop();//stores the element in the top
            insertAtButtom(st, t);//after the st reaches at the base case which is 0 add that element at the buttom
            st.push(top);//then after add all those element again in the stack
        }
    }
}
