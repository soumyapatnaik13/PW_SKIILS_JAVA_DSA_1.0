import java.util.Scanner;
public class SqareOFNnaturalNUm {
    public static void main (String [] args){
     try (Scanner sc = new Scanner(System.in)) {
        System.out.println("enter your number:");
         int num= sc.nextInt();
         int sum=printSquareNum(num);
         System.out.println(sum);
    }
    }
    static int printSquareNum(int num){
    int sum=1;
    for(int i=1;i<=num;i++){
        sum*=i;
    }
    return sum;
    }
}
