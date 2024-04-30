class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
    }

}
public class countBST {
     public static void main(String[] args) {
        TreeNode a=new TreeNode(10);
        TreeNode b=new TreeNode(5);
        TreeNode c=new TreeNode(50);
        TreeNode d=new TreeNode(1);
        TreeNode e=new TreeNode(40);
        TreeNode f=new TreeNode(100);
        a.left=b;
        a.right=c;
        b.left=d;
        c.left=e;
        c.right=f;
        int l=5;
        int h=45;
        int count=0;
        int ans=count(a,l,h,count);
        System.out.println(ans);

     }
     static int count(TreeNode root, int l, int h, int c) {
        if (root == null)
            return c;
        
        if (root.val >= l && root.val <= h) {
            c++;
        }
        
        if (root.val <= h) {
            c = count(root.right, l, h, c);
        }
        
        if (root.val >= l) {
            c = count(root.left, l, h, c);
        }
        
        return c;
    }
}
