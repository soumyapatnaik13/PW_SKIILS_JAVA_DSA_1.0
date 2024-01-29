public class findTheMaximumString {
    public static void main(String[] args) {
        String [] s={"123456","0012","012333","01239","1238"};
        //find the maximum ele
        maximum(s);
    }
     static void maximum(String []s ){
         String maxi=s[0];
         for(int i=1;i<s.length;i++){
            maxi=max(maxi,s[i]);
         }
         System.out.println(maxi);
    }
    static String max(String a, String b){
       String s= purify(a);
       String v= purify(b);
       if(s.length()>v.length()){
        return a;
       }
       else if(s.length() < v.length()){
        return b;
       }
       else{
          for(int i=0;i<s.length();i++){
            if(s.charAt(i) != v.charAt(i)){
                if(s.charAt(i) > v.charAt(i)){
                    return a;
                }
                else{
                    return b;
                }
            }
          }
       }
       return a;
    }
    static String purify(String s){
    int i=0;
     while(s.charAt(i)=='0'){
       i++;
     }
     return s.substring(i);
}
}
