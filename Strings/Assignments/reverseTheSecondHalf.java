import java.util.Scanner;
public class reverseTheSecondHalf {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            StringBuilder s= new StringBuilder(sc.next());
            reverse(s);
            System.out.println(s.toString());
        }
    }
    static void reverse(StringBuilder s){
        int n=s.length();
        int half=n/2;
        int last=n-1;
        while(half < last){
            swap(half,last,s);//two pointer
            half++;
            last--;

        }

    }
    static void swap(int a, int b,StringBuilder s){
        char c= s.charAt((a));
        s.setCharAt(a, s.charAt(b));
        s.setCharAt(b, c);


    }
}
