 class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
 class LinkedList{ 
    Node head;
    Node tail;
    int size;
    //add element 
    void insertAtEnd(int val){
    Node temp= new Node(val);
    if(head == null){
        //single ele
    head=temp;
    tail=temp;
    tail.next=head;
    }
    else{
        // already on ele  is present
        tail.next=temp;
        tail=temp;
        tail.next=head;
    }
    //each time after insertion add size +1 so in that obj of l size will increase
    size++;
    }
    void display(){
        Node temp=head;
        while(true){
            System.out.println(temp.val);
            if(temp.next == head){
                break;
            }
            temp=temp.next;
        }
    }
}
public class circulaLL {
    public static void main(String[] args) {
        LinkedList ll= new LinkedList();
        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);
        ll.insertAtEnd(40);
        ll.insertAtEnd(50);
        
        System.out.println(ll.head.val);
        System.out.println(ll.tail.next.val);
         ll.display();
    }
}
