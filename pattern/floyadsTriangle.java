import java.util.Scanner;
public class floyadsTriangle {
    public static void main(String[] args) {
        
            try (Scanner sc = new Scanner (System.in)) {
                System.out.println("Enter the number  ");
                int num =sc.nextInt();
                   int count =1;
                for(int i=1;i<=num;i++){
                    for(int j=1;j<=i;j++){
                        System.out.print(count);
                        count+=1;
                    }
                    System.out.println();
                }
            }
        }
    }

