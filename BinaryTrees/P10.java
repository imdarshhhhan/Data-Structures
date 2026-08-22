class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
    this.val = val;
}
    TreeNode(int val, TreeNode left , TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
//lC : 129
class P10  {

    public static int sumNumbers(TreeNode root) {
        return helper(root , 0);
    }
    static int helper(TreeNode root, int ans){
        if(root == null)return 0;

        ans = ans * 10 + root.val;
        if(root.left == null && root.right == null) return ans;
        return helper(root.left , ans) + helper(root.right , ans);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(sumNumbers(root));
    }
}