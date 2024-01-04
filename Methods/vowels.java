import java.util.Scanner;
public class vowels{
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your charachter:");
            char c=sc.next().charAt(0);
            boolean ans=vowelsOrNot(c);
            System.out.println(ans);
        }
    }
    static boolean vowelsOrNot(char c){
        switch(c){
        case 'a':
            return true;
           
        case 'e':
            return true;
           
        case 'i':
            return true;
          
        case 'o':
            return true;
            
        case 'u':
            return true;
           
    }
    return false;
}
}
