import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int [] arr= {10,20,30,40,50};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int [] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){ 
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
        }
    }
}
