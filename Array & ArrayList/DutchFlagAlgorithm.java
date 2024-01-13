import java.util.Arrays;

public class DutchFlagAlgorithm {
    public static void main(String[] args) {
        /*
         * approach: 3 pointer 
         * low ,mid and high
         * behind the low all values will be 0
         * behind mid all the value should be 1
         * and after high all value should be 2
         * and at the end when high < mid break
         */
        int [] arr= {0,1,1,0,2,1,2,0,1,0}; // {0,0,0,0,1,1,1,1,2,2}
        threepointer(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void threepointer(int [] arr){
        int low=0;
        int mid=0;
        int high= arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,mid,low);
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else if(arr[mid]==2){
                 swap(arr,mid,high);
                 high--;
            }
        }
    }
    static void swap(int [] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
