public class AllFunction {
    Node head;
    private int size;
    AllFunction() {
        this.size = 0;
    }
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public int getSize() {
        return size;
    }
    // add first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }
    // add middle or at any specific value
    public void addMiddle(int idx, int data) {
        if(idx > size || idx < 0) {
            System.out.println("Invalid Index");
            return;
        }
        size++;
        Node newNode = new Node(data);
        if(head == null || idx == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node currNode = head;
        for(int i=1; i<size; i++) {
            if(i == idx) {
                Node nextNode = currNode.next;
                currNode.next = newNode;
                newNode.next = nextNode;
                break;
            }
            currNode = currNode.next;
        }
    }
    // add last
    public void addLast(int data) {
        Node newNode = new Node(data);
        if( head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        size++;
    }
    // delete first
    public void deleteFirst() {
        if(head == null) {
            System.out.println("empty!");
            return;
        }
        size--;
        head = head.next;
    } 
    // delete last
    public void deleteLast() {
        if(head == null) {
            System.out.println("empty");
            return;
        }
        size--;
        if(head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null) {
            secondLast = secondLast.next;
            lastNode = lastNode.next;
         }
         secondLast.next = null;
    }
    // reverse using recursion 
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
            System.out.println("empty!");
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
        AllFunction l = new AllFunction();
        l.addFirst(1);
        l.addLast(3);
        l.addFirst(5);
        l.print();
        l.addMiddle(1, 7);
        l.print();
    }
}
