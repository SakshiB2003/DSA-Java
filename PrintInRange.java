public class PrintInRange {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }

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

    public static void in(Node root) {
        if(root == null) {
            return;
        }
        in(root.left);
        System.out.print(root.data + " ");
        in(root.right);
    }

    // Range 
    public static void inRange(Node root, int x, int y) {
        if(root == null) {
            return;
        }
        else if(root.data >= x && root.data <= y) {
            inRange(root.left, x, y);
            System.out.print(root.data + " ");
            inRange(root.right, x, y);
        }
        else if(root.data >= y) {
            inRange(root.left, x, y);
        }
        else {
            inRange(root.right, x, y);
        }
    }

    public static void main(String[] args) {
        int val[] = {6,3,2,4,7,8,5,1};
        Node root = null;
        for(int i=0; i<val.length; i++){
            root = insert(root, val[i]);
        }
        in(root);
        System.out.println();
        inRange(root, 4, 6);
    }
}
