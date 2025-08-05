// O(N)

public class DiameterOfTree2 {
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

    // Treeinfo class for storing info of height 
    static class TreeInfo {
        int ht;
        int dm;
        TreeInfo(int ht, int dm) {
            this.ht = ht;
            this.dm = dm;
        }
    }

    public static TreeInfo diameter(Node root) {
        if(root == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo leftTree = diameter(root.left);
        TreeInfo rightTree = diameter(root.right);

        int treeHeight = Math.max(leftTree.ht, rightTree.ht) + 1;

        int dia1 = leftTree.dm;
        int dia2 = rightTree.dm;
        int dia3 = leftTree.ht + rightTree.ht + 1;

        int treeDiameter = Math.max(Math.max(dia1, dia2), dia3);

        TreeInfo myInfo = new TreeInfo(treeHeight, treeDiameter);
        return myInfo;
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,3,4,-1,-1,5,-1,-1,-1,6,-1,7,8,-1,-1,-1};
        BinaryTree tree = new BinaryTree();
        @SuppressWarnings({ "static-access" })
        Node root = tree.build(nodes);
        System.out.println(diameter(root).dm);
    }
}
