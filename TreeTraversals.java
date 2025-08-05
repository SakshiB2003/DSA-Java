import java.util.*;
public class TreeTraversals {
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
// Build Binary Treee
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

    // preorder
    public static void pre(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data + " ");
        pre(root.left);
        pre(root.right);
    }

    // inorder
    public static void in(Node root) {
        if(root == null) {
            return;
        }
        in(root.left);
        System.out.print(root.data + " ");
        in(root.right);
    }

    // postorder
    public static void post(Node root) {
        if(root == null) {
            return;
        }
        post(root.left);
        post(root.right);
        System.out.print(root.data + " ");
    }

    // level order
    public static void level(Node root) {
        if(root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()) {
            Node curr = q.remove();
            if(curr == null) {
                System.out.println();
                if(q.isEmpty()) {
                    break;
                }
                else {
                    q.add(null);
                }
            }
            else {
                System.out.print(curr.data + " ");
                if(curr.left != null) {
                    q.add(curr.left);
                }
                if(curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }

    // main 
    public static void main(String[] args) {
        int nodes[] = {1,2,3,-1,4,-1,-1,5,-1,-1,6,-1,7,-1,8,-1,-1};
        BinaryTree tree = new BinaryTree();
        @SuppressWarnings({ "static-access", "unused" })
        Node root = tree.build(nodes);
        System.out.println("Pre order traversal: ");
        pre(root);
        System.out.println();
        System.out.println("In order traversal: ");
        in(root);
        System.out.println();
        System.out.println("Post order traversal: ");
        post(root);
        System.out.println();
        System.out.println("Level order traversal:");
        level(root);


    }

}
