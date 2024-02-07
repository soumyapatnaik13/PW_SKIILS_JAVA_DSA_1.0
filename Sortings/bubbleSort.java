public class bubbleSort {
    public static void main(String[] args) {
        int [] arr={5,1,3,4,2,10,8,19,32};
        bubble(arr);//pass by reference
        for(int ele:arr){
            System.out.print(ele+",");
        }
    }
    //bubble sort: each outer loop largest element will placed at the end
    //inner loop will work as two pointer where j and j+1 willbe swapped
    static void bubble(int [] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(j,j+1,arr);
                }
            }
        }
    }
    static void swap(int start,int end, int [] arr){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
