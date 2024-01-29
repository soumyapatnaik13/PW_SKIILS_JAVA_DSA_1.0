public class FindTheNumberOfOccurance {
    public static void main(String[] args) {
        String s="rahulpatnaik";
        StringBuilder n= new StringBuilder(s);
        char ans=count(n); 
        System.out.println(ans);
    }
    static char count (StringBuilder s){
       int ans=0;
       char max=' ';
         for(int i=0;i<s.length();i++){
         char c= s.charAt(i);
         int count=0;
         int v=0;
         for(int j=0;j<s.length();j++){
              if(c==s.charAt(j)){
                count ++;
              }
         }
         if(count > ans){
            ans=count;
            max=c;
         }

     
        
    }
        return max;
}
}
