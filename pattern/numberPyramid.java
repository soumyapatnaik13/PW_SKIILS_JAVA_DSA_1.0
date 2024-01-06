import java.util.Scanner;

public class numberPyramid {
     public static void main(String[] args) {
         try (Scanner sc = new Scanner (System.in)) {
         System.out.println("Enter the number  ");
         int num =sc.nextInt();
         for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print(" "+" ");

            }
            for(int j=1;j<=i;j++){
                System.out.print(j+ " ") ;
            }
            for(int j=i-1;j>0;j--){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
}
}
}
