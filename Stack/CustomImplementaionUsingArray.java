 class Stack{
    private int idx;
    private int [] arr= new int[5];
    private int size;

    void push(int x) throws Error{
        if(size == arr.length+1){
        throw new Error("Stack is full");
        }
        else{
          arr[idx]=x;
           idx++;//idx will be at one position ahead so that next time element will add at that idx
        }
    }
    
    void peek() throws Error{
      if(isEmpty()){
        throw new Error("Stack is empty");
      }
      else{
        System.out.println(arr[idx-1]);
      }
    }

    int pop() throws Error{
      if(isEmpty()){
        throw new Error("Stack is empty");
      }
      else{
        int val=arr[idx-1];// idx - 1 is where the element lies
       arr[idx-1]=0;
        idx--; // then make sure to change the idx--
        return val;
    
      }
    }

    int size(){
        return idx;
    }

    boolean isEmpty(){
        if(idx==0){
            return true;
        }
        return false;
    }

    boolean isFull(){
      if(idx== arr.length){
           return true;
      }
      return false;
    }

    void display(){
        int j=0;
        while(j<idx){
            System.out.println(arr[j]);
            j++;
        }
    }
}
public class CustomImplementaionUsingArray {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println( s.pop());
        System.out.println(s.size());
        s.display();
        s.peek();
    }
}
