public class LowerBound {
    public static void main(String[] args) {
        int [] arr={10,20,30,30,30,40,60,70,80};
        int x=75;
        //Lower bouund arr[index] >= 
        int ans=lower(arr,x);
        System.out.println(ans);
    }
    static int lower(int [] arr,int x){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int lowerIndex=n;
        while(low <= high){
            int mid=low + (high-low)/2;
            if(arr[mid]>=x){
             lowerIndex=Math.min(mid,lowerIndex);
             high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return lowerIndex;
    }
}
