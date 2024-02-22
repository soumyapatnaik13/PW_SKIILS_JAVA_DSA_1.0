public class generateParanthesis {
    public static void main(String[] args) {
        /*
         * print all the parathesis 
         * for n=1 => ()
         * n=2 => ()(),(())
         * itution: the ')' bracket will always less than the "("
         * will never make a call if Length of ) is less than (
         * and when ( ) reaches the length it will give us the possble ans
         */
        int n=3;
        String s="";
        print(s,n,0,0);
    }
    static void print(String s,int n, int outer,int inner){
        if(s.length()==2*n){
            System.out.println(s);
            return;
        }
        if(outer<n){
            print(s+'(',n,outer+1,inner);
        }
        if(inner<outer){
            print(s+')',n,outer,inner+1);
        }
    }
}
