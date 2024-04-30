 class TreeNode{
   int val;
   TreeNode left;
   TreeNode right;
   TreeNode(int val){
    this.val=val;
   }
}

public class findMaxAndMean{
  TreeNode root;
  void insert(int val){
    root=addElement(root,val);
  }
  private TreeNode addElement(TreeNode root,int ele){
   if(root==null){
    return new TreeNode(ele);
   }
   else{
    if(root.val>ele){
      root.left=addElement(root.left, ele);
    }
    else{
      root.right=addElement(root.right, ele);
    }
   }
   return root;
  }
  TreeNode findMin(TreeNode root){
    if(root.left==null){
      return root;
    }
      TreeNode r=findMin(root.left);
      return r;
  }
  TreeNode findMax(TreeNode root){
    if(root.right==null){
      return root;
    }
      TreeNode r=findMax(root.right);
      return r;
  }
    public static void main(String[] args) {
        findMaxAndMean a= new findMaxAndMean();
        a.insert(10);
        a.insert(5);
        a.insert(2);
        a.insert(6);
        a.insert(15);
        a.insert(12);
        a.insert(19);
        System.out.println(a.root.val);
        System.out.println(a.root.left.val);
        System.out.println(a.root.left.left.val);
        System.out.println(a.root.left.right.val);
        System.out.println(a.root.right.val);
        System.out.println(a.root.right.left.val);
        System.out.println(a.root.right.right.val);
        System.out.println("minimum element is "+ a.findMin(a.root).val);
        System.out.println("maximum element is "+ a.findMax(a.root).val);
    }
}