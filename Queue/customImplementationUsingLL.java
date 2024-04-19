class Node {
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
  class LL{
    Node head;
    Node tail;
    int size;
    void add(int val){
        Node temp= new Node(val);
        if(head==null){
            head=tail=temp;
        }
        else{
            tail.next=temp;tail=temp;
        }
        size++;
    }

    int poll() throws Error{
     if(head== null){
        throw new Error("queue is empty");
     }
     else {
        if(size ==1){
            int val=head.val;
            head=head.next;
            tail=tail.next;
            return val;
        }
        else{
            int val=head.val;
            head=head.next;
            return val;
        }
     }
    }

    int peek(){
        if(head== null){
            throw new Error("queue is empty");
         }
         else {
              return head.val;
            }
         
    }
    void display(){
        Node temp=head;
        while(temp != null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
  }
}
public class customImplementationUsingLL {
    public static void main(String[] args) {
        
        Queue q= new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

       System.out.println(q.poll());
       System.out.println(q.peek());

       q.display();
       System.out.println(q.size);


        


    }
}
