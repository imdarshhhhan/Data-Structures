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
class P1 {

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

    static void inOrder(Node root){
        if(root ==null)return;

        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

        static void postOrder(Node root){
        if(root ==null)return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }

    static void preOrder(Node root) {
        if(root ==null)return;

        System.out.println(root.data);

        preOrder(root.left);
        preOrder(root.right);
        
    }


    public static void main(String[] args) {
        int[] arr = {5,6,4,3,1,2,7};
        Node root = new Node(4);
        for(int x : arr){
            root = insertNode(root, x);
        }
        System.out.println("inorder is :");
        inOrder(root);

        System.out.println("post order is : ");
        postOrder(root);

        System.out.println("pre Order traversal  : ");
        preOrder(root);

    }

}