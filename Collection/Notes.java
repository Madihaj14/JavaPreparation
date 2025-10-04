public class Notes {

    /*
     * ===============================
     *   COLLECTION API OVERVIEW
     * ===============================
     *
     * Difference between Collection API, Collection, and Collections:
     *
     * 1. Collection API:
     *    - A framework that provides architecture to store and manipulate a group of objects.
     *
     * 2. Collection:
     *    - Root interface in the Collection API representing a group of objects.
     *
     * 3. Collections:
     *    - A utility class containing static methods to operate on collections.
     *    - Common operations: sorting, searching, shuffling, etc.
     *
     * Why Collection is an interface and Collections is a class?
     * - Collection is an interface → defines a contract (methods) but no implementation.
     * - Collections is a final utility class → provides concrete static methods.
     * - Collections has a private constructor → prevents instantiation.
     * - Works with all implementations of Collection (e.g., List, Set, Queue).
     */

    // ===============================
    // ARRAYLIST
    // ===============================
    /*
     * - Resizable array implementation of the List interface.
     * - Allows duplicates and maintains insertion order.
     * - Provides random access (get by index).
     * - Not synchronized (not thread-safe).
     * - Good for frequent read/access operations.
     * - Inefficient for insertions/deletions in the middle (shifting needed).
     * - Commonly used when dynamic resizing and quick access are required.
     */

    /*
    import java.util.ArrayList;
    public class ArrayListExample {
        public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Apple");
            list.add("Banana");
            list.add("Orange");

            System.out.println("Element at index 1: " + list.get(1));
            list.remove("Banana");

            System.out.println("Elements in the ArrayList:");
            for (String fruit : list) {
                System.out.println(fruit);
            }

            System.out.println("Size: " + list.size());
            System.out.println("Contains 'Apple': " + list.contains("Apple"));
        }
    }
    */

    // ===============================
    // HASHSET
    // ===============================
    /*
     * - Implements Set interface using a Hash Table.
     * - Does not allow duplicates.
     * - No order guarantee (unordered).
     * - Allows one null element.
     * - Constant-time performance for add, remove, and contains.
     * - Not synchronized (not thread-safe).
     * - Used when uniqueness of elements is required.
     */

    /*
    import java.util.HashSet;
    public class HashSetExample {
        public static void main(String[] args) {
            HashSet<String> set = new HashSet<>();
            set.add("Apple");
            set.add("Banana");
            set.add("Orange");
            set.add("Apple"); // Duplicate, ignored

            set.remove("Banana");

            System.out.println("Elements in HashSet:");
            for (String fruit : set) {
                System.out.println(fruit);
            }

            System.out.println("Size: " + set.size());
            System.out.println("Contains 'Apple': " + set.contains("Apple"));
        }
    }
    */

    // ===============================
    // LINKEDLIST
    // ===============================
    /*
     * - Implements List and Deque interfaces.
     * - Backed by a doubly-linked list.
     * - Allows duplicates and maintains insertion order.
     * - Efficient for frequent insertions/deletions (especially at ends).
     * - Slower than ArrayList for random access.
     * - Not synchronized (not thread-safe).
     */

    /*
    import java.util.LinkedList;
    public class LinkedListExample {
        public static void main(String[] args) {
            LinkedList<String> list = new LinkedList<>();
            list.add("Apple");
            list.add("Banana");
            list.add("Orange");

            System.out.println("Element at index 1: " + list.get(1));
            list.remove("Banana");

            System.out.println("Elements in LinkedList:");
            for (String fruit : list) {
                System.out.println(fruit);
            }

            System.out.println("Size: " + list.size());
            System.out.println("Contains 'Apple': " + list.contains("Apple"));
        }
    }
    */

    // ===============================
    // TREESET
    // ===============================
    /*
     * - Implements Set using a Red-Black tree.
     * - Does not allow duplicates.
     * - Maintains sorted order (ascending by default).
     * - No null elements allowed.
     * - log(n) time for add, remove, and contains.
     * - Not synchronized.
     * - Useful when unique elements must be sorted.
     */

    /*
    import java.util.TreeSet;
    public class TreeSetExample {
        public static void main(String[] args) {
            TreeSet<String> set = new TreeSet<>();
            set.add("Banana");
            set.add("Apple");
            set.add("Orange");

            set.remove("Banana");

            System.out.println("Elements in TreeSet:");
            for (String fruit : set) {
                System.out.println(fruit);
            }

            System.out.println("Size: " + set.size());
            System.out.println("Contains 'Apple': " + set.contains("Apple"));
        }
    }
    */

    // ===============================
    // MAPS
    // ===============================
    /*
     * - Represents key-value pairs (unique keys, duplicate values allowed).
     * - Not part of Collection interface, but in the Collections Framework.
     * - Implementations:
     *    HashMap     → unordered, allows one null key & multiple null values.
     *    LinkedHashMap → maintains insertion order.
     *    TreeMap     → maintains sorted order of keys, no null keys allowed.
     * - Provides efficient lookup based on keys.
     * - Used for dictionaries, lookup tables, etc.
     */

    /*
    import java.util.HashMap;
    public class MapExample {
        public static void main(String[] args) {
            HashMap<String, Integer> map = new HashMap<>();
            map.put("Apple", 1);
            map.put("Banana", 2);
            map.put("Orange", 3);

            System.out.println("Value for 'Banana': " + map.get("Banana"));
            map.remove("Banana");

            System.out.println("Key-Value pairs:");
            for (String key : map.keySet()) {
                System.out.println(key + ": " + map.get(key));
            }

            System.out.println("Size: " + map.size());
            System.out.println("Contains 'Apple': " + map.containsKey("Apple"));
        }
    }
    */

    // ===============================
    // HASHMAP vs HASHTABLE
    // ===============================
    /*
     * - HashMap:
     *   - Not synchronized (faster, but not thread-safe).
     *   - Allows one null key and multiple null values.
     *   - Part of Collections Framework.
     *
     * - Hashtable:
     *   - Synchronized (thread-safe, but slower).
     *   - No null keys or null values allowed.
     *   - Legacy class (before Collections Framework).
     *
     * - Both provide constant-time performance for basic operations.
     * - Both use hashing for storage, unordered.
     */



    /* 
     * Sorting Method in Java Collections:
     * - Collections.sort(List<T> list): Sorts the specified list into ascending order.
     * - Uses TimSort algorithm (a hybrid of Merge Sort and Insertion Sort).
     * - Time Complexity: O(n log n) on average.
     * - Can also sort using a custom Comparator:
     *  Collections.sort(List<T> list, Comparator<? super T> c)
     * - Example:
     *   Collections.sort(myList); // Natural order
     *  Collections.sort(myList, myComparator); // Custom order
     * 
     */

     //Example 
    import java.util.ArrayList;
    import java.util.Collections;
    public class SortingExample {
        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(5);
            list.add(2);
            list.add(8);
            list.add(1);

            // Sort in natural order
            Collections.sort(list);
            System.out.println("Sorted List: " + list);

            // Sort in reverse order using Comparator
            Collections.sort(list, Collections.reverseOrder());
            System.out.println("Reverse Sorted List: " + list);
        }
    }
    

    /*
     * Comparator vs Comparable in Java:
     * - Comparable:
     *  - Defines natural ordering of objects.
     * - Implemented by the class whose objects need to be compared.
     * - Method: compareTo(T o)
     * - Example: String, Integer implement Comparable.
     * - Comparator:
     * - Defines custom ordering of objects.
     * - Implemented in a separate class or as an anonymous class/lambda.
     * - Method: compare(T o1, T o2)
     * - Can be used to sort objects in different ways.
     * - Example: Collections.sort(list, new MyComparator());
     * - Use Comparable for default sorting, Comparator for custom sorting.
     */

    //For example:
    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.Comparator;
    class Person implements Comparable<Person> {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(Person other) {
            return this.name.compareTo(other.name); // Natural order by name
        }

        @Override
        public String toString() {
            return name + " (" + age + ")";
        }
    }
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        // Sort by natural order (name) using Comparable
        Collections.sort(people);
        System.out.println("Sorted by name (Comparable): " + people);

        // Sort by age using Comparator
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.age, p2.age); // Custom order by age
            }
        });
        System.out.println("Sorted by age (Comparator): " + people);
    }
    
    //Example using functional operators
    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.Comparator;
    public class ComparatorExample {
        public static void main(String[] args) {
            ArrayList<Person> people = new ArrayList<>();
            people.add(new Person("Alice", 30));
            people.add(new Person("Bob", 25));
            people.add(new Person("Charlie", 35));

            // Sort by age using Comparator with lambda expression
            Collections.sort(people, (p1, p2) -> Integer.compare(p1.age, p2.age));
            System.out.println("Sorted by age (Comparator with lambda): " + people);
        }
    }
    

}
