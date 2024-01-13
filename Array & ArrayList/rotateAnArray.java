import java.util.ArrayList;
import java.util.Arrays;

public class rotateAnArray {
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50,60,70};
        int k=2;
        //using extra space
        rotate(arr,k);
        System.out.println(Arrays.toString(arr));
    }
    static void rotate(int [] arr,int k){
     ArrayList<Integer> helper= new ArrayList<>();
     for(int i=0+k;i<arr.length;i++){
         helper.add(arr[i]);
     }
     for(int i=0;i<k;i++){
        helper.add(arr[i]);
     }
     for(int i=0;i<helper.size();i++){
        arr[i]=helper.get(i);
     }
    }
}
