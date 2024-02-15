public class upperBound {
    public static void main(String[] args) {
        int [] arr={10,20,30,30,40,50,60,};
        int x=30;
       int index= upper(arr,x);
       System.out.println(index);
    }
    static int upper(int [] arr,int x){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int upper=n;
        while(low <= high){
            int mid=low +(high-low)/2;
            if(arr[mid]>x){
                upper=Math.min(mid,upper);
                 high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return upper;
    }
}
