public class ArrayTraversal {
    public static void main(String[] args) {
        int [] arr={12,3,4,5,67,2,1,3,5};
        traversal(arr,0);
    }
    static void traversal(int [] arr,int idx){
      if(idx==arr.length){
        return;
      }
      System.out.print(arr[idx]+ " ");
      traversal(arr, idx+1);
    }
}
