class circularQ{
int [] arr= new int[5];
int front;
int rear;
int size=0;

void add(int val){
    if(size ==0){
        front=rear=0;
        arr[0]=val;
        size++;
    }
    else if(size ==arr.length){//so the queue is full then it wont goes further
        System.out.println("queue is full");
    }
    else if(rear < arr.length-1){
        arr[++rear]=val;
        size++;
    }
    else if(rear == arr.length-1){//if the queue is not full and reer is still at the last idx
        //then in the 0 --> till fast some places left
        arr[0]=val;
        rear=0;
        
        size++;
    }
    
}

int pop(){
    if(front==arr.length-1){ // if front is in the n-1 then front will b lier at 0 after this pop()
        int val=arr[front];
        front=0;
        size--;
        return val;
    }
    else{
    int val=arr[front];
      front++;
      size--;
      return val;
    }
    
}
 
void display(){
    if(rear<=front){
        for(int i=front;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        for(int i=0;i<=rear;i++){
            System.out.print(arr[i]);
        }
    }
    else{
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
}
public class CircularQueue {
    public static void main(String[] args) {
        
        circularQ c= new circularQ();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);

        System.out.println(c.pop());
        System.out.println(c.pop());

        c.add(6);
        c.add(7);
          
        c.display();

    }
}
