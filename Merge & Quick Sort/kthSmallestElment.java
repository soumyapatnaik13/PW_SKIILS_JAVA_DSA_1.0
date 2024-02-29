public class kthSmallestElment{
    static int ans;
    public static void main(String[] args) {
        int []arr={3,4,2,1,5,7,8,6,12,45,34};
        int k=2;
        merge(arr,arr.length-k+1,0,arr.length-1);
        System.out.println(ans);
    }
    static void merge(int []arr,int k,int l,int h){
        if(l>h){
            return;
        }
       int indx= partition(arr,k,l,h);
       if(indx==k-1){
        ans=arr[indx];
       }
       else if(indx > k-1){
        merge(arr,k,l,indx-1);
       }
       else{
        merge(arr,k,indx+1,h);
       }
    }

   static int partition(int []arr,int k,int l,int h){
    int count=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]<arr[l]){
            count+=1;
        }
    }
    swap(arr,count,l);
    int i=l;
    int j=h;
    int pivot=arr[count];
    while(i< pivot && j>pivot){
        if(arr[i]<arr[pivot]){
            i++;
        }
        else if(arr[j]>pivot){
            j--;
        }
        else{
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    return count;
   }
   static void swap(int []arr,int s,int e){
    int temp=arr[s];
    arr[s]=arr[e];
    arr[e]=temp;
   }
}

   
