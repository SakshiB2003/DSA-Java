public class ReverseRecursion {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // add
    public void add(int data) {
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    // recursive reverse
    public Node reverse(Node head) {
        if(head == null || head.next == null) {
            return head;
        } 
        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    // print 
    public void print() {
        if(head == null) {
            System.out.println("Linked list is empty!");
            return;
        }
        Node currNode = head;
        while(currNode != null) { 
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    // main
    public static void main(String[] args) {
        ReverseRecursion list = new ReverseRecursion();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.print();
        list.head = list.reverse(list.head);
        list.print();
    }
}
