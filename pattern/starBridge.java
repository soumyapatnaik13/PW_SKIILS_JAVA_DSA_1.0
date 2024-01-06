import java.util.Scanner;

public class starBridge {
     public static void main(String[] args) {
         try (Scanner sc = new Scanner (System.in)) {
         System.out.println("Enter the number  ");
         int num =sc.nextInt();
         for(int i=1;i<=2*num-1;i++){
            System.out.print("*"+" ");
         }
         System.out.println();
         num--;
         for(int i=1;i<=num;i++){
            for(int j=1;j<=num+1-i;j++){
                System.out.print("*" + " ");

            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(" "+ " ");
            }
            for(int j=1;j<=num+1-i;j++){
                System.out.print( "*"+ " ");
            }
            System.out.println();
        }
}
}
}
