class TreeNode{
    //each node has one value and left node adress and right node adress
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val=val;
    }
}
public class productOfNodes {
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

        int ans=product(a);
        System.out.println(ans);
    }
    static int product(TreeNode h){
        if(h== null){
            return 1;
        }
        return h.val * product(h.left) * product(h.right);
    }
}
