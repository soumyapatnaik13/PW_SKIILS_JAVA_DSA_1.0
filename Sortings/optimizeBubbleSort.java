public class optimizeBubbleSort {
    public static void main(String[] args) {
        int [] arr={5,4,1,2,3};
        bubble(arr);
         for(int ele: arr){
            System.out.println(ele);
         }
    }
    static void bubble(int [] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                 swap(j,j+1,arr);
                }
            }
            Boolean flag=true;
            for(int k=0;k<n-1;k++){
              if(arr[k]>arr[k+1]){
               flag=false;
               break;
              }
              //the flag value will cheack after each appearance will over
            }
            if(flag ==true){
                break;
            }
        }
    }
    static void swap(int start,int end, int [] arr){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
