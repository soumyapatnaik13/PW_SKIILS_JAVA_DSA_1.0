import java.util.*;
public class anagramOrNot {
    public static void main(String[] args) {
        String s="race";
        String v="care";
        System.out.println(anagram(s,v));
    }
    static Boolean anagram(String s, String v){
        Map<Character,Integer> mp= new HashMap<>();
        if(s.length() != v.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
            mp.put(v.charAt(i),mp.getOrDefault(v.charAt(i),0)-1);
        }
       for(int i: mp.values()){
          if(i != 0){
            return false;
          }
       }
        return true;
    }
}
