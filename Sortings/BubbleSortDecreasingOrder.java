import java.util.Arrays;

public class BubbleSortDecreasingOrder {
    public static void main(String[] args) {
        int [] arr={5,7,2,9,8,6,1,3,4};
        //bubble sort : in each pass the samllest element will at the last index
        // and the outer loop will goes till n-1 times
        //inner loop will swap the adcesent element
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int [] arr){
    int n=arr.length;
    for(int i=0;i<n-1;i++){
        //in each pass
        Boolean flag=true;
        for(int j=0;j<n-1-i;j++){
            if(arr[j]<arr[j+1]){
                swap(j,j+1,arr);
                flag=false;
            }
        }
        if(flag == true) break;
    }
    }
    static void swap(int s,int e,int [] arr){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
}
