import java.util.Scanner;
public class StairPath {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num=sc.nextInt();
            int ans=path(num,0);
            System.out.println(ans);
        }
        
    }
    static int path(int num,int sum){
       if(sum == num){  
       return 1;
       }
       if(sum > num){
        return 0;
       }
       int count1= path(num,sum+1);
        int count2=path(num,sum+2);

    return count1+ count2;
    }

}
