public class basicAlgorithm{
    public static void main(String[] args) {
        int [] arr={10,15,21,34,81,105,180,500};
        int target=24;
       Boolean ans= search(arr,target);
       System.out.println(ans);
    }
    static Boolean search(int [] arr,int target){
        int n=arr.length;
        int low= 0;
        int high=n-1;
        Boolean flag =false;
        while(low <= high){
            int mid=low + (high-low)/2;
            if(arr[mid]==target){
                flag=true;
                break;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return flag;
    }
}