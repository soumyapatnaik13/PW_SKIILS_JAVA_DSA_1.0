class Queue{
    int [] arr= new int[5];
    int f=-1;
    int r=-1;
    int size=0;
    void add(int val){
        if(size==0){
           f=0;
           r=0;
           arr[f]=val;
        }
        else if(r==arr.length-1){
            System.out.println("queue is full");
             return;
        }
        else{
            arr[r]=val;
        }
        r++; 
        size++;
    }

    int poll() throws Error {
        if(f== -1){
           throw new Error("queue is empty");
        }
        else{
            if(size ==0){
                int val=arr[f];
                f--;
                r--;
                size--;
                return val;
               
            }
            else{
               int val=arr[f];
               f++;
               size--;
               return val;
            }
            
        }
    }

    int peek() {
        return arr[f];
    }

    void display(){
        for(int i=f;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
public class CustomImplementaion {
    public static void main(String[] args) {
        Queue q= new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.size);
        q.display();

    }
}
