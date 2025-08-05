public class DeleteFirstAndLast {
    Node head;
    class Node {
        String data;
        Node next;
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // add at first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add at last 
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

    // delete first element
    public void deleteFirst() {
        if(head == null) {
            System.out.println("list is empty!!");
            return;
        }
        head = head.next;
    }

    // delete last 
    public void deleteLast() {
        if(head == null) {
            System.out.println("list is empty!");
            return;
        }
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

    // print
    public void print() {
        if(head == null) {
            System.out.println("list is empty!!");
            return;
        }
        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // main function
    public static void main(String[] args) {
        DeleteFirstAndLast list = new DeleteFirstAndLast();
        list.addFirst("Sakshi");
        list.addLast("Bajpai");
        list.addFirst("girl");
        list.addLast("is");
        list.addLast("Dumbasss!!!");
        list.addFirst("Stupid");
        list.print();
        list.deleteFirst();
        list.deleteLast();
        list.addLast("Genius");
        list.print();
    }
}
