/**
 * HelloApp – UC6 – Display "Hello" with Multiple Command-Line Arguments using
 * substring to Remove Trailing Delimiter
 *
 * UC 6: Display "Hello" with Multiple Command-Line Arguments using substring to
 * Remove Trailing Delimiter – The application should accept multiple names as
 * command-line arguments and display a personalized greeting for each user using
 * substring to remove the trailing delimiter.
 *
 * Usage: java HelloApp [name1] [name2] ... [nameN]
 * – If names are provided, it will display "Hello, [Name1], [Name2], ...!" to the console.
 * – If no names are provided, it will display "Hello, World!"
 *
 * @author Aaditya Narayan
 * @version 6.0
 * @since UC1
 */

/**
 * Key Concepts for HelloApp UC6:
 *
 * 1. Enhanced For Loop:
 * A simplified syntax for iterating over arrays without needing an index variable.
 *
 * 2. StringBuilder:
 * A mutable sequence of characters used for efficient string concatenation.
 *
 * 3. String Manipulation:
 * Using methods like substring() to modify strings after construction.
 *
 * 4. Trailing Character Removal:
 * Removing unwanted delimiters (like ", ") from the end of a string.
 *
 * 5. String Length:
 * Using length() to determine where substring() should truncate the string.
 */

public class HelloApp {

    public static void main(String[] args) {

        String name;

        // Check if no arguments are provided
        if (args.length == 0) {

            name = "World";

        } else {

            // Build comma-separated list using enhanced for loop
            StringBuilder nameBuilder = new StringBuilder();

            for (String n : args) {
                nameBuilder.append(n).append(", ");
            }

            // Remove trailing comma and space using substring()
            name = nameBuilder.substring(0, nameBuilder.length() - 2);
        }

        // Display greeting message
        System.out.println("Hello, " + name + "!");
    }
}