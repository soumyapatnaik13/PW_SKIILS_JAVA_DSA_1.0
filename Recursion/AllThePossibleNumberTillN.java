public class AllThePossibleNumberTillN {
    public static void main(String[] args) {
        int k=4;
        int n=6;
        findElement(0,k,n,"");
    }
    static void findElement(int idx,int k,int n,String s){
        if(s.length()==k && idx<=n ){
            System.out.println(s);
            return;
        }
        if(idx>n){
            return;
        }
        findElement(idx+1,k, n,s+(idx+1));
        findElement(idx+1, k, n, s);
    }
}
