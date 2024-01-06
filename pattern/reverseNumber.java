import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Enter the number  ");
            int num =sc.nextInt();
            for(int i=1;i<=num;i++){
                for(int j=1;j<=num+1-i;j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
}
