class TreeNode{
    //each node has one value and left node adress and right node adress
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val=val;
    }
}
public class Level {
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
        e.right=h;
        c.left=f;
        c.right=g;

       int level= level(a);
       System.out.println(level);
    }
    static int level(TreeNode a){
        if(a == null){
            return 0;
        }
        int l=level(a.left);
        int r=level(a.right);
        int max=Math.max(l,r);
        
        return max +1;
        //Level sabke niklenge
    }
}
