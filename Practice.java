import java.util.*;
public class Practice {
 
    static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if(root == null) {
            root = new Node(val);
            return root;
        }
        else if(root.data > val) {
            root.left = insert(root.left, val);
        }
        else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
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

    //delete 
    public static Node delete(Node root, int val) {
        if(root == null) {
            System.out.println("Empty tree");
            return null;
        }
        if(root.data > val) {
            root.left = delete(root.left, val);
        }
        else if(root.data < val) {
            root.right = delete(root.right, val);
        }

        else { // root.data == null;
            // case 1
            if(root.left == null && root.right == null) {
                return null;
            }
            //case 2
            if(root.left == null) {
                return root.right;
            }
            else if(root.right == null) {
                return root.left;
            }

            Node Is = inorSucc(root.right);
            root.data = Is.data;
            root.right = delete(root.right, Is.data);
        }
        return root;
    }

    // inorder successor
    public static Node inorSucc(Node root) {
        while(root.left != null) {
            root = root.left;
        }
        return root;
    }

    // in range 
    public static void inR(Node root, int x, int y) {
        if(root == null) {
            return;
        }
        if(root.data >= x && root.data <= y) {
            inR(root.left, x, y);
            System.out.print(root.data + " ");
            inR(root.right, x, y);
        }
        else if(root.data >= y) {
            inR(root.left, x, y);
        }
        else {
            inR(root.right, x, y);
        }
    }

    public static void printPath(ArrayList<Integer> path) {
        for(int i=0; i<path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println();
    }

    public static void print(Node root, ArrayList<Integer> path) {
        if(root == null) {
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null) {
            printPath(path);
        }
        else {
            print(root.left, path);
            print(root.right, path);
        }
        path.remove(path.size()-1);
    }

    public static void main(String[] args) {
        int val[] = {5,4,3,9,6,1,2};
        Node root = null; 
        for(int i=0; i<val.length; i++) {
            root = insert(root, val[i]);
        }
        System.out.println(search(root, 1));
        delete(root, 1);
        inorder(root);
        System.out.println();
        inR(root, 1, 5);
        System.out.println();
        print(root, new ArrayList<>());
    }
}
