public class minSubArray {
    public static void main(String []args){
        int []nums = {2,3,1,2,4,3};
        int ans=minSubArrayLen( 7,nums);
        System.out.println(ans);
    }
    public static int minSubArrayLen(int target, int[] nums) {
        //use sliding window approach
        int i=0;
        int min=Integer.MAX_VALUE;
        int sum=0;
        int n=nums.length;
        while(i<n && sum< target){
          sum += nums[i];
          i++;
        }
        min=Math.min(min,i-0);
        int j=i;
        i=1;
        while(j<n){
         //find the sliding window till this part
         sum= sum-nums[i-1];
         //check if the current sum is alsp the target sum for this
         //lenghth or not
         if(sum >= target) min=Math.min(min,j-i+1);
         else{
            while(j<n && sum< target){
                sum += nums[j];
                j++;
            }
            j--;
            if(j != n)min=Math.min(min,j-i+1);
         }
         i++;
        }
    return min;
    }
}
