public class FindTheSecondLargest {
    public static void main(String[] args) {
        int [] arr={23,35,12,67,45,34,11};
        int ans=secondLargest(arr);
       System.out.println(ans); 
    }
    static int secondLargest(int []arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int sl=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != max && arr[i]>sl){
              
                sl=arr[i];
            }
        }
        return sl;
    }
    
}
