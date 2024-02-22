import java.util.Scanner;
public class factorial{
    public static void main (String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number: ");
            int num=sc.nextInt();
            int ans= findFactorial(num);
            System.out.println(ans);
        }
        }
    static int findFactorial(int n){
        if(n==1){
            return 1;
        }
        return n* findFactorial(n-1);
    }
}