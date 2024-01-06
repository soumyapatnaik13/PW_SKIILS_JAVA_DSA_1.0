import java.util.Scanner;

public class mixtureTriangle {
       public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Enter the number  ");
            int num =sc.nextInt();
            for(int i=1;i<=num;i++){
                for(int j=1;j<=i;j++){
                  if(i%2==0){
                     System.out.print((char)(j+64));
                  }
                  else{
                    System.out.print(j);
                  }
                
        }
        System.out.println();
    }
}
}
}