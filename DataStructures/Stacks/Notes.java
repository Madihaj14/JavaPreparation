public class Notes {

    //Stacks in Java Collections Framework (JCF)
    /*
    1. A stack is a linear data structure that follows the Last In First Out (LIFO) principle.
    2. It is also called ADT (Abstract Data Type) because it defines a set of operations without specifying the implementation details.
    3. In a stack, the element that is added last is the one to be removed first.
    4. Java provides a built-in Stack class as part of the java.util package.
    5. The Stack class extends the Vector class and provides various methods to perform stack operations.
    6. Some commonly used methods of the Stack class are:
        a. push(): to add an element to the top of the stack
        b. pop(): to remove and return the top element of the stack
        c. peek(): to view the top element of the stack without removing it
        d. isEmpty(): to check if the stack is empty
        e. search(): to search for an element in the stack and return its position from the top
     */


    //Stack implementation in Java from scratch
    static class Stack<T> {
        private Node<T> top;

        private static class Node<T> {
            T data;
            Node<T> next;

            Node(T data) {
                this.data = data;
                this.next = null;
            }
        }

        // Push method to add an element to the top of the stack
        public void push(T data) {
            Node<T> newNode = new Node<>(data);
            newNode.next = top;
            top = newNode;
        }

        // Pop method to remove and return the top element of the stack
        public T pop() {
            if (isEmpty()) {
                throw new IllegalStateException("Stack is empty");
            }
            T data = top.data;
            top = top.next;
            return data;
        }

        // Peek method to view the top element without removing it
        public T peek() {
            if (isEmpty()) {
                throw new IllegalStateException("Stack is empty");
            }
            return top.data;
        }

        // Method to check if the stack is empty
        public boolean isEmpty() {
            return top == null;
        }

        // Search method to find the position of an element from the top of the stack
        public int search(T data) {
            Node<T> current = top;
            int position = 1;
            while (current != null) {
                if (current.data.equals(data)) {
                    return position;
                }
                current = current.next;
                position++;
            }
            return -1; // Element not found
        }
    }

    /*
    Example usage of Stack class is shown below.
     */
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Peek at the top element
        System.out.println("Top element is: " + stack.peek());

        // Pop elements from the stack
        System.out.println("Popped element is: " + stack.pop());

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Search for an element in the stack
        System.out.println("Position of 20 in stack is: " + stack.search(20));
    }

}
