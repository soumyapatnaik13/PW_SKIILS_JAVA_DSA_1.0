public class MaxconsequetiveOnes {
    public static void main(String[] args) {
       int[] nums = {1,1,1,0,0,0,1,1,1,1,0}; 
       int k = 2;
       int ans=longestOnes(nums,k);
       System.out.println(ans);

    }
    public static int longestOnes(int[] nums, int k) {
        //use 2 pointer approach
        //step 1
        //take i to the 1 number
        int i=0;
        int n=nums.length;
        while(i<n && nums[i]!= 1){
            i++;
        }
        int j=i;
        //step to to check
        int count=Integer.MIN_VALUE;
        int numszero=0;
        while(j < n){
         if(nums[j]==1) j++;
         else{
            if(numszero < k ) {
                numszero++;
                j++;
            }
            else{// numszero > k
               count = Math.max(count,j-i);
               j++;
               numszero++;
               numszero=numszero-k;
               i=j-1;
            }
         }
        }
         if(numszero == k){
            count = Math.max(count,(j-i));
         }
  return count;

        
    }
}
