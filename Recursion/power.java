import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the number: ");
          int num=sc.nextInt();
        System.out.println("Enter the exponent: ");
        int expo=sc.nextInt();
         int ans= powerNum(num,expo);
         System.out.println(ans);
    }
}
   static int powerNum(int n,int e){
    if(e==1){
    return n;
    }
    
    return n* powerNum(n,e-1);
   }
}
