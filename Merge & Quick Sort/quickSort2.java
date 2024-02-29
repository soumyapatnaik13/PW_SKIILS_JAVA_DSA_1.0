import java.util.Arrays;

public class quickSort2 {
    public static void main(String[] args) {
        int []arr={4,9,7,1,3,2,6,5,8,10,14,12,11,13};
        int n=arr.length;
        quick(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
        
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
        //take mid as a pivot
        int mid=l+(h-l)/2;
        for(int i=0;i<arr.length;i++){
            if(arr[mid]>arr[i]){
                count+=1;
            }
        }
        swap(arr,count,mid);
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

