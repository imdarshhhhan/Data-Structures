import java.util.ArrayList;
import java.util.List;
class Node {
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
    }
}

class P12 {
    public static List<List<Integer>> paths(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(root, ans, temp);
        return ans;
    }
    private static void helper(Node root ,List<List<Integer>> ans, List<Integer> temp){
        if(root == null) return;
        
        temp.add(root.data);
        if(root.left == null && root.right == null){
            ans.add(new ArrayList<>(temp));
            temp.removeLast();
            return;
        }
        else {
            helper(root.left, ans, temp);
            helper(root.right, ans, temp);
        }
        temp.removeLast();
    }

        public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(paths(root));
    }
}