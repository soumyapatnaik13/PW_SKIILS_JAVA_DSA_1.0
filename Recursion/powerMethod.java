import java.util.Scanner;
public class powerMethod {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the number: ");
          int num=sc.nextInt();
        System.out.println("Enter the exponent: ");
        int expo=sc.nextInt();
        int ans=power(num,expo);
        System.out.println(ans);
        }
    }
    static int power(int num,int expo){
        if(expo ==0){
            return 1;
        }
        int ans= power(num,expo/2);
       return (expo % 2== 0)?ans *ans : (ans * ans) * num;
        
    }
}