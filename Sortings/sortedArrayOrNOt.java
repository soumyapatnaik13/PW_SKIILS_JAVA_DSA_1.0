import java.util.Scanner;
public class sortedArrayOrNOt{
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array :");
            int n=sc.nextInt();
            int [] arr= new int[n];
            for(int i=0;i<n;i++){
             System.out.println("Enter the number of element you want to insert: ");
             arr[i]=sc.nextInt();
            }
      Boolean ans=isSorted(arr);
      System.out.println(ans);
        }
    }
    static Boolean isSorted(int []arr){
        for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){ //Time complexity : O(N)square
                if(arr[i]>arr[j]){
                    return false;
                }
            }
        }
        return true;
    }
}