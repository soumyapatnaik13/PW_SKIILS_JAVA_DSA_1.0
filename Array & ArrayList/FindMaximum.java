public class FindMaximum {
  public static void main(String[] args) {
   int [] arr={3,2,6,7,4,9,6};
  int ans= maximum(arr);
  System.out.println(ans);
  }  
  static int maximum(int [] arr){
    int max=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    return max;
  }
}
