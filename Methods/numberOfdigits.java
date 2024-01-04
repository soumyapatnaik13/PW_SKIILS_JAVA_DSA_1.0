import java.util.Scanner;
public class numberOfdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number: ");
        int num=sc.nextInt();
        long sq=square(num);
        int count= numOfDigits(num);
        System.out.println("square of number is "+ sq );
        System.out.println("total number of digits in that number is"+ count);

    }
    static long square(int num){
      return num* num;
    }
    static int numOfDigits(int num){
        int count=0;
      while(num >0){
      
        count += 1;
        num /=10;
         
        
      }
      return count;
    }
}
