public class prvsGreatestEle {
    public static void main(String[] args) {
        //using brute f approach
        int []arr= {5,4,3,2,1,1,5,6,8,9};//-1,5,4,3,2,2,-1,-1,-1,-1
        prvsGreatest(arr);
    }
    static void prvsGreatest(int [] arr){
      for(int i=0;i<arr.length;i++){
        int max=-1;
        for (int j=i;j>=0;j--){
            if(i != j){
                if(arr[j]>arr[i]){
                  max=arr[j];
                  break;
                }
            }
        }
        System.out.println(max);
      }
    }
}
