class Node{
    int val;
    Node next;

    Node(int val){
        this.val=val;
    }
}
public class displayLL {
    public static void main(String[] args) {
        Node a =new Node(10);
        Node b= new Node(20);
        Node c= new Node(30);
        Node d= new Node(40);
        Node e= new Node(50);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        //shallow copy : make temp as the shallow copy which will stores ref to the same obj (the adreess )
        Node temp =a;
        print(temp);
    }
static void print(Node h){
    if (h== null){
        return;
    }
    System.out.println(h.val);
    print(h.next);
}
}
