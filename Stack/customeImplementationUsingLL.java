class Node{
    int val;
    Node next;
    Node(int v){
        this.val=v;
    }
}
class Stack{
    Node head;
    int size;
    void push(int val){
        Node temp=new Node(val);
        temp.next=head;
        head=temp;
        size++;
    }
    int pop(){
        int val=head.val;
        head=head.next;
        size--;
       return val;
       
    }
    int peek()throws Error{
        if(head==null){
            throw new Error("stack is empty");
        }
        return head.val;
    }
    int size(){
        return size;
    }
    boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
    }
    void display(){
     reverseDisplay(head);
    }
    void reverseDisplay(Node head){
        if(head==null) return;
        int val=head.val;
        reverseDisplay(head.next);
        System.out.println(val);
    }
}
public class customeImplementationUsingLL {
    public static void main(String[] args) {
        Stack st= new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st.peek());
        st.display();
    }
}
