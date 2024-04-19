 class TreeNode{
    //each node has one value and left node adress and right node adress
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val=val;
    }
}
public class CreateNodes{
    public static void main(String[] args) {
        TreeNode a= new TreeNode(1);
            TreeNode b= new TreeNode(4);
            TreeNode c= new TreeNode(3);
            TreeNode d= new TreeNode(2);
            TreeNode e= new TreeNode(6);
            TreeNode f= new TreeNode(7);
            a.left=b;
            a.right=c;
            b.left=d;
            b.right=e;
            c.right=f;
            
           // System.out.println(a.left);//both have the same memory adress as a.left store the b adress
          //  System.out.println(b);

          //  System.out.println(a.left.left);
          //  System.out.println(b.left);


            display(a);
    }
    static void display(TreeNode a){
        if(a==null){
            return;
        }
        System.out.print(a.val + "=>");
        display(a.left);
        display(a.right);
    }
}