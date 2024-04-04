import java.util.Stack;
public class infixWithBrackets {
    public static void main(String[] args) {
        String s="9-(5+3)*4/6";
        findInfix(s);
    }
    static void findInfix(String s){

        Stack<Integer>num=new Stack<>();
        Stack<Character>op=new Stack<>();

    for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        int asci=(int)c;
        if(asci >=48 && asci<=57){
            //numeric 
            num.push(asci-48);
        }
        else if(op.isEmpty() || c=='(' || op.peek()=='('){
            op.push(c);
        }
        else if(c==')'){
            while(op.peek() != '('){
                int val2= num.pop();
                int val1=num.pop();
                if(op.peek() =='+'){
                    num.push(val1 + val2);
                }
                else if(op.peek() =='-'){
                    num.push(val1 - val2);
                }
                else if(op.peek() =='*'){
                    num.push(val1 * val2);
                }
                else if(op.peek() =='/'){
                    num.push(val1 / val2);
                }
                op.pop();
            }
                op.pop();

            
        }
        else{
            if(c=='+' || c=='-'){// before doing + and - make sure to solve all the other op (+,-,*,/)
                int val2=num.pop();
                int val1=num.pop();
             if(op.peek()=='+'){
               num.push(val1 + val2);
               op.pop();
               op.push(c);
              }
              else if(op.peek()=='-'){
                num.push(val1 - val2);
                op.pop();
                op.push(c);
               }
            else if(op.peek()=='*'){
                num.push(val1 * val2);
                op.pop();
                op.push(c);
               }
            else if(op.peek()=='/'){
                num.push(val1 / val2);
                op.pop();
                op.push(c);
               }
            }
            else if(c=='*'|| c=='/'){ // * and / presidency is higher so if + and - there then just push else do the part and then push
                if(op.peek()=='*'){
                 int val2=num.pop();
                int val1=num.pop();
                    num.push(val1 * val2);
                    op.pop();
                    op.push(c);
                   }
                else if(op.peek()=='/'){
                int val2=num.pop();
                int val1=num.pop();
                    num.push(val1 / val2);
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
         int val2=num.pop();
         int val1=num.pop();
         if(op.peek()=='+'){
            num.push(val1 + val2);
            op.pop();
            
           }
           else if(op.peek()=='-'){
             num.push(val1 - val2);
             op.pop();
             
            }
         else if(op.peek()=='*'){
             num.push(val1 * val2);
             op.pop();
             
            }
         else if(op.peek()=='/'){
             num.push(val1 / val2);
             op.pop();
             
            }
       }
    
    System.out.println(num.peek());
    }
}
