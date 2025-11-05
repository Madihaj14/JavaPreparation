import java.util.*;

        //Linked Lists in Java Collections Framework (JCF)
        /*
        1. A linked list is a linear data structure where each element is a separate object.
        2. Each element (we will call it a node) of a list is comprising of two items - the data and a reference to the next node.
        3. The last node has a reference to null. The entry point into a linked list is called the head of the list.
        4. If the list is empty then the head is a null reference.
        5. A linked list is a dynamic data structure. It can grow and shrink at runtime by allocating and deallocating memory.
        6. In Java, LinkedList class is a part of java.util package.
        7. It implements the List and Deque interfaces. It can be used as a list, stack or queue.
        8. It maintains the insertion order and is not synchronized.
        9. It allows null elements.
        10. The LinkedList class provides various methods to manipulate the size of the list and to access the elements.
        11. Some commonly used methods are:
            a. add(): to add an element to the list
            b. addFirst(): to add an element at the beginning of the list
            c. addLast(): to add an element at the end of the list
            d. get(): to get an element at a specific index
            e. remove(): to remove an element from the list
            f. removeFirst(): to remove the first element of the list
            g. removeLast(): to remove the last element of the list
            h. size(): to get the size of the list
         */

//Example usage of LinkedList using Java Collections Framework

public class LL {
   public static void main(String args[]) {
       LinkedList<String> list = new LinkedList<String>();
       list.add("is");
       list.add("a");
       list.addLast("list");
       list.addFirst("this");
       list.add(3, "linked");
       System.out.println(list);


       System.out.println(list.get(0));
       System.out.println(list.size());   
       list.remove(3);
       list.removeFirst();
       list.removeLast();
      
       System.out.println(list);
   }
}

//Example code to demonstrate LinkedList as a Queue
class LinkedListQueue { 
    public static void main(String args[]) {
        LinkedList<Integer> queue = new LinkedList<Integer>();

        // Enqueue elements
        queue.addLast(10);
        queue.addLast(20);
        queue.addLast(30);
        System.out.println("Queue after enqueuing elements: " + queue);

        // Dequeue elements
        int removedElement = queue.removeFirst();
        System.out.println("Dequeued element: " + removedElement);
        System.out.println("Queue after dequeuing an element: " + queue);

        // Peek at the front element
        int frontElement = queue.getFirst();
        System.out.println("Front element: " + frontElement);

        // Check if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);

        // Get the size of the queue
        int size = queue.size();
        System.out.println("Size of the queue: " + size);
    }
}

//Example code to demonstrate LinkedList as a Stack
class LinkedListStack {
    public static void main(String args[]) {
        LinkedList<Integer> stack = new LinkedList<Integer>();

        // Push elements onto the stack
        stack.addFirst(10);
        stack.addFirst(20);
        stack.addFirst(30);
        System.out.println("Stack after pushing elements: " + stack);

        // Pop elements from the stack
        int removedElement = stack.removeFirst();
        System.out.println("Popped element: " + removedElement);
        System.out.println("Stack after popping an element: " + stack);

        // Peek at the top element
        int topElement = stack.getFirst();
        System.out.println("Top element: " + topElement);

        // Check if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);

        // Get the size of the stack
        int size = stack.size();
        System.out.println("Size of the stack: " + size);
    }
}

//Example code to insert, insert at start, insert at a specific position, show and delete nodes in a singly linked list

class SinglyLinkedList {
    Node head; // head of list

    // Linked list Node
    static class Node {
        int data;
        Node next;

        // Constructor
        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Method to insert a new node at the end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    // Method to insert a new node at the start
    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to insert a new node at a specific position
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("The previous node is null.");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    // Method to delete a node by key
    public void deleteNode(int key) {
        Node temp = head, prev = null;

        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key) {
            head = temp.next; // Changed head
            return;
        }

        // Search for the key to be deleted
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in linked list
        if (temp == null) return;

        // Unlink the node from linked list
        prev.next = temp.next;
    }

    // Method to print the linked list
    public void show() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    // Main method to test the linked list operations
    public static void main(String args[]) {   
        SinglyLinkedList list = new SinglyLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        System.out.println("Linked List after inserting elements:");
        list.show();

        list.insertAtStart(5);
        System.out.println("Linked List after inserting 5 at start:");
        list.show();

        list.insertAtPosition(15, 2);
        System.out.println("Linked List after inserting 15 at position 2:");
        list.show();

        list.deleteNode(20);
        System.out.println("Linked List after deleting node with data 20:");
        list.show();
    }
}

