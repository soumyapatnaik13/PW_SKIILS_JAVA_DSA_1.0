public class convcertIntoInteger {
    public static void main(String[] args) {
        String s="123456789";
        integer(s);
    }
    static void integer(String s){
        int n=s.length();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            int index= (int)c;
            int asci=index - 48;
            
                System.out.println(asci);
            
        }
    }
}
