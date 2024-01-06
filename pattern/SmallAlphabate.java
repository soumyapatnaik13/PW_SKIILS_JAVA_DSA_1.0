import java.util.Scanner;
public class SmallAlphabate {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Enter the number  ");
             int num =sc.nextInt();
             for(int i=0;i<num;i++){
                for(int j=0;j<num;j++){
                    System.out.print((char)(j+97)+"");
                }
                System.out.println();
             }
        }
    }
}
