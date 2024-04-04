import java.util.Arrays;
import java.util.Stack;
public class prvsGretestElementUsingStcak {
    public static void main(String[] args) {
        int []arr= {5,4,3,2,1,1,5,6,8,9};//-1,5,4,3,2,2,-1,-1,-1,-1
        prvsGreatest(arr);
        
    }
    static void prvsGreatest(int [] arr){
        Stack<Integer>st= new Stack<>();
        int [] res= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]>=st.peek()){ // discard all the value which is smaller than current element
                st.pop();
            }
         res[i]=st.isEmpty() ? -1 : st.peek();
         st.push(arr[i]);
        }
        System.out.println(Arrays.toString(res));
    }
}
