public class GrumpyBookstore {
   public static void main (String []args){
    int [] customers={1,0,1,2,1,1,7,5};
    int []grumpy = {0,1,0,1,0,1,0,1};
    int minutes = 3;
    int ans=maxSatisfied(customers,grumpy,minutes); 
    System.out.println(ans);
   } 
    public static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        //step 1 to find the fast range in between k range
        int k=minutes;
        int i=0;
        int j=k-1;
        int maxsatisfy=0;
        for(int a=i;a<=j;a++){
            if(grumpy[a] != 0){
                maxsatisfy += customers[a];
            }
        }
        //step 2 check with the value of prvs one if that range is bigger than we need to add that range in that ans
        //use sliding window i and j 
        int max=0;
        int n=grumpy.length;
        int s=0;
        int e=0;
        while(j < n){
            if(maxsatisfy > max){
                max=maxsatisfy;
                s=i;
                e=j;
            }
            i++;
            j++;
            //if the i-1 range has value of 1 then cut that part
            if(j < n && grumpy[j] != 0) maxsatisfy += customers[j];
            if(grumpy[i-1] != 0){
                maxsatisfy -= customers[i-1];
            }
        }
        int ans=0;
        for(int p=0;p<customers.length;p++){
            if(grumpy[p] == 0 || p>=s || p <=e ){
                ans+=customers[p];
            }
        }

        return ans;
    }
}

