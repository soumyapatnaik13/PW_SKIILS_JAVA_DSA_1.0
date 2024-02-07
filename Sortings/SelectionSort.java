import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        // select the smallest element and put that in the correct index
        int [] arr={10,-4,20,3,1,-8,-7,34,5,6,78,95,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort (int [] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[index]){
                    index=j;
                }
            }
            swap(index,i,arr);
        }
    }
    static void swap(int s,int e,int [] arr){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
}
