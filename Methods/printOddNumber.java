import java.util.Scanner;
public class printOddNumber {
    public static void main(String [] args){
     try (Scanner sc = new Scanner(System.in)) {
        System.out.println("enter your number");
         int a= sc.nextInt();
         System.out.println("enter your number");
         int b=sc.nextInt();
         oddNumber(a,b);
    }
    
     
    }
    static void oddNumber(int a, int b){
     while(a<b){
        if(a%2==1){
            System.out.println(a);
        }
        a++;
     }
    }
}
