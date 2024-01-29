public class StringCompression {
    public static void main(String[] args) {
        // aaabbbbccccdd-> a3b4c3d2
        StringBuilder s= new StringBuilder("aaaabbbbcccdddd");
        StringBuilder ans=compression(s);
        System.out.println(ans);
    }
    static StringBuilder compression(StringBuilder s){
        int i=0;
        int j=0;
        int n=s.length();
        int count=0;
        StringBuilder c=new StringBuilder();
        
        while(j<n){
            char v= s.charAt(i);
             if(j<n && s.charAt(j)==v){
                j++;
                count=count+1;
                if(j==n-1){
                    c.append(s.charAt(i));
                    c.append(count+1);
                }
             }
            
            
            else{
               c.append(s.charAt(j-1));
               c.append(count);
               if(j<n) {
               i=j;
               count=0;
}            }
        }
        
        return c;
    }
}
