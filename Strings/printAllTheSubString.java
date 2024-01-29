import java.util.ArrayList;
import java.util.List;

public class printAllTheSubString {
    public static void main (String[] args){
        String s="abcd";
       List<List<String>>ans= substring(s);
       for(List<String> sub : ans){
        System.out.println(sub+" ");
       }
    }
    static List<List<String>> substring(String s){
    List<List<String>> ans= new ArrayList<>();
       List <String > sub= new ArrayList<>();
       int n=s.length();
       for(int i=0;i<n;i++){
        sub.clear();// so the obj will give the pass the reference so any changes by the obj will reflect the other one
        for(int j=i+1;j<=n;j++){
          String v= s.substring(i, j);
           sub.add(v);
        }
        ans.add(new ArrayList<>(sub));// creating a new sub list in each iterarion
       }

        return ans;
    }
}
