import java.util.Scanner;

public class numberOfDiamond {
     public static void main(String[] args) {
         try (Scanner sc = new Scanner (System.in)) {
         System.out.println("Enter the number  ");
         int num =sc.nextInt();
         int ns= num-1;
         int star=1;
         for(int i=1;i<=num;i++){
            for(int j=1;j<=ns;j++){
                System.out.print(" "+" ");

            }
            for(int j=1;j<=star;j++){
                System.out.print( "*"+" ");
            }
            ns--;
            star +=2;
            System.out.println();
        }
        ns=1;
        star=star-4;
            for(int i=1;i<=num-1;i++){
            for(int j=1;j<=ns;j++){
                System.out.print(" "+" ");

            }
            for(int j=1;j<=star;j++){
                System.out.print( "*"+" ");
            }
            ns++;
            star -=2;
            System.out.println();
        }
}
}
}
