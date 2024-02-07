import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int []arr={3,5,1,4,2,-1,8,6,-2,7,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int [] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(j,j-1,arr);
                }
                else{
                    break;
                }
            }
        }
    }
    static void swap(int s,int e,int [] arr){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
}
