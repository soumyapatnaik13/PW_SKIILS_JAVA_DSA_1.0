public class SortZeroOneTwo {
 /*
  * count the 0 1 and 2 then put that in a sorted order
  */
  public static void main(String[] args) {
    int [] arr={0,1,2,2,2,1,0,0,1,2};  // 0 0 0 1 1 1 2 2 2 2
    sort(arr);//double pass
    for(int ele: arr){
        System.out.print(ele + " ");
    }
  }
  static void sort(int[] arr){
    int numzeros=0;
    int numones=0;
    int numtwos=0;

    for(int i=0;i<arr.length;i++){
        if(arr[i]==0){
            numzeros++;
        }
        else if(arr[i]==1){
            numones++;
        }
        else{
            numtwos++;
        }
    }
    for(int i=0;i<arr.length;i++){
        if(i<numzeros){
            arr[i]=0;
        }
        else if(i< numzeros+numones){
            arr[i]=1;
        }
        else if(i<numones+numtwos+numtwos){
            arr[i]=2;
        }
    }
  }
}
