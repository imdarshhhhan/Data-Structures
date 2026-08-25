import java.util.*;
class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class P11 {
    public static ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        helper1(root, res);
        helper2(root.right, res);
        return res;
        
    }
    static void helper1(Node root , ArrayList<Integer> res ){
        if(root == null)return;
        
        helper1(root.left , res);
        res.add(root.val);
    }
    static void helper2(Node root , ArrayList<Integer> res ){
        if(root == null)return;
        
        res.add(root.val);
        helper2(root.right , res);
        
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(topView(root));
    }
}