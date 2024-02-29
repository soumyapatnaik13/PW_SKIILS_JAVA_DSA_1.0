import java.util.Arrays;

public class merger2SortedArray{
    public static void main(String []args){
    int [] arr1={1,3,5,7};
    int [] arr2={2,4,6,8,9,10};
     int [] ans=merge(arr1,arr2);
     System.out.println(Arrays.toString(ans));
    }
    static int [] merge(int []a1,int []a2){
   int m=a1.length;
   int n=a2.length;
   int[] ans=new int[m+n];
   int i=0;
   int j=0;
   int k=0;
   while(i<m && j<n){
    if(a1[i]<a2[j]){
        ans[k]=a1[i];
         i++;
    }
    else{
        ans[k]=a2[j];
        j++;
    }
    k++;
   }
   while(i<m){
    ans[k]=a1[i];
    i++;
    k++;
   }
   while(j<n){
    ans[k]=a2[j];
    j++;
    k++;
   }
   return ans;
    }
}