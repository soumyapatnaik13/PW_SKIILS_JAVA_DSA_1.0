public class ReverseEachWords {
    public static void main(String[] args) {
        StringBuilder s= new StringBuilder("i am rahul patnaik");
        StringBuilder ans=reverse(s);
        System.out.println(ans);
    }
    static StringBuilder reverse(StringBuilder s){
        int i=0;
        int j=0;
        int n= s.length();
        while(j<=n){
            if(s.charAt(j) != ' '){
              j++;
            }
            else{
                swap(i,j-1,s);
                if(j<n){
                i=j+1;
                j=i;
                }
            }
        }
        return s;
    }
    static void swap(int i,int j,StringBuilder s){
        while(i<j){
        char ns= s.charAt(i);
        char ne= s.charAt(j);
        s.setCharAt(i, ne);
        s.setCharAt(j, ns);
        i++;
        j--;
        }
    }
}
