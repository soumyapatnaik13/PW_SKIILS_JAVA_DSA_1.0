import java.util.Arrays;
public class NextGretestElement {
    public static void main(String[] args) {
        int[] arr={12,23,4,5,6,7,34,23,56};
       int [] ans= greatest(arr);
       System.out.println(Arrays.toString(ans));
    }
    static int [] greatest(int []arr){
        int [] ans= new int[arr.length];
       int nge=arr[arr.length-1];
    
         for(int i=arr.length-2;i>=0;i--){
            ans[i]=nge;
            nge=Math.max(nge,arr[i]);
         }
         ans[arr.length-1]=-1;
         return ans;
    }
}
