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
class Pair{
    TreeNode node;
    int num;
    Pair(TreeNode node, int num){
        this.node = node;
        this.num = num;
    }
}

public class P15 {
    static void allInOne(TreeNode root){
        List<Integer> post = new ArrayList<>();
        List<Integer> pre = new ArrayList<>();
        List<Integer> in= new ArrayList<>();
        Stack<Pair> s = new Stack<>();
        
        s.push(new Pair(root,1));
        while(!s.isEmpty()){
            if(s.peek().num == 1){
                pre.add(s.peek().node.val);
                s.peek().num++;
                if(s.peek().node.left != null){
                    s.push(new Pair(s.peek().node.left ,1));
                }
            }
            else if(s.peek().num == 2){
                in.add(s.peek().node.val);
                s.peek().num++;
                if(s.peek().node.right!= null){
                    s.push(new Pair(s.peek().node.right ,1));
                }
            }
            else{
                post.add(s.pop().node.val);
            }
        }
        System.out.println("pre : " + pre);
        System.out.println("in :" + in);
        System.out.println("post : "  + post);
    }



    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        allInOne(root);
    }
}