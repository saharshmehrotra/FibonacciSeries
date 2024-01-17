import java.io.*;
import java.util.*;

// Class to generate Fibonacci sequence and handle different input methods
public class Fibonacci {

    // Main method to start the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menu-driven loop
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Generate Fibonacci sequence");
            System.out.println("2. Use Scanner for input");
            System.out.println("3. Use BufferedReader for input");
            System.out.println("4. Use Console for input");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            // Switch statement to perform actions based on user choice
            switch (choice) {
                case 1:
                    generateFibonacci();
                    break;
                case 2:
                    inputUsingScanner();
                    break;
                case 3:
                    inputUsingBufferedReader();
                    break;
                case 4:
                    inputUsingConsole();
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    // Method to generate Fibonacci sequence based on user input
    public static void generateFibonacci() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the Fibonacci sequence:");
        int number = scanner.nextInt();

        System.out.println("Fibonacci sequence:");
        for (int i = 0; i < number; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }

    // Method to generate Fibonacci sequence using Scanner for input
    public static void inputUsingScanner() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the Fibonacci sequence:");
        int number = scanner.nextInt();

        System.out.println("Fibonacci sequence:");
        for (int i = 0; i < number; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }

    // Method to generate Fibonacci sequence using BufferedReader for input
    public static void inputUsingBufferedReader() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enter the number of elements in the Fibonacci sequence:");
            int number = Integer.parseInt(br.readLine());

            System.out.println("Fibonacci sequence:");
            for (int i = 0; i < number; i++) {
                System.out.print(fibonacci(i) + " ");
            }
            System.out.println();
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error reading input.");
        }
    }

    // Method to generate Fibonacci sequence using Console for input
    public static void inputUsingConsole() {
        Console console = System.console();

        if (console == null) {
            System.out.println("Console not available. Please run the program in a console environment.");
            return;
        }

        System.out.println("Enter the number of elements in the Fibonacci sequence:");
        int number = Integer.parseInt(console.readLine());

        System.out.println("Fibonacci sequence:");
        for (int i = 0; i < number; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }

    // Recursive method to calculate Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
