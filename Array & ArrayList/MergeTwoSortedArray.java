import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
         /*
          * approach: take two array and then merge into one
              use three pointer approach
          */
          int [] a={1,3,5,7};
          int [] b={2,4,6,8,9,10}; // ans= 1,2,3,4,5,6,7,8,9,10
          int [] ans=sortedArray(a,b);
          System.out.println(Arrays.toString(ans));
    }
    static int [] sortedArray(int [] arr1, int[] arr2){
        int m=arr1.length;
        int n= arr2.length;
        int [] ans= new int[m+n]; //this will store the value of two array
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(arr1[i]<arr2[j]){
               ans[k]=arr1[i];
               i++;
               k++;
            }
            else{ // j value is lesser
              ans[k]=arr2[j];
              j++;
              k++;
            }
        }
        //after finishing the array some elements left in either of that array in that case
        if(i<m){
            while(i<m){
            ans[k]=arr1[i];
            i++;
            k++;
            }
        }
        if(j<n){
            while(j<n){
            ans[k]=arr2[j];
            j++;
            k++;
            }
        }
        return ans;
    }
}
