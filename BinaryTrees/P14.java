
import java.util.*;
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

class P14  {

    public static boolean isComplete(TreeNode root){
        if(root == null)return false;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();                    
            for(int i = 0; i < n; i++){
                TreeNode node = q.poll();
                if(i != n-1 && node.val == -1)return false;

                if(node.left == null)q.add(new TreeNode(-1));
                else {
                    q.add(node.left);
                }
                if(node.right == null)q.add(new TreeNode(-1));
                else {
                    q.add(node.right);
                }
            }
        }
        return true;

    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(isComplete(root));
    }
}