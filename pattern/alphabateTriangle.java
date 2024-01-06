import java.util.Scanner;

public class alphabateTriangle {
       public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Enter the number  ");
            int num =sc.nextInt();
            for(int i=0;i<num;i++){
                for(int j=0;j<=i;j++){
                    System.out.print((char)(65+j)+" ");
                }
                System.out.println();
            }
        }
    }
}
