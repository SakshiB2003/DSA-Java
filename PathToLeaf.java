import java.util.*;
public class PathToLeaf {
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

    public static void inOrder(Node root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void print(ArrayList<Integer> path) {
        for(int i=0; i<path.size(); i++) {
            System.out.print(path.get(i) + " -> ");

        }
        System.out.println();
    }

    public static void printRoot(Node root, ArrayList<Integer> path) {
        if(root == null) {
            return;
        }
        path.add(root.data);
        //leaf 
        if(root.left == null && root.right == null) {
            print(path);
        }
        else {
            printRoot(root.left, path);
            printRoot(root.right, path);
        }
        path.remove(path.size()-1);
    }

    public static void main(String[] args) {
        int val[] = {5,3,4,1,7,6,9,10};
        Node root = null;
        for(int i=0; i<val.length; i++) {
            root = insert(root, val[i]);
        }
        inOrder(root);
        System.out.println();
        printRoot(root, new ArrayList<>());
        
    }
}
