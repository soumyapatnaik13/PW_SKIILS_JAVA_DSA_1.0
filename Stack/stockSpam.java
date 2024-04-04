import java.util.Arrays;

public class stockSpam {
    public static void main(String[] args) {
        int [] arr={10,4,5,90,120,80};
        
        int []ans= new int[arr.length];
        int n=arr.length;
        ans[0]=1;
        for(int i=1;i<n;i++){
            ans[i]=1;
            for(int j=i-1;j>=0 && arr[i]>=arr[j];j--){
                 ans[i]++;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
