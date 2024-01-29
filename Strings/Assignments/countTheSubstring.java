public class countTheSubstring {
    public static void main(String[] args) {
        String s="Geeksforgeeks";
        printThesubString(s);
    }
    static void printThesubString(String s){
        int n=s.length();
        for(int i=0;i<n;i++){
            String v="";
            for(int j=i;j<n;j++){
             v+=s.charAt(j);
             subString(v);

            if(subString(v)){
                System.out.println(v);
            }
            }
        }
    }
    static Boolean subString(String s){
        int n=s.length();
        for(int i=0;i<n;i++){
            if(! isVowels(s.charAt(i))){
                return false;
            }
        }
        return true;
    }
    static Boolean isVowels(char c){
    c=Character.toLowerCase(c);
   return (c=='a' || c=='e' || c=='i' || c=='o' || c=='u');
    }
}
