public class Delete {
    static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
        }
    }
    
    // build BST
    public static Node insert(Node root, int val) {
        if(root == null) {
            root = new Node(val);
            return root;
        }
        if(root.data > val) {
            root.left = insert(root.left, val);
        }
        else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inOrder(Node root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // delete
    public static Node delete(Node root, int val) {
        if(root.data > val) { // search the node which needs to be delete first
            root.left = delete(root.left, val);
        }
        else if(root.data < val) {
            root.right = delete(root.right, val);
        }

        else { // root.data == val
            //case 1
            if(root.left == null && root.right == null) {
                return null;
            }

            // case 2
            if(root.left == null) {
                return root.right;
            }
            else if(root.right == null) {
                return root.left;
            }

            // case 3 
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);

        }
        return root;

    }

    // for finding inorder successor
    public static Node inorderSuccessor(Node root) {
        while(root.left != null) {
            root = root.left;
        }
        return root;
    }x

    public static void main(String[] args) {
        int val[] = {5,3,2 ,1,7,8,9,19};
        Node root = null;
        for(int i=0; i<val.length; i++) {
            root = insert(root, val[i]);
        }
        delete(root, 1);
        inOrder(root);
        
    }
}
