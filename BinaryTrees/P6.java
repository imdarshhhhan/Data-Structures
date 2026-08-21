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
class P6  {

    static int maxHeight(Node root){

        if(root == null)return 0;

        int lh = maxHeight(root.left);
        int rh = maxHeight(root.right);

        return 1 + Math.max(lh , rh);

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println(maxHeight(root));
    }
}