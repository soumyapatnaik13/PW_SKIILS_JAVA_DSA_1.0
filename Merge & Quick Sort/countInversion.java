// inversion => the pair that has arr[index] and the number that are less than that ele and pair of both 
// brute force => use nested for loop => TC O n sqquare
// optimize => use merge sort it can divide the array into two halfs and then apply some logic to find so TC will be O(m+n)

public class countInversion{
    static int count=0;
    public static void main(String [] args){
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
      count(left,right);
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
    static void count(int []l,int[]r){
        int i=0;
        int j=0;
        while(i<l.length && j < r.length){
            if(l[i]>r[j]){
                count +=l.length-i;
                j++;
            }
            else{
                i++;
            }
        }
    }
}