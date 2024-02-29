import java.util.Arrays;
public class mergerSortAlgo {
    public static void main(String[] args) {
        int[] arr={80,10,70,30,60,40,50,20,39,56,19,1098,3748,6,65};
        int [] ans=merge(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] merge(int [] arr){
     int n=arr.length;
     if(n==1){
        return arr;
     }
     int [] arr1= new int[n/2];
     int [] arr2= new int[n-n/2];// for odd case 7-7/2 will gives the rest value
    //stores the value
    for(int i=0;i<n/2;i++){
        arr1[i]=arr[i];
    }
    //in the second half
    for(int j=0;j<n-n/2;j++){
        arr2[j]=arr[j+n/2];
    }
    int []a1=merge(arr1);
    int []a2=merge(arr2);

   return mergeSorted(a1,a2);
}
static int [] mergeSorted(int []a1,int []a2){
    int m=a1.length;
    int n=a2.length;
    int[] ans=new int[m+n];
    int i=0;
    int j=0;
    int k=0;
    while(i<m && j<n){
     if(a1[i]<a2[j]){
         ans[k]=a1[i];
          i++;
     }
     else{
         ans[k]=a2[j];
         j++;
     }
     k++;
    }
    while(i<m){
     ans[k]=a1[i];
     i++;
     k++;
    }
    while(j<n){
     ans[k]=a2[j];
     j++;
     k++;
    }
    return ans;
}
}
