public class Notes {
    /*
    Errors and their types:
    1. Syntax Errors: These are errors in the code that violate the rules of the
         programming language. They are detected by the compiler during the compilation
         process. Example: Missing semicolon, misspelled keywords.
    2. Runtime Errors: These are errors that occur during the execution of the program.
         They are not detected by the compiler. Example: Division by zero, accessing
        an invalid array index.
    3. Logical Errors: These are errors in the logic of the program that lead to incorrect
         results. They do not cause the program to crash, but they produce unintended
         output. Example: Using the wrong formula for a calculation.


     Exception handling is a mechanism to handle runtime errors, so that the normal flow of the application can be maintained.
     In Java, we have five keywords to handle exceptions:
     1. try: The code that might throw an exception is placed inside the try block.
     2. catch: The catch block is used to handle the exception. It must be preceded by a try block. It will only be executed if an exception occurs in the try block.
     3. finally: The finally block is used to execute important code such as closing connection, stream etc. It is executed whether an exception is handled or not.
     4. throw: The throw keyword is used to explicitly throw an exception.
     5. throws: The throws keyword is used to declare exceptions that a method can throw. It is also called ducking the exception.

     Types of Exceptions:
     1. Checked Exceptions: These are exceptions that are checked at compile-time. Example: IOException, SQLException.
     2. Unchecked Exceptions: These are exceptions that are not checked at compile-time. Example: ArithmeticException, NullPointerException.

     Exception Hierarchy:
     - Throwable
         - Error (Serious problems that a reasonable application should not try to catch)
         - Exception
             - Checked Exceptions (e.g., IOException, SQLException)
             - Unchecked Exceptions (e.g., RuntimeException, ArithmeticException, NullPointerException)
    

     Example of Exception Handling:
     try {
         // code that may throw an exception
     } catch (ExceptionType1 e1) {
         // handle ExceptionType1
     } catch (ExceptionType2 e2) {
         // handle ExceptionType2
     } finally {
         // code that will always execute
     }

     Note: It is a good practice to catch specific exceptions rather than using a generic Exception class.
     */

    
}
