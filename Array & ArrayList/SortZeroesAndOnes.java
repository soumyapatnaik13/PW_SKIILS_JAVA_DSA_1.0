import java.util.Arrays;

public class SortZeroesAndOnes {
    /*
     * approach : take two pointer (single pass)
     * 1.if i denotes to number 0 then i++
     * if j denotes to number 1 then j--
     * if i 1 and j 0 then swap
     */
    public static void main(String[] args) {
        int [] arr={1,0,0,1,1,0,1,0};
        sort(arr);
       System.out.println(Arrays.toString(arr));
    }
    static void sort(int [] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]==0){
                i++;
            }
            if(arr[j]==1){
                j--;
            }
            if(i>j) break;
            if(arr[i]==1 && arr[j]==0){
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;
            }
        }
    }
}
