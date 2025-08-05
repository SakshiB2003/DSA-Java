public class HeightOfTree {
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

    public static int height(Node root) {
        if(root == null) {
            return 0;
        }
        int leftH = height(root.left);
        int rightH = height(root.right);
        int treeHeight = Math.max(leftH, rightH) + 1;
        return treeHeight;
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        @SuppressWarnings({ "static-access", "unused" })
        Node root = tree.build(nodes);
        System.out.println(height(root));
    
    }
}
