public class skipAchar {
    public static void main(String[] args) {
        StringBuilder s= new StringBuilder("rahulpatnaik");
        StringBuilder v= new StringBuilder();
        StringBuilder ans=skip(s,0,v);
        System.out.println(ans);
    }
    static StringBuilder skip(StringBuilder s,int idx,StringBuilder ans){
        if(idx==s.length()){
            return null;
        }
       if(s.charAt(idx) != 'a'){
        ans.append(s.charAt(idx));
       }
       skip(s, idx+1, ans);
       return ans;
}
}
