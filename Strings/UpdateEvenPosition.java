import java.util.Scanner;
public class UpdateEvenPosition {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter your String :");
            String s=sc.nextLine();
            System.out.println(makeEvenIndex(s));
        }
    }
    static String makeEvenIndex(String s){
       String n="";
       for(int i=0;i<s.length();i++){
        if(i%2==0){
            n=n+s.charAt(i);
        }
        else{
            n=n+"a";
        }
       }
       return n;
    }
}
