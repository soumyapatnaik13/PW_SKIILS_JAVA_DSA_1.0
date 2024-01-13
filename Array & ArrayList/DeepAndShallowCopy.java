import java.util.Arrays;

public class DeepAndShallowCopy{
    public static void main(String [] args){
        int [] arr= {1,2,3,4,5};
      //  int [] arr2= arr;
       // arr2[1]=6; //shallow copy 
        int [] arr2=Arrays.copyOf(arr, arr.length);
        for(int ele: arr2){
           System.out.print(ele);
        }
    }
}