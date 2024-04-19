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


public class pairBFS {

    public static class Pair{
        int val;
        TreeNode node;
        Pair (TreeNode n, int val){
            this.node=n;
           this.val=val;
    
        }
    }    
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
        TreeNode j= new TreeNode(10);
        TreeNode k= new TreeNode(11);
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=f;
        c.right=g;
        e.left=h;
        e.right=i;
        f.right=j;
        g.right=k;

        printLevels(a);
    }
    static void printLevels(TreeNode root){
     Queue<Pair> q= new LinkedList<>();//pair stores the treenode and level
     int prvsLevel=0;
     q.add(new Pair(root, 0));//val refers to as level
     while(q.size()>0){

        Pair p=q.poll();//pop the element and store inside pair data type p
        TreeNode t= p.node;//to fetch the treeNode data from pair
        int currentLevel=p.val;//to fetch the int data types from the pair
       
        if(prvsLevel != currentLevel ){
             System.out.println();
             prvsLevel++;
        }

        System.out.print(t.val);
        if(t.left != null){
            q.add(new Pair(t.left, currentLevel +1));
        }
        if(t.right != null){
            q.add(new Pair(t.right, currentLevel +1));
        }
     }
        
     

    }
        
    }

