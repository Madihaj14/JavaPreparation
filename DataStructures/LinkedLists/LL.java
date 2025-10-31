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

// Example of detailed code for linked lists


class LL {
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