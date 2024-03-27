class Node{
    int val;
    Node next;
    Node (int val){
        this.val=val;
    }
}
public class SortList {
    public static void main(String[] args) {
        Node a= new Node(30);
        Node b= new Node(80);
        Node c= new Node(10);
        Node d= new Node(40);
        Node e= new Node(0);
        Node f= new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        Node ans=sortList(a);
        
        // Printing the sorted list
        while (ans != null) {
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }
    
    static Node sortList(Node a) {
        if(a==null || a.next == null) return a;
        
        Node slow = a;
        Node fast = a;
        
        // Finding the middle of the list
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        Node secondhalf = slow.next;//each time when fast half call stores that somewhere so we that can use in later

        slow.next = null;
        
        Node firstHalf = sortList(a);
        Node sortedSecondHalf = sortList(secondhalf);
        
        return mergeNode(firstHalf, sortedSecondHalf);
    }

    static Node mergeNode(Node a, Node b) {
        Node dummy = new Node(-1);
        Node current = dummy;
        
        while (a != null && b != null) {
            if (a.val < b.val) {
                current.next = a;
                a = a.next;
            } 
            else {
                current.next = b;
                b = b.next;
            }
            current = current.next;
        }
        
        if (a != null) current.next = a;
        else if (b != null){
            current.next = b;
        }
        return dummy.next;
    }


    }

