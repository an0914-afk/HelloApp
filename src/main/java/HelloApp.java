/**
 * HelloApp.java – UC7 – A simple Java application that greets multiple users by name
 * if provided as command-line arguments using the String.join() method, or defaults
 * to greeting "World" if no names are provided.
 *
 * UC7: Display "Hello" with Multiple Command-Line Arguments using String.join() Method
 * or Default Message – The application should accept multiple names as command-line
 * arguments and display a personalized greeting using the String.join() method.
 * If no names are provided, it should display "Hello, World!".
 *
 * Usage: java HelloApp [name1] [name2] ... [nameN]
 * - If names are provided, it will display "Hello, Name1, Name2, ...!"
 * - If no names are provided, it will display "Hello, World!"
 *
 * @author Aaditya Narayan
 * @version 7.0
 * @since UC1
 */

/**
 * Key Concepts of UC7:
 * 1. String.join() Method: Concatenates multiple strings with a delimiter
 * 2. Command-line Arguments: Accessing user input via args[] parameter
 * 3. Conditional Statements: Using if to check whether arguments exist
 * 4. Default Values: Providing fallback greeting when no arguments are given
 * 5. Array Length Checking: Using args.length == 0 condition
 * 6. Static Utility Methods: Calling String.join() without object creation
 * 7. Code Simplification: Cleaner and shorter implementation without loops
 */

public class HelloApp {

    public static void main(String[] args) {

        // Assign default greeting target
        String names = "World";

        // If command-line arguments exist, join them using comma delimiter
        if (args.length > 0) {
            names = String.join(", ", args);
        }

        // Display greeting
        System.out.println("Hello, " + names + "!");
    }
}