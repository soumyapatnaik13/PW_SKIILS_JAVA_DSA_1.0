import java.util.Scanner;

public class oddEvenByte{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Enter the number  ");
            int num =sc.nextInt();
            
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
              if(i%2==1){//odd row
                if(j%2==1){ 
                System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
              }
              else{ //even row
                if(j%2==1){ //odd column
                System.out.print(0);
                }
                else{
                    System.out.print(1);
                }
              }
            
            }
            System.out.println();
        }
}
    }
}