public class subset {
    public static void main(String[] args) {
        /* intution: if one char is there then subset will be 2 power 1 => 2
        similarly in each call it take that element or not because we want to find the unique element that are 
        present in that set
        for char 3=> that number of set would be 2 to power 3 is 16
        so for a=> {a,null}
        ab={a,ab,b,null}
        abc={ac,a,abc,ab,bc,b,c,null}*/  
        String s="abc";
        set(s,"",0);
    }
    static void set(String s,String ans, int idx){
        if(idx==s.length()){
        System.out.print(ans+" ");
        return;
        }
        char c= s.charAt(idx);
        set(s,ans+c,idx+1);
        set(s,ans,idx+1);
    }
}
