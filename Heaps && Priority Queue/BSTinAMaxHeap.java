class Node{
    Node left;
    Node right;
    int val;
    Node(int val){
        this.val=val;
    }
}

public class BSTinAMaxHeap {
    public static void main(String[] args) {
        Node a= new Node(11);
        Node b= new Node(9);
        Node c= new Node(10);
        Node d=new Node (6);
        Node e= new Node(5);
        Node f= new Node(4);
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=f;
        //in order to make a bt as a maxheap there are two rules it need to follow
        //check if the parent node val is > left and right
        // and the node are in the complete BSt order
        boolean ans=IsMaxHeap(a);
        System.out.println((ans));
    }

    public static boolean IsMaxHeap(Node root){
        return isHeap(root) && isCbt(root);
    }
    
   public static boolean isHeap(Node root){
    if(root == null) return true;
     if(root.left!= null && root.left.val >root.val) return false;
     if(root.right != null && root.right.val > root.val) return false;
     return isHeap(root.left) && isHeap(root.right);

   }

    private static boolean isCbt(Node root){
      int size=size(root);
      return cbt(root,0,size);
    }

    private static boolean cbt(Node root,int i,Integer size){
      if(root== null) return true;
      if(i>= size) return false;
      return cbt(root.left,i * 2+1, size) && cbt(root.right,i*2+2,size);                                                                   
    }

    private static int size(Node root){
      if(root==null) return 0;
     return 1+ size(root.left) + size(root.right);
    }
}

