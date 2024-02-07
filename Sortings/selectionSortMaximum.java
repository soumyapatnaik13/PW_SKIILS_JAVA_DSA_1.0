import java.util.Arrays;

public class selectionSortMaximum {
    public static void main(String[] args) {
        int [] arr={5,3,2,1,6,4};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int [] arr){
    int n=arr.length;
    for(int i=n-1;i>0;i--){
        int index=0;
        for(int j=1;j<=i;j++){
            if(arr[j]>arr[index]){
                index=j;
            }
        }
        swap(i,index,arr);

    }
}
    static void swap(int s,int e,int [] arr){
       int temp=arr[s];
       arr[s]=arr[e];
       arr[e]=temp;
    
    }
}
