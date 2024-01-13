import java.util.Arrays;
import java.util.Scanner;
public class inputArray{
    public static void main(String [] args){
     try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the size of the array: ");
         int size= sc.nextInt();
         int [] arr= new int[size];
         for(int i=0;i<size;i++){
             arr[i]=sc.nextInt();
         }

         System.out.println(Arrays.toString(arr)); // Array.toString method is used to print in java..
    }
    }
}