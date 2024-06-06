public class findPivotIndex{
    public static void main (String []args){
        int [] nums= {1,7,3,6,5,6};
        int ans=pivotIndex(nums);
        System.out.println(ans);
    }
    public static int pivotIndex(int[] nums) {
        //store inside a prefix sum
        int []prefix= new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i] =prefix[i-1] + nums[i];
        }
        //so the pivot idx : i-1 + sum(n-1) - sum(i)
        int n=prefix.length;
        for(int i=0;i<nums.length;i++){
            //for base case
            if(i==0) {if(prefix[n-1] - nums[i] == 0) return i;}
            else if(i == n-1) {if(prefix[n-2]==0) return i;}
            else{
                int left= prefix[i-1];
                int right = prefix[n-1] - prefix[i];
                if(left == right){
                    return i;
                }
            }
        }
        return -1;
    }
}