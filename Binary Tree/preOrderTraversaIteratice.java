import java.util.Stack;
class TreeNode{
    //each node has one value and left node adress and right node adress
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val=val;
    }
}
public class preOrderTraversaIteratice{
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

        printElement(a);
    }
    static void printElement(TreeNode a){
        Stack<TreeNode> s= new Stack<>();
        s.add(a);
        while(s.size()>0){
            TreeNode v=s.pop();
            System.out.print(v.val + " ");
            if(v.right != null){
                s.add(v.right);
            }
            if(v.left != null){
                s.add(v.left);
        }
    }
}
}
