public class StringBuffers {
    public static void main(String[] args) {

        // Create a StringBuffer
        StringBuffer sb = new StringBuffer("Hello, World!");
        
        // Print the original StringBuffer
        System.out.println("Original StringBuffer: " + sb);
        
        // Append to the StringBuffer
        sb.append(" Welcome to Java.");
        System.out.println("After Append: " + sb);
        
        // Insert into the StringBuffer
        sb.insert(13, " Beautiful");
        System.out.println("After Insert: " + sb);
        
        // Delete from the StringBuffer
        sb.delete(13, 23);
        System.out.println("After Delete: " + sb);
        
        // Reverse the StringBuffer
        sb.reverse();
        System.out.println("Reversed StringBuffer: " + sb);

        // Convert StringBuffer to String
        String str = sb.toString();

        //Difference between StringBuffer and StringBuilder is that StringBuffer is synchronized and thread-safe, while StringBuilder is not.

    }
}
    