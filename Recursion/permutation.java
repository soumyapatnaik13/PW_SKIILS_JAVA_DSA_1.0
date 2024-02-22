public class permutation {
    public static void main(String[] args) {
        //intution => it depends on the factorial of n so it wuill depend on the variable size
        // for n -3 it will give me 3! which is 1*2*3
        String s="abc";
        elements(s,"");

    }
    static void elements(String s,String ans){
      if(s.isEmpty()){
        System.out.print(ans+" ");
        return;
      }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            elements(s.substring(0,i)+ s.substring(i+1), ans+c);
        }
    }
}
