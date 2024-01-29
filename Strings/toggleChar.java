import java.util.Scanner;
public class toggleChar {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("enter your name");
            StringBuilder s= new StringBuilder(sc.nextLine());// RaHuL PaTNAik 
            StringBuilder ans=toggle(s);
            System.out.println(ans);
        }
    }
    static StringBuilder toggle(StringBuilder s){
        int n=s.length();
        for(int i=0;i<n;i++){
            int j=(int)s.charAt(i);
            if(j>64 && j<91){ // capital
               int k=j+32;
               char c= (char)k;
               s.setCharAt(i, c);
            }
            else{
                int z= j-32;
                char c= (char)z;
                s.setCharAt(i, c);
            }
        }
        return s;
    }
}
