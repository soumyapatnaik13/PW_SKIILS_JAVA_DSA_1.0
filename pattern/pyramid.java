import java.util.Scanner;

public class pyramid {
     public static void main(String[] args) {
         try (Scanner sc = new Scanner (System.in)) {
         System.out.println("Enter the number  ");
         int num =sc.nextInt();
         for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print(" "+" ");

            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print( " * ");
            }
            System.out.println();
        }
}
}
}
