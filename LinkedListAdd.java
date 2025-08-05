// add First and Last;

public class LinkedListAdd {

    Node head;
    class Node {
        String data;
        Node next;
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // add first
    public void addfirst(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add last 
    public void addLast(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // for printing the list 
    public void printList() {
        if(head == null) {
            System.out.println("Linked list is empty!");
            return;
        }
        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        LinkedListAdd list = new LinkedListAdd();
        list.addfirst("a");
        list.addfirst("is");
        list.printList();
        list.addLast("list");
        list.addfirst("This");
        list.printList();
    }
}

