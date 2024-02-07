import java.util.Arrays;

public class indexBased {
    public static void main(String[] args) {
        int [] arr={54,11,28,91,47,63};
        findIndex(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void findIndex(int [] arr){
        int n=arr.length;
        int x=0;
        for(int i=0;i<n;i++){
            int index =0;
            int minValue=Integer.MAX_VALUE;
            for(int j=0;j<n;j++){
               if(arr[j]<minValue&& arr[j] >0){
                minValue=arr[j];
                index=j;
               }
            }
            arr[index]=x;
            x--;
        }
        for(int i=0;i<n;i++){
            arr[i]= arr[i] * (-1);
        }
    }
}
