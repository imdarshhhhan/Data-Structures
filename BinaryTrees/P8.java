import java.util.LinkedList;
import java.util.Queue;


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

class Pair {
    TreeNode node;
    int num;
    Pair(TreeNode node, int num){
        this.node = node;
        this.num = num;
    }
}
public class P8 {
    public static int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> q = new LinkedList<>();
        if(root == null)return 0;
        q.offer(new Pair(root, 0));
        int maxWidth = 0;
        while(!q.isEmpty()){
            int len = q.size();
            int minLeftLen = q.peek().num;
            int left = 0, right = 0;
            for(int i = 0; i < len; i++){
                int currIdx = q.peek().num - minLeftLen;
                TreeNode node = q.peek().node;
                q.poll();
                if(i == 0)left = currIdx;
                if(i == len -1)right = currIdx;
                if(node.left != null)q.offer(new Pair(node.left, currIdx *2 + 1));
                if(node.right!= null)q.offer(new Pair(node.right, currIdx * 2 + 2));
            }
            maxWidth = Math.max(maxWidth , right - left +1);
        }
        return maxWidth;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(widthOfBinaryTree(root));
    }
}