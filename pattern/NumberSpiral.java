import java.util.Scanner;
public class NumberSpiral {
    public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("enter your number");
        int num=sc.nextInt();
        
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                System.out.print(Math.min(i,j) + " ");
            }
            System.out.println();
        }
    }
    }
}
