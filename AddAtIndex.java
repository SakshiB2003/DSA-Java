public class AddAtIndex {
    Node head;
    private int size;
    AddAtIndex() {
        this.size = 0;
    }
    class Node {
        String data;
        Node next;
        Node(String data) {
            this.data = data;
            this.next = null;
            
        }
        
    }

    // addFirst 
    public void addFirst(String data) {
        Node newNode = new Node(data);
        
        if(head == null) {
            head = newNode;
            return;
        }
        size++;
        newNode.next = head;
        head = newNode;
        
        
    }

    // addLast
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
        size++;
    }

    // add at specific index
    public void addInMiddle(int idx, String data) {
        if(idx>size || idx<0) {
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
        // for iteration
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

    // delete First 
    public void deleteFirst() {
        if(head == null) {
            System.out.println("list is empty!");
            return;
        }
        head = head.next;
        size--;
    }
    
    // delete last 
    public void deleteLast() {
        if(head == null) {
            System.out.println("list is empty!");
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
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    
// for getting the size of linked list
    public int getSize() {
        return size;
    }

    // print
    public void print() {
        if(head == null) {
            System.out.println("List is empty!");
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
        AddAtIndex list = new AddAtIndex();
        list.addFirst("a");
        list.addLast("d");
        list.addFirst("c");
        list.print();
        
        list.addInMiddle(2, "h");

        list.print();
       

    }
}
