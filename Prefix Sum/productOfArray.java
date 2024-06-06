import java.util.Arrays;

public class productOfArray {
    public static void main(String[] args) {
        int []nums={-1,1,0,-3,3};
       int [] ans=productExceptSelf(nums);
       System.out.println(Arrays.toString(ans));
    }
    static int[] productExceptSelf(int []nums){
        int product=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] !=0)product *=nums[i];
        }
        int []ans= new int [nums.length];

        for(int i=0;i<ans.length;i++){
            if(nums[i] !=0)ans[i]=nums[i]/product;
            else ans[i]=product;
        }
        return nums;
    }
}
