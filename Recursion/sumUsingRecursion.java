import java.util.Scanner;

public class sumUsingRecursion {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the number: ");
          int num=sc.nextInt();
            int ans=printSum(num,0);
            System.out.println(ans);
    }
    }
    static int printSum(int num,int sum){
        if(num==0){
            return sum;
            
        }
         int ans=printSum(num-1,sum+num);
         return ans;
    }
}
