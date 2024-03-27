class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
} 
class LL{
    void findTheTail(Node a){
        Node t=a;
        while(t.next !=null){
            t=t.next;
        }
        System.out.println("Tail is "+ t.val);
    }
}

public class findTheTail {
    public static void main(String[] args) {
       Node a= new Node(10);
       Node b= new Node(20);
       Node c= new Node(30);
       Node d= new Node(40);

       a.next=b;
       b.next=c;
       c.next=d;
      
    
     LL obj = new LL();
     obj.findTheTail(a);
    }
  
}
