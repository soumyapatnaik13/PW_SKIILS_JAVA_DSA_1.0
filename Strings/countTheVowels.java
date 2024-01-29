import java.util.Scanner;
public class countTheVowels {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Enter the charachter");
            String s= sc.nextLine();
            int ans=vowels(s);
            System.out.println(ans);
        }
    }
    static int vowels(String s){
        int count =0;
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            switch(c){
                case 'a':
                count ++;
                break;
                case 'e':
                count ++;
                break;
                case 'i':
                count ++;
                break;
                case 'o':
                count ++;
                break;
                case 'u':
                count ++;
                break;
            }
        }
        return count;
    }
}
