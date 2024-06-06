public class MaximumSubArraySum{
    public static void main(String []args){
        int []arr= {10,20,1,3,-40,80,3};
        int k=3;
        int ans=findmaximum(arr,k);
        System.out.println(ans);
    }
  /*   static int findmaximum(int []arr,int k){
         int n=arr.length;
         int ans=Integer.MIN_VALUE;
         for(int i=0;i<n-k;i++){
            int kSum=0;
            for(int j=i;j<i+k;j++){
                   kSum+=arr[j];
            }
             ans=Math.max(kSum,ans);
         }
         return ans;
    }
}
*/
    static int findmaximum(int []arr,int k){
      //use the sliding window approach
      //so range of i and j and when i+1 and j+1 then k-1 term is common
      //so prvs sum - i-1 + current j = i+1 and j+1
      int prvsSum=0;
      int n=arr.length;
      for(int i=0;i<k;i++){
        prvsSum+=arr[i];
      }
      int i=1;
      int j=(i+k)-1;
      int max=0;
      while(j<n){
        int slidingSum =prvsSum - arr[i-1] + arr[j];
        max=Math.max(prvsSum,slidingSum);
        prvsSum=slidingSum;
        i++;
        j++;

      }
      return max;
    }
}