import java.util.*;

        //Linked Lists in Java Collections Framework (JCF)
        /*
        A linked list is a linear data structure where each element is a separate object.
        Each element (we will call it a node) of a list is comprising of two items - the data and a reference to the next node.
        The last node has a reference to null. The entry point into a linked list is called the head of the list.
        If the list is empty then the head is a null reference.
        A linked list is a dynamic data structure. It can grow and shrink at runtime by allocating and deallocating memory.
        In Java, LinkedList class is a part of java.util package.
        It implements the List and Deque interfaces. It can be used as a list, stack or queue.
        It maintains the insertion order and is not synchronized.
            
         */

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