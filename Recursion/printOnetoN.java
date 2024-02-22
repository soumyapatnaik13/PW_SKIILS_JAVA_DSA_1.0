import java.util.Scanner;

public class printOnetoN {
    public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the number: ");
          int num=sc.nextInt();
            print(num);
    }
    }
    static void print(int num){
        if(num ==1){
            System.out.println(num);
            return;
        }
        print(num-1);
        System.out.println(num);
    }
}
