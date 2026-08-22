class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
    this.val = val;
}
    Node(int val, Node left , Node right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class P9  {

    public static int maxPathSum(Node root){
        int[] maxVal = new int[1];
        maxVal[0] = Integer.MIN_VALUE;
        dfs(root, maxVal);
        return maxVal[0];
    }
    static int dfs(Node root, int[] maxVal){
        if(root == null)return 0;

        int left = Math.max(0, dfs(root.left, maxVal));
        int right = Math.max(0, dfs(root.right, maxVal));

        maxVal[0] = Math.max(maxVal[0], left + right + root.val);
        return Math.max(left, right) + root.val;

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(maxPathSum(root));
    }
}