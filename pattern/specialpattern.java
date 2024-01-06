import java.util.Scanner;
public class specialpattern {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Enter the number  ");
            int num =sc.nextInt();
            int mid =num/2+1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
              if(mid == i || mid ==j){
                System.out.print("* ");
              }
              else{
                System.out.print("0"+" ");
              }
            }
            System.out.println();
        }
}
    }
}