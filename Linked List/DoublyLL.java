class DNode{//custom data types
  int val;
  DNode prvs;
  DNode next;
  DNode(int val){
    this.val=val;
  }
}
class LL{
DNode head;
DNode tail;
 int size;
 void insertAtEnd(int val){
    DNode temp=new DNode(val);
    if(head == null ){
        //single element
        head=temp;
        tail=temp;
    }
    else{
        tail.next=temp;
        temp.prvs=tail;
        tail=tail.next;
    }
    size++;
 }
 void display(){
    DNode temp=head;
    while(temp != null){
        System.out.println(temp.val);
        temp=temp.next;
    }
 }
 void reverse(){
    DNode temp=tail;
    while(temp != null){
        System.out.println(temp.val);
        temp=temp.prvs;
    }

 }
 Boolean palindrome(){
    DNode t1= head;
    DNode t2=tail;
    int i=1;
    int j=size;
    while(i<j){
       if(t1.val != t2.val){
          return false;
       }
       i++;
       j--;
       t1=t1.next;
       t2=t2.prvs;

    }
    return true;
 }
  void insertAtHead(int val){
     DNode temp=new DNode(val);
      if(head== null){
        head=tail=temp;
      }
      else{
        head.prvs=temp;
        temp.next=head;
        head=temp;
      }
      size++;
  }
  void insertAtIndex(int idx,int val) throws Error{
    //if got 3 goes till 2
    if(idx==0){
        insertAtHead(val);
        return;
    }
    else if(idx==size-1){ //tail
       DNode n= tail.prvs;
       DNode t= new DNode(val);
       t.next=tail;
       tail.prvs=t;
       n.next=t;
       t.prvs=n;
       return;
    }
    else if(idx <0 || idx > size-1){
      throw new Error("invalid");
    }
    else{
    int i=0;
    DNode temp=head;
    while(i<idx-1){
        temp=temp.next;
        i++;
    }
    DNode t= new DNode(val);
    DNode nextNode=temp.next;
    temp.next=t;
    t.prvs=temp;
    t.next=nextNode;
    nextNode.prvs=t;
    size++;
  }
}
 void deleteAtIndex(int idx) throws Error{
    if(idx ==0 || idx >size-1){
        throw new Error("invalid");
    }
    else if(idx==0){
        head=head.next;
        head.prvs=null;
        return;
    }
    else if(idx== size-1){
        DNode prvs= tail.prvs;
        prvs.next=tail;
        tail=prvs;
    }
    else{
        int i=0;
        DNode temp= head;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
        DNode after=temp.next.next;
        after.prvs=temp;
    }
    size--;
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
        DNode t=head;
        int i=0;
        while(i<idx){
            t=t.next;
            i++;
        }
        System.out.println(t.val);

        
    }
}
void setElement(int idx,int val){
    if(idx==0){
        head.val=val;
    }
    else if(idx == size-1){
        tail.val=val;
    }
    else{
        int i=0;
        DNode temp=head;

        while(i<idx){
            temp=temp.next;
            i++;
        }
        temp.val=val;
    }
}
 }


public class DoublyLL {
    public static void main(String[] args) {
      LL list = new LL();
      list.insertAtEnd(10);
      list.insertAtEnd(20);
      list.insertAtEnd(30);
      list.insertAtEnd(40);
      list.insertAtEnd(50);
    //  list.reverse();
    //  Boolean ans=list.palindrome();
     // System.out.println(ans);
      
     // System.out.println(list.head.val);
    // list.insertAtIndex(2, 80);
      list.deleteAtIndex(2);
     // list.display();
     list.display();

    
    }
}
