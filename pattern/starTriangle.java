import java.util.Scanner;
public class starTriangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Enter the number  ");
            int num =sc.nextInt();
            for(int i=0;i<num;i++){
                for(int j=0;j<=i;j++){
                    System.out.print("*"+ "");
                }
                System.out.println();
            }
        }
    }
}
