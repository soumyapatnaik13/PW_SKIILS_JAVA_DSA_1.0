public class kthSmallestElement {
    public static void main(String[] args) {
        int []arr={10,2,3,8,-4,-2,6};
        int k=5;
        int ans=findElement(arr,k);
        System.out.println(ans);
    }
    static int findElement(int []arr,int k){
        for(int i=0;i<k;i++){
            int minIdx=i;
            //using selection sort
            for(int j=i+1;j<arr.length;j++){
                 if(arr[j]<arr[minIdx]){
                    minIdx=j;
                 }
            }
            swap(arr,i,minIdx);
        }
        return arr[k-1];
    }
    static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
