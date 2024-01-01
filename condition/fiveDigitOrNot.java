import java.util.Scanner;
public class fiveDigitOrNot {
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
        System.out.println("enter your number: ");
            int num =sc.nextInt();
            if(num > 9999 && num < 100000){
                System.out.println(num+" is five digits");
            }
            else{
                System.out.println(num+ " is not fve digits");
            }
    }
    }
}
