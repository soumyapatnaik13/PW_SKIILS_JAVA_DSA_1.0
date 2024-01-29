import java.util.Scanner;
public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s= new StringBuilder(sc.next());
        StringBuilder v=reverse(s);
        System.out.println(v);

    }
    static StringBuilder reverse(StringBuilder s){
        int end= s.length()-1;
        int start=0;
        while(start < end){
            swap(start,end,s);
            start ++;
            end--;
        }
        return s;
    }
    static void swap(int s, int e, StringBuilder v){
      char ns= v.charAt(e);
      char ne=v.charAt(s);
      v.setCharAt(s, ns);
      v.setCharAt(e, ne);

    } 
}
