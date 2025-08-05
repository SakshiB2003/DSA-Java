public class CircularQueueUsingArray {
    static class Queue {
        public static int size;
        static int arr[];
        static int front = -1;
        static int rear = -1;
        @SuppressWarnings("static-access")
        Queue(int size) {
            this.size = size;
            arr = new int[size];
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        // if array is full
        public static boolean isFull() {
            return (rear +1) % size == front;
        }

        // enqueue
        public static void add(int data) {
            if(isFull()) {
                return;
            }
            // first element
            if(front == -1) {
                front = 0;
            }
            rear = (rear +1)% size;
            arr[rear] = data;
        }

        // dequeue
        public static int remove() {
            if(isEmpty()) {
                return -1;
            }
            int result = arr[front];
            if(front == rear) {
                front = rear = -1;
            }
            else {
                front = (front + 1)%size;
            }
            return result;
        }

        // peek
        public static int peek() {
            if(isEmpty()) {
                return -1;
            }
            return arr[front];
        }
    }
    @SuppressWarnings("static-access")

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println("delete " + q.remove());
        q.add(6);
        System.out.println("delete " + q.remove());
       q.add(7);
        while(!q.isEmpty()) {
        System.out.println( q.peek());
        q.remove();

        }
    }
}
