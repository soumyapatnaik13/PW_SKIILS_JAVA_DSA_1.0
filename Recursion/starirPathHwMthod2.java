public class starirPathHwMthod2 {
    public static void main(String[] args) {
        int num=5;
       int ans= path(num,0);
       System.out.println(ans);
    }
    static int path(int num,int sum){
        if(num==sum){
            return 1;
        }
        if(sum>num){
            return 0;
        }
       int count1= path(num,sum+1);
       int count2=path(num,sum+3);
       return count1+count2;
    }
}
