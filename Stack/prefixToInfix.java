import java.util.Stack;
public class prefixToInfix {
    public static void main(String[] args) {
        String prefix="-9/*+5346";
        convert(prefix);
    }
    static void convert(String p){
     //foo prefix form right to left
     Stack<String> num= new Stack<>();
     Stack<Charachter> ch= new Stack<>();
     for(int i=p.length()-1;i>=0;i--){
         char c=p.charAt(i);
         int asci=(int)c;
         if(asci >= 48 && asci <=57){
              num.push(c+ " ");
         }
         else{
            // val 1 + op + val 2
            String val1=num.pop();
            String val2=num.pop();
             num.push(val1+c+val2);
         }
     }
     System.out.println(num.peek());
    }
}
