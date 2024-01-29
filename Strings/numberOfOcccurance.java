import java.util.Scanner;
public class numberOfOcccurance {
    public static void main(String[] args) {
        try (// find the char have highest number of occurance
                // with O(N) Time complexity
                //stores that in a frequency arrary
        Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your charachter");
            StringBuilder s= new StringBuilder(sc.next());
            int [] frequency= new int[26];// stores the number of count
            char ans=FindTheNumberOfOccurance(s,frequency);
            System.out.println(ans);
        }
    }
    static char FindTheNumberOfOccurance(StringBuilder s, int [] frequency){
        int n=s.length();
        for(int i=0;i<n;i++){
            char c= s.charAt(i);
            int asci= (int)c;
            int index= asci - 97;
            frequency[index]++;
        }

        int ans=0;
        for(int i=0;i<frequency.length;i++){
          ans=Math.max(ans,frequency[i]);//find the highest count
        }
        int j=0;
        for(int i=0;i<frequency.length;i++){//find the index
            if(ans==frequency[i]){
                 j=i;
                break;
            }
        }
        int i=97+j;
        return (char)i;
    }
}
