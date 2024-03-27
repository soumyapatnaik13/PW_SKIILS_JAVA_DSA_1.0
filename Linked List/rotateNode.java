class Node{
    int data;
    Node next;
    Node(int val){
        this.data=val;
    }
}
public class rotateNode {
    public static void main(String[] args) {
        Node a= new Node(10);
        Node b= new Node(20);
        Node c= new Node(30);
        Node d= new Node(40);
        Node e= new Node(50);
        Node f= new Node(60);
        Node g= new Node(70);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        int k=8;
        rotate(a,k);
        
    }
    static void rotate(Node a,int k){
    //step 1 : put fast pointer k step ahead so when it reaches f.next then slow will b at the kth poition prvs node (n-k+1)
    Node fast=a;
    int size=0;
    Node temp=a;
    while(temp != null){
        temp=temp.next;
        size++;
    }
    k= k % size;
    
    int i=1;
    while(i< k){
      fast=fast.next;
      i++;
    }
    Node slow=a;
    while(fast.next != null){
        slow=slow.next;
        fast=fast.next;
    }
     Node s= slow.next;
     slow.next=null;
     fast.next=a;
     
     System.out.println("rotataed array for k=2 is");
     System.out.println(s.data);
     System.out.println(s.next.data);
     System.out.println(s.next.next.data);
     System.out.println(s.next.next.next.data);
     System.out.println(s.next.next.next.next.data);
     System.out.println(s.next.next.next.next.next.data);
     System.out.println(s.next.next.next.next.next.next.data);
    }
}
