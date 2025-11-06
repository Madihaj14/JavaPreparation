public class Code {

    // Simple Queue implementation using Linked List
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static class Queue {
        Node front, rear;
        int size;

        Queue() {
            front = rear = null;
            size = 0;
        }

        void enqueue(int data) {
            Node newNode = new Node(data);
            if (rear == null) {
                front = rear = newNode;
                size++;
                return;
            }
            rear.next = newNode;
            rear = newNode;
            size++;
        }

        int dequeue() {
            if (front == null) {
                System.out.println("Queue is empty");
                return -1;
            }
            int data = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            size--;
            return data;
        }

        int peek() {
            if (front == null) {
                System.out.println("Queue is empty");
                return -1;
            }
            return front.data;
        }

        boolean isEmpty() {
            return size == 0;
        }

        int size() {
            return size;
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front element is: " + queue.peek());
        System.out.println("Queue size is: " + queue.size());

        System.out.println(queue.dequeue() + " dequeued from queue");
        System.out.println("Front element is: " + queue.peek());
        System.out.println("Queue size is: " + queue.size());
    }

    
    
}
