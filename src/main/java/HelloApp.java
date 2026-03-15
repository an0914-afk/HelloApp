/**
 * HelloApp.java – A simple Java application that extends the functionality of
 * HelloAppUC1 by accepting a user's name as a command-line argument and displaying
 * a personalized greeting.
 *
 * UC 1: Display "Hello World" – The application should display the message
 * "Hello World" to the console when executed.
 *
 * UC 2: Display User Name – The application should accept a user's name as
 * a command-line argument and display a personalized greeting.
 *
 * @author Aaditya Narayan
 * @version 1.0
 * @since UC1
 */

/**
 * Key Concepts of UC2:
 * 1. Command-line Arguments: Accessing user input via args[] parameter
 * 2. String Concatenation: Combining strings using the + operator
 * 3. System.out.println(): Output to console
 * 4. Array Indexing: Accessing the first argument with args[0]
 */

public class HelloApp {

    public static void main(String[] args) {
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            System.out.println("Hello, World!");
        }
    }
}