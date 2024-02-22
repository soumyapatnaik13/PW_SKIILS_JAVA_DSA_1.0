import java.util.Scanner;
public class zigzag {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Enter your number :");
            int num= sc.nextInt();
            zig(num);
        }
    }
    static void zig(int num){
        if(num ==0)return;
        System.out.print(num);
        zig(num-1);
        System.out.print(num);
        zig(num-1);
        System.out.print(num);
    }
}
