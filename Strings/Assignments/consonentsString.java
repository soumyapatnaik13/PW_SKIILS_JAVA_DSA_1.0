import java.util.Scanner;
public class consonentsString {
    // all english alphabates except vowels
     public static void main (String [] args){
         try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the charachter: ");
             int consonent= findConsonents(sc.nextLine());
             System.out.println(consonent);
        }
     } 
     static int findConsonents(String s){
        int count=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)>= 'a' && s.charAt(i)<='z' && !isVowels(s.charAt(i))){
                   count++;
            }
        }
        return count;
     }
     static Boolean isVowels(char c){
       return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';

     }
    }
