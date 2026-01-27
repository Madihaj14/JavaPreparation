public class ArrayList {

    // Declare an array to store elements
    private int[] elements;
    private int size;

    // Constructor
    public ArrayList() {
        elements = new int[10]; // Initial capacity
        size = 0;
    }

    // Method to add an element
    public void add(int element) {
        if (size == elements.length) {
            // Resize the array if needed
            int[] newArray = new int[elements.length * 2];
            System.arraycopy(elements, 0, newArray, 0, elements.length);
            elements = newArray;
        }
        elements[size++] = element;
    }

    // Method to get an element
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return elements[index];
    }

    // Method to get the size
    public int size() {
        return size;
    }

    // Main method
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        // Add elements to the ArrayList
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        // Print the elements of the ArrayList
        System.out.println("ArrayList elements:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    
}
