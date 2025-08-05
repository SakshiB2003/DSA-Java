public class Serach {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }

    // Build bst
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

    // search
    public static boolean search(Node root, int key) {
        if(root == null) {
            return false;
        }

        if(root.data > key) {
            return search(root.left, key);
        }

        else if(root.data == key) {
            return true;
        }

        else {
            return search(root.right, key);
        }
    }

    // traversal
    public static void inOrder(Node root) {
        if(root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // main
    public static void main(String[] args) {
        int val[] = {6,1,8,4,7,3,2,9};
        Node root = null;
        for(int i=0; i<val.length; i++) {
            root = insert(root, val[i]);
        }
        inOrder(root);
        System.out.println();
        System.out.println(search(root, 4));

        // if(search(root, 88)) {
        //     System.out.println("found!!");
        // }
        // else {
        //     System.out.println("not found");
        // }
    }
}
