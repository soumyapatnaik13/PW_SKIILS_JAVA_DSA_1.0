public class HappyNumber{
    public static void main (String [] args){
        int n=2;
       boolean ans= isHappy(n);
       System.out.println(ans);
    }

public static boolean isHappy(int n) {
    int slow=n;
    int fast=n;
    while(fast !=1 ){
       slow=sumDigits(slow);
       fast=sumDigits(sumDigits(fast));
       if(fast == slow){
        return false;
       }
      
    }
    return true;
    }
    static int sumDigits(int n){
        int sum=0;
     while(n!=0){
        int d= n % 10;
        sum += d*d;
        n=n/10;
     }
     return sum;
    }
}