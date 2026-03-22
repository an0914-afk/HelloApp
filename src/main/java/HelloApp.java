/**
 * HelloApp.java – A simple Java application that greets the user by name if
 * provided as a command-line argument, or defaults to greeting "World" if no name
 * is given. This use case demonstrates how to handle optional command-line
 * arguments and provide default values in Java.
 *
 * UC 1: Display "Hello World" – The application should display the message
 * "Hello World" to the console when executed.
 *
 * UC 2: Display User Name – The application should accept a user's name as
 * a command-line argument and display a personalized greeting.
 *
 * UC 3: Provide Default Value – The application should display a default greeting
 * if no name is provided as a command-line argument.
 *
 * Usage: java HelloApp [name]
 * – If a name is provided, it will display "Hello, [Name]!"
 * – If no name is provided, it will display "Hello, World!"
 *
 * @author Aaditya Narayan
 * @version 3.0
 * @since UC3
 */

/**
 * Key Concepts:
 *
 * 1. Default Values:
 * Providing a fallback value when no input is given.
 *
 * 2. Command-line Arguments:
 * Accessing user input via args[] parameter.
 *
 * 3. Conditional Statements:
 * Using conditions to check argument availability.
 *
 * 4. Boolean Logic:
 * Using logical expressions to control execution flow.
 *
 * 5. Array Length Checking:
 * Checking args.length before accessing args[0] prevents runtime errors.
 *
 * 6. Ternary Operator:
 * A concise way to assign values based on a condition.
 */

public class HelloApp {

    public static void main(String[] args) {

        // Default name handling using ternary operator
        String name = (args.length > 0) ? args[0] : "World";

        // Display greeting message
        System.out.println("Hello, " + name + "!");
    }
}