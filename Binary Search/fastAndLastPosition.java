public class fastAndLastPosition {
    public static void main(String[] args) {
        int [] arr={10,10,20,20,20,20,30,30,30,40};
        // fast positon is equal to lower bound and last position is upper bound -1
        int target=20;
       int ans= position(arr,target);
       System.out.println(ans);
    }
    static int position (int [] arr,int target){
        int n=arr.length;
        int s=0;
        int e=n-1;
        int lower=n;
        int upper=n;
        while(s<=e){
            int mid=s +(e-s)/2;
            if(arr[mid]>=target){
             lower=Math.min(mid,lower);
             e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        s=0;
        e=n-1;
        while(s<=e){
            int mid=s +(e-s)/2;
            if(arr[mid]<target){
            s=mid+1;
            }
            else{
               upper=Math.min(mid,upper);
               e=mid-1;
            }
        }
        return upper -lower;
    }
}
