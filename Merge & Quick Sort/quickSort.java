import java.util.Arrays;

public class quickSort {
    public static void main(String [] args){
        int []arr={1,4,6,32,63,87,33,43,90,23,78,65};
        int n=arr.length;
        quick(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
        //partition where find the pivot ele
        //put all the ele which was smaller than this in the left
        //put all the ele which was bigger than this in the right
        //then recusrsive call
        //its uses prefix whereas mergesort uses postfix
    }
    static void quick(int [] arr,int low,int high){
        if(low>=high){
            return;
        }
        int pivot=partiton(arr,low,high);//
        quick(arr,low,pivot-1);
        quick(arr,pivot+1,high);

    }

    static int partiton(int []arr,int l,int h){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[l]>arr[i]){
                count+=1;
            }
        }
        swap(arr,l,count);
        int s=0;
        int e=arr.length-1;
        int pivot=arr[count];
        while(s<pivot && e>pivot){
            if(arr[s]<pivot){
                s++;
            }
            else if(arr[e]>pivot){
                e--;
            }
            else{
                swap(arr,s,e);
                s++;
                e--;
            }
        }
        return count;
    }
    static void swap(int[]arr,int s,int e ){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
   
    }
}
