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

class P13 {
    public static int maxPathSum(Node root) {
        int maxSum = 0;
        return sum(root, maxSum);

    }
    static int sum(Node root, int maxSum){
        if(root == null)return 0;

        int left = sum(root.left, maxSum);
        int right = sum(root.right, maxSum);
        //int curr = root.val <0 ? 0 : root.val;
        maxSum = Math.max(maxSum, left + right + root.val);
        return maxSum;
    }
    public static void main(String[] args) {
        Node root = new Node(-12);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(maxPathSum(root));
    }
}