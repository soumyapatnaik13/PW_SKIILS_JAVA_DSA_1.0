import java.util.ArrayList;
import java.util.Arrays;
class TreeNode{
    //each node has one value and left node adress and right node adress
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val=val;
    }
}
public class PrintNthLevel {
    public static void main(String[] args) {
        TreeNode a= new TreeNode(1);
        TreeNode b= new TreeNode(2);
        TreeNode c= new TreeNode(3);
        TreeNode d= new TreeNode(4);
        TreeNode e= new TreeNode(5);
        TreeNode f= new TreeNode(6);
        TreeNode g= new TreeNode(7);
        TreeNode h= new TreeNode(8);
        TreeNode i= new TreeNode(9);
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        e.left=h;
        c.left=f;
        c.right=g;
        g.left=i;//1,4,3,2,6,10,5,20

        int level=3;
         
        ArrayList<Integer> arr= new ArrayList<>();
        
        for(int k=0;k<=level;k++){ 
        printLevel(a,0,k,arr);
        //as we can see that by passing i as 0 and level incraeses each time by 1 that will print
        //each level value and upto the leaf node
        }
        
        Integer[] array = arr.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));
    
    }
    static ArrayList<Integer> printLevel(TreeNode a,int i,int l,ArrayList<Integer> arr){
        if(a==null) return null;
        if(i==l){
            arr.add(a.val);
        }
        printLevel(a.left, i+1, l,arr);
        printLevel(a.right, i+1, l,arr);
        return arr;
    }
}
