import java.util.Scanner;
public class reversePatternStar {
    public static void main(String[] args) {
        
            try (Scanner sc = new Scanner (System.in)) {
                System.out.println("Enter the number  ");
                int num =sc.nextInt();
                for(int i=0;i<num;i++){
                    for(int j=0;j<num-i;j++){
                        System.out.print("*"+ " ");
                    }
                    System.out.println();
                }
            }
        }
    }

