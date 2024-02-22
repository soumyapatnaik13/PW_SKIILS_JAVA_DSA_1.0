import java.util.Scanner;
public class HCF{
    //hcf refers to as highest common diviser of 2 numbers
    public static void main (String[]args){
       try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the number you want to insert: ");
           int n1=sc.nextInt();
           System.out.println("Enter the num you want to insert : ");
           int n2=sc.nextInt();
           int ans=findTheCommonDivisor(n1,n2);
           System.out.println(ans);
    }
}
   static int findTheCommonDivisor(int n1,int n2){
    // the common highest integer will always lies from the min num of that two num 
    // and till it reaches 0
    int min=Math.min(n1,n2);
    for(int i=min;i>=0;i--){
        if(n1 % i == 0 && n2 % i ==0){
            return i;
        }
    }
    return 1;
   }
}