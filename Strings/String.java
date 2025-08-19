public class String {

    public static void main(String[] args) {
        // Create a string (it is a class and not a data type that is why we write it in capital letters)
        String str = "Hello, World!";
        
        // Print the original string
        System.out.println("Original String: " + str);
        
        // Convert to uppercase
        String upperStr = str.toUpperCase();
        System.out.println("Uppercase String: " + upperStr);
        
        // Convert to lowercase
        String lowerStr = str.toLowerCase();
        System.out.println("Lowercase String: " + lowerStr);
        
        // Find the length of the string
        int length = str.length();
        System.out.println("Length of String: " + length);
        
        // Check if the string contains a substring
        boolean containsWorld = str.contains("World");
        System.out.println("Contains 'World': " + containsWorld);
        
        // Replace a substring
        String replacedStr = str.replace("World", "Java");
        System.out.println("Replaced String: " + replacedStr);
    }

}
