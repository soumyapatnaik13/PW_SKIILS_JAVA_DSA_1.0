

class Node {
    // in order to create a deque the datatype we used is Doubly LL
    // where each node has the access of previous node and the next node
    int val;
    Node prvs;
    Node next;
    Node (int val){
        this.val=val;
    }
}
class deque{
    Node head;
    Node tail;
    int size;
    void insertFront(int val){
        Node temp= new Node(val);
        if(size==0){
            head=tail=temp;
        }
        else{
            head.prvs=temp;
            temp.next=head;
            head=temp;
        }
        size++;
    }
    void insertrear(int val){
        Node temp= new Node(val);
        if(size==0){
            head=tail=temp;
        }
        else{
            tail.next=temp;
            temp.prvs=tail;
            tail=temp;
        }
        size++;
    }

    void deleteAtfront() throws Error{
        if(size ==0){
       throw new Error("Dequeue is Empty");
        }
        else if(size==1){
            head=tail=null;
            size--;
        }
        else{
          Node t= head.next;
          t.prvs=null;
          head=t;
          size--;
        }
    }
    void deleteAtreer() throws Error{
        if(size ==0){
       throw new Error("Dequeue is Empty");
        }
        else if(size==1){
            head=tail=null;
            size--;
        }
        else{
          Node t= tail.prvs;
          t.next=null;
          tail=t;
          size--;
        }
    }
    int getFront(){
        return head.val;
    }
    int getReer(){
        return tail.val;
    }
    Boolean isEmpty(){
        if(size==0){
            return true;
        }
        return false;
    }
    void display(){
        Node t=head;
        while(t != null){
            System.out.println(t.val);
            t=t.next;
        }
    }
}
public class CustomDequeImplementation {
    public static void main(String[] args) {
       deque q= new deque();
       q.insertrear(10);
       q.insertrear(20);
       q.insertrear(30);
       q.insertrear(40);
       q.insertFront(0);

       

       q.deleteAtfront();

       q.deleteAtreer();



       q.insertFront(60);
       q.insertrear(90);

       System.out.println(q.size);
        
       q.display();
    }
}
