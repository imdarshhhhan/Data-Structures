import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int val){
        this.data = val;
        this.left = null;
        this.right = null;

    }
}

class P4 {
     static Node insertNode(Node root , int val ){
        if(root == null)return new Node(val);

        if(val<root.data){
            root.left = insertNode(root.left, val);
        }
        else {
            root.right = insertNode(root.right, val);
        }
        return root;
    }

    static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();

        q.offer(root);
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> level = new ArrayList<>();

            for(int i = 0; i < n; i++){
                Node curr = q.poll();
                level.add(curr.data);
                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);
            }
            list.add(level);
        }
        System.out.println(list);


    }
    public static void main(String[] args) {
        int[] arr = {2,3,1,5,6,7};
        Node root = new Node(4);
        for(int x : arr){
            root = insertNode(root, x);
        }
        levelOrder(root);
    }
}