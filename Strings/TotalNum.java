import java.util.Scanner;
public class TotalNum {
   public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        int n= sc.nextInt();
         String s=Integer.toString(n);
         System.out.println(s.length());
    }
   }  
}
