class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class inorderPredecorAndSucc {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(50);
        TreeNode b = new TreeNode(30);
        TreeNode c = new TreeNode(20);
        TreeNode d = new TreeNode(40);
        TreeNode e = new TreeNode(70);
        TreeNode f = new TreeNode(60);
        TreeNode g = new TreeNode(80);

        a.left = b;
        b.left = c;
        b.right = d;
        a.right = e;
        e.left = f;
        e.right = g;

        int[] succ = new int[1];
        int[] pre = new int[1];

        int key = 30;
        findKey(a, succ, pre, key);

        System.out.println("Predecessor: " + pre[0]);
        System.out.println("Successor: " + succ[0]);
    }

    static void findKey(TreeNode root, int[] suc, int[] pre, int key) {
        if (root == null) return;

        findKey(root.left, suc, pre, key);

        if (root.val == key) {
            if (root.left != null) {//if root value is key and thaat level is in higher order
                //then in the left side take temp and put in the right side thats where you will find the prvs grts
                TreeNode temp = root.left;
                while (temp.right != null) {
                    temp = temp.right;
                }
                pre[0] = temp.val;
            }
            if (root.right != null) {
                TreeNode temp = root.right;
                while (temp.left != null) {
                    temp = temp.left;
                }
                suc[0] = temp.val;
            }
        }

        findKey(root.right, suc, pre, key);
    }
}
