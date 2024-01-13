import java.util.Scanner;
public class linearSearch {
    public static void main(String[] args) {
        //if a number exist in the array or not
        int[] arr={2,4,7,9,2,1,5};
        try (//time complexity of this problem in a worst case would be O(N),cz we are traversing the whole array
        Scanner sc = new Scanner(System.in)) {
            boolean ans= linear(arr,sc.nextInt());
               System.out.println(ans);
        }
    }
      static boolean linear(int [] arr, int num){
        int i=0;
        boolean flag=false;
       while(i<arr.length){
        if(num==arr[i]){
            flag=true;
            return true;
        }
        if(flag==false){
            i++;
        }
    
       }
    return flag;
      }
}
