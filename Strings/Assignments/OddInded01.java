import java.util.Scanner;
public class OddInded01{
    public static void main(String[] args) {
        try (// 
        Scanner sc = new Scanner(System.in)) {
            String s=sc.next();
            String ans=oddIndex(s);
            System.out.println(ans);
        }
    }
    static String oddIndex(String s){
        int n=s.length();
        String modify="";
        for(int i=0;i<n;i++){
            if(i%2==1){
            modify +="#";
            }
            else{
                modify+=s.charAt(i);
            }
        }
        return modify;
    }
}