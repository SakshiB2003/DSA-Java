// O(N*N)

public class DiameterOfTree1 {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree {
        static int idx = -1;
        public static Node build(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = build(nodes);
            newNode.right = build(nodes);
            return newNode;
        }
    }
    // for calculating the height of left and right subtree
    public static int height(Node root) {
        if(root == null) {
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    // diametere of tree
    public static int diameter(Node root) {
        if(root == null) {
            return 0;
        }
        int dia1 = diameter(root.left);
        int dia2 = diameter(root.right);
        int dia3 = height(root.left) + height(root.right) +1;
        return Math.max(dia3, Math.max(dia1, dia2));
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,3,4,-1,-1,5,-1,-1,-1,6,-1,7,8,-1,-1,-1};
        BinaryTree tree = new BinaryTree();
        @SuppressWarnings({ "static-access", "unused" })
        Node root = tree.build(nodes);
        System.out.println(diameter(root));
        
    }
}
