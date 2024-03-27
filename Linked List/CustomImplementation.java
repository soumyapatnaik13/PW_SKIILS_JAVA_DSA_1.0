class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
/**
 * 1.take shallow copy of head and tail
 * 2.create a deep copy as temp
 * 3.use two pointer to connect each node 
 */
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
    }
    else{
        // already on ele  is present
        tail.next=temp;
        tail=temp;
    }
    //each time after insertion add size +1 so in that obj of l size will increase
    size++;
    }

    int length(){
     return size;
    }

    void insertAtHead(int val){
        Node temp= new Node(val);
        if(head == null){
            head=tail=temp;
        }
        else{
           temp.next=head;
           head=temp;
        }
        size++;
    }

    void display(){
        Node temp=head;
        while(temp !=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }

    void insertAtGivenIndex(int val,int idx){
      Node t= head;
      int i=0;
      if(idx==0){
        insertAtHead(val);
      }
      else if(idx==size){
        insertAtEnd(val);
      }
      else if(idx>size){
        System.out.println("Invalid");
      }
      else{
      while(i<idx-1){
        t=t.next;//traverse and reach the idx 1
        i++;
      }
      Node temp= new Node(val);
      temp.next=t.next;
      t.next=temp;
      size++;
    }
      
    }

    void getElement(int idx) throws Error{
        if(idx==0){
            System.out.println( head.val);
        }
        else if(idx==size-1){
          System.out.println( tail.val);
        }
        else if(idx <0 || idx >= size){
          throw new Error("invalid");
        }
        else{
            Node t=head;
            int i=0;
            while(i<=idx){
                t=t.next;
                i++;
            }
            System.out.println(t.val);

            
        }
    }
    void setElement(int idx,int ele) throws Error{
      if(idx== 0){
         insertAtHead(ele);
      }
      else if(idx==size-1){
        insertAtEnd(ele);
      }
      else if(idx <0 || idx >= size){
        throw new Error("invalid");
      }
      else{
    
        Node t= head;
        int i=0;
        while(i<idx){
          t=t.next;
          i++;
        }
        t.val=ele;

      }
    }

   void deleteAtHead() throws Error{
    if (size == 0){
     throw new Error ("Error");
    }
    else{
      head=head.next;
      size--;
    }
   }

   void deleteAtIndex(int idx) throws Error{
    if (size == 0){
     throw new Error ("Error");
    }
    else{
        Node t=head;
        int i=0;
        while(i<idx){
         t=t.next;
        i++;
        }
        if(t.next==tail) tail=t;
        t.next=t.next.next;
        size--;
    }
   }
 

  }


public class CustomImplementation {
    public static void main (String [] args){
    /*
     * create a custome LL and which have 2 data members head and tail 
     * then by using temp node connect with each node 
     */
    LinkedList l= new LinkedList();
   // System.out.println(l.head);// initially it has null 
   l.insertAtEnd(40);

   System.out.println("adress of the head node pointer is " + l.head);
   System.out.println("adress of the tail pointer after inserting one ele is " +l.tail);

   l.insertAtEnd(50);
   l.insertAtEnd(60);
   l.insertAtEnd(70);
   l.insertAtEnd(80);
   l.insertAtHead(30);
   l.insertAtHead(20);
   l.insertAtHead(10);

   // in the memory 10,20,30,40,50 will be created as obj which type is node and the h will pointing to 10 
   //and tail is 50

   /* System.out.println(l.head.val);
   System.out.println(l.head.next.val);
   System.out.println(l.head.next.next.val);
   System.out.println(l.head.next.next.next.val);
  */// System.out.println(l.tail.val);
   //that LL class has a property of size which will be increase each by one so after the 5 ele has added 
   //it will b 5 size

  //inserting an ele at fast
  System.out.println();

   l.insertAtGivenIndex(100,0);
  
   System.out.println();
   l.setElement(4,34);

   l.display();
   System.out.println(l.length());
    System.out.println();

   l.getElement(4);

   l.deleteAtHead();
   l.display();

    }

   
}
