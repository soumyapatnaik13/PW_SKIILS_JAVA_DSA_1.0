//we can built heap by viuslize a Complete BSt but the element will store inside an array
//each ele have the access of it parent where left child : idx * 2 +1, right : idx*2+2,and parents : idx-1/2
class MinHeap{
    private int []arr;
    private int size;// it will traverse
    MinHeap(int size){
    arr=new int[size];
    size=0;
    }
    public void add(int val) throws Exception{
        if(size== arr.length) throw new Exception("sorry heap is full");
        arr[size++]=val;//to add that value in that idx it will take O(1)
        upheap(size-1);//to upheap it will take LOG n czz it depends on the height of that CBT
        //as each time its divided into 2 so LOG base 2 and number of element
    }
    private void upheap(int idx){
        if(idx==0) return ;
        int parents= (idx-1)/2;
        if(arr[parents]>arr[idx]){
            swap(parents,idx);
            upheap(parents);;
        }
    }
    public int remove() throws Exception{
        if(size == 0){
        throw new Exception("sorry the heap is empty");
        }
        //swap the element with size -1 element and 0 idx
        int ele=arr[0];
         swap(0, size-1);
         size--;
         downHeap(0);
         return ele;
    }
    public void downHeap(int idx){
        if(idx > size-1) return;
        int left=idx*2+1;
        int right=idx*2+2;
        if(left < size && arr[left]< arr[right]  && arr[idx] > arr[left]){
            swap(idx,left);
            downHeap(left);
        }
        else if(right < size && arr[left]> arr[right] && arr[idx] > arr[right]){
            swap(idx,right);
            downHeap(right);
        }
        else{
            return;
        }
    }
    public int peek(){
        if(size ==0) System.out.println("heap is empty");
        return arr[0];
    }
    public int size(){
        return size;
    }
    void swap(int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    }
public class CustomImplementationOfHeap {
    public static void main(String[] args) throws Exception {
        
    MinHeap p= new MinHeap(7);
    p.add(8);
    p.add(7);
    p.add(2);
    p.add(3);
    p.add(4);
    p.add(5);
    p.add(6);
    System.out.println(p.peek());
    System.out.println(p.size());
    System.out.println(p.remove());
    System.out.println(p.peek());
    System.out.println(p.remove());
    System.out.println(p.peek());
    System.out.println(p.size());
    }
    // adding an element: put that in the correct position which will take O(1)tc,then check with the parents and 
    //swap
    //remove:swap with that size -1 element,then do downheap means check if the left or right has the lower value
    //then swap
}



