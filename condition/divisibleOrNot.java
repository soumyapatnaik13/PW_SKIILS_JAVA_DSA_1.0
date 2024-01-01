import java.util.Scanner;
public class divisibleOrNot{
    public static void main(String[] args){
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter your number:");
        int num=sc.nextInt();
        if(num % 5==0){
            System.out.println(num +" is dividsible by 5" );
        }
        else{
            System.out.println(num +" is not divisible by 5");
        }
    }
    
    }
}