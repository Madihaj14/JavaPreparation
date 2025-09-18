public class Notes {
    // Taking Input in Java
    // 1. Using Scanner Class: The Scanner class is used to get user input in Java.
    - Scanner scanner = new Scanner(System.in);
    - scanner.close();
    /* Example:
    import java.util.Scanner;
         public class InputExample {
             public static void main(String[] args) {
                 Scanner scanner = new Scanner(System.in);
                 System.out.print("Enter your name: ");
                 String name = scanner.nextLine();
                 System.out.print("Enter your age: ");
                 int age = scanner.nextInt();
                 System.out.println("Hello " + name + ", you are " + age + " years old.");
                 scanner.close();
             
        }
    }
    */
    // Note: Always close the scanner object to prevent resource leaks.

    // 2. Using BufferedReader Class: The BufferedReader class can also be used to take input.
    /* Example:
    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;       
    public class InputExample {
          public static void main(String[] args) throws IOException {
              BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
              System.out.print("Enter your name: ");
              String name = reader.readLine();
              System.out.print("Enter your age: ");
              int age = Integer.parseInt(reader.readLine());
              System.out.println("Hello " + name + ", you are " + age + " years old.");
          }
      }
    */
    // Note: Always close the reader object to prevent resource leaks.
    // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    // reader.close();

    // 3. Using Console Class: The Console class provides methods to read input from the console.
    /* Example:
    import java.io.Console;
    public class InputExample {
        public static void main(String[] args) {
            Console console = System.console();
            if (console != null) {
                String name = console.readLine("Enter your name: ");
                String ageStr = console.readLine("Enter your age: ");
                int age = Integer.parseInt(ageStr);
                System.out.println("Hello " + name + ", you are " + age + " years old.");
            } else {
                System.out.println("No console available");
            }
        }
    }
    */

    // Note: Always close the console object to prevent resource leaks.
    // Console console = System.console();
    // console.close();

    // 4. Using Command Line Arguments: You can pass arguments to the main method when running the program.
    /* Example:
    public class InputExample {
        public static void main(String[] args) {
            if (args.length > 0) {
                String name = args[0];
                int age = Integer.parseInt(args[1]);
                System.out.println("Hello " + name + ", you are " + age + " years old.");
            } else {
                System.out.println("No command line arguments provided.");
            }
        }
    }
    */

    

    // 5. Using JOptionPane (for GUI applications): The JOptionPane class can be used to take input through dialog boxes.
    /* Example:
    import javax.swing.JOptionPane; 
    public class InputExample {
        public static void main(String[] args) {
            String name = JOptionPane.showInputDialog("Enter your name:");
            String ageStr = JOptionPane.showInputDialog("Enter your age:");
            int age = Integer.parseInt(ageStr);
            JOptionPane.showMessageDialog(null, "Hello " + name + ", you are " + age + " years old.");
        }
    }
    */

    // Note: JOptionPane does not require closing as it is managed by the Swing framework.
    // JOptionPane.showInputDialog();
    // JOptionPane.showMessageDialog();


}
