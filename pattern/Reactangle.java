import java.util.Scanner;
public class Reactangle{
    public static void main(String [] args){
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Enter the number of row you want to insert: ");
            int m= sc.nextInt();
            System.out.println("Enter the number of column you want to insert :");
            int n= sc.nextInt();
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}