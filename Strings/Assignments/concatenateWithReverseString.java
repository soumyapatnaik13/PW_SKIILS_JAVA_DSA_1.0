import java.util.Scanner;
public class concatenateWithReverseString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the string you want to insert: ");
            StringBuilder s= new StringBuilder(sc.next());
            
            System.out.println(Stringmanipulation(s));
        }
    }
    static StringBuilder Stringmanipulation(StringBuilder s){
        StringBuilder n= new StringBuilder(s);
        return n.append(reverseString(s));
    }
    static StringBuilder  reverseString(StringBuilder s){
        int n=s.length();
        int start=0;
        int end=n-1;
        while(start < end){
            swap(start,end,s);
            start ++;
            end--;
        }
        return s;
    }
    static void swap(int start, int end, StringBuilder s){
        char c= s.charAt(start);
        s.setCharAt(start, s.charAt(end));
        s.setCharAt(end, c);

    }
}
