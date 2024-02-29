public class countWithoutInversion {
    static int count;
    public static void main(String[] args) {
    int [] arr={8,2,5,3,1,4};
    merge(arr);
    System.out.println(count);
}
static int [] merge(int [] arr){
  int n=arr.length;
  if(n==1){
    return arr;
  }
  int []arr1= new int[n/2];
  int []arr2= new int[n-n/2];
  for(int i=0;i<n/2;i++){
    arr1[i]=arr[i];
  }
  for(int j=0;j<n-n/2;j++){
    arr2[j]=arr[j+n/2];
  }
   int [] left=merge(arr1);
   int []right= merge(arr2);
 return mergeSort(left,right);

}
static int[] mergeSort(int []left,int []right){
    int m=left.length;
    int n=right.length;
    int []ans= new int[m+n];
    int i=0;
    int j=0;
    int k=0;
    while(i<m && j<n){
        if(left[i]<right[j]){
            ans[k]=left[i];
            i++;
        }
        else{
            count+=left.length-i;
            ans[k]=right[j];
            j++;
        }
        k++;
    }
    while(i<m){
        ans[k]=left[i];
        i++;
        k++;
    }
    while(j<n){
        ans[k]=right[j];
        j++;
        k++;
    }
    return ans;
}
}

