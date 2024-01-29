public class StringPelindrome {
    public static void main(String[] args) {
        String s="rahuluhar";
        System.out.println(pelindromOrNot(s));
    }
    static Boolean pelindromOrNot(String s){
    int n=s.length();
    int start=0;
    int end=n-1;
    while(start < end){
        if(s.charAt(start) != s.charAt(end)){
            return false;
        }
        start ++;
        end--;
    }
    return true;
    }
}
