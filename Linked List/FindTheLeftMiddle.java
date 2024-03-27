class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
public class FindTheLeftMiddle {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c= new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f= new Node(60);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        LeftMidlle(a);
    }
 static void LeftMidlle(Node a){
    Node slow=a;
    Node fast=a;
      while(fast.next!=null && fast.next.next!=null){
        slow =slow.next;
        fast=fast.next.next;
      }

    System.out.println("Left midddle is "+ slow.val);
}
}
