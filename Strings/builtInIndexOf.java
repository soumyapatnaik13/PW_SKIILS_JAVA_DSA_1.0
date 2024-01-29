import java.util.Scanner;
public class builtInIndexOf{
 public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        String s= sc.nextLine();
        char c='p';
        int ans=indexof(s,c);
        System.out.println(ans);
    }
 }
 static int indexof(String s,char c){
    int n=s.length();
    for(int i=0;i<n;i++){
        if(s.charAt((i))==c){
            return i;
        }
    }
    return -1;
 }
}