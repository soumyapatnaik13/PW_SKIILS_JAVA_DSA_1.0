import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
public class KSortedArray {
    public static void main(String[] args) {
        int []arr={6,5,3,2,8,10,9};
        int k=3;
        List<Integer> ans=sort(arr,k);
        for(Integer i:ans){
            System.out.println(i);
        }
    }
    static List<Integer> sort(int [] arr,int k){
       List<Integer> ans= new ArrayList<>();
       PriorityQueue<Integer> p= new PriorityQueue<>();
       for(int i=0;i<arr.length;i++){
          p.add(arr[i]);//n log(k)
          if(p.size()>k){
            while(p.size()>0){
                ans.add(p.poll());
            }
          }
       }
       while(p.size()>0){
        ans.add(p.poll());
    }
    return ans;
    }
}
