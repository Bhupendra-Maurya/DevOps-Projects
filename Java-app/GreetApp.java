import java.util.Scanner;

public class GreetApp {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Print a greeting using the entered name
        System.out.println("Hello, " + name + "! Welcome to the Greeting App.");

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}

