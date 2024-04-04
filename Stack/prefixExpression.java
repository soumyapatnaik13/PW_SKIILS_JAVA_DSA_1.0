import java.util.Stack;
public class prefixExpression{
    public static void main(String[] args) {
        String s="9-5+3*4/6";
        findInfix(s);
    }
    static void findInfix(String s){

        Stack<String>num=new Stack<>();
        Stack<Character>op=new Stack<>();

    for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        int asci=(int)c;
        if(asci >=48 && asci<=57){
            //numeric 
           String st= " "+ c;
           num.push(st);
        }
        else if(op.isEmpty()){
            op.push(c);
        }
        else{
            if(c=='+' || c=='-'){// before doing + and - make sure to solve all the other op (+,-,*,/)
                String val2=num.pop();
                String val1=num.pop();
             if(op.peek()=='+'){
                char ch= op.peek();
               num.push(ch+val1+val2);
              
              }
              else if(op.peek()=='-'){
                char ch= op.peek();
               num.push(ch+val1+val2);
                
               }
            else if(op.peek()=='*'){
                char ch= op.peek();
               num.push(ch+val1+val2);
                
               }
            else if(op.peek()=='/'){
                char ch= op.peek();
               num.push(ch+val1+val2);
               }
               op.pop();
               op.push(c);
            }
        
            else if(c=='*'|| c=='/'){ // * and / presidency is higher so if + and - there then just push else do the part and then push
                
                if(op.peek()=='*'){
                    String val2=num.pop();
                    String val1=num.pop();
                    
                    char ch= op.peek();
                    num.push(ch+val1+val2);
                    op.pop();
                    op.push(c);
                   }
                else if(op.peek()=='/'){
                    String val2=num.pop();
                    String val1=num.pop();
                    
                    char ch= op.peek();
                    num.push(ch+val1+val2);
                    op.pop();
                    op.push(c);
                   }
                   else{
                    op.push(c);
                   }
                }   
            
        }
    }
       while(num.size()>1){
        String val2=num.pop();
        String val1=num.pop();
        if(op.peek()=='+'){
            char ch= op.peek();
           num.push(ch+val1+val2);
          }
          else if(op.peek()=='-'){
            char ch= op.peek();
           num.push(ch+val1+val2);
            
           }
        else if(op.peek()=='*'){
            char ch= op.peek();
           num.push(ch+val1+val2);
            
           }
        else if(op.peek()=='/'){
            char ch= op.peek();
           num.push(ch+val1+val2);
           }
           op.pop();
           
       }
    
    System.out.println(num.peek());
    }
    }
