import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    //each node has one value and left node adress and right node adress
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val=val;
    }
}
public class BFS{
    public static void main(String[] args) {
            TreeNode a= new TreeNode(1);
            TreeNode b= new TreeNode(4);
            TreeNode c= new TreeNode(3);
            TreeNode d= new TreeNode(2);
            TreeNode e= new TreeNode(6);
            TreeNode f= new TreeNode(10);
            TreeNode g= new TreeNode(5);
            TreeNode h= new TreeNode(20);
            a.left=b;
            a.right=c;
            b.left=d;
            b.right=e;
            c.left=f;
            c.right=g;
            g.left=h;//1,4,3,2,6,10,5,20
            printLevel(a);
            System.out.println();
            printRightToleftLevel(a);

    }
    static void printRightToleftLevel(TreeNode root){
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
           TreeNode v=q.poll();// pop that value and check
           System.out.print(v.val+" ");
           if(v.right != null){
                q.add(v.right);
           }
           if(v.left !=null){
               q.add(v.left);
           }
        }
    }
    static void printLevel(TreeNode root){
    Queue<TreeNode> q= new LinkedList<>();//the type is treenode so that i can access to the left and right node
     q.add(root);
     while(!q.isEmpty()){
        TreeNode v=q.poll();// pop that value and check
        System.out.print(v.val+ " ");
        if(v.left != null){//if left not equal to null means stores that at the end of the queue 
            // so after this portion complete that queue will print from the left part
            // as queue follows fast in fast out
             q.add(v.left);
        }
        if(v.right !=null){
            q.add(v.right);
        }
     }
    
    
    }
}