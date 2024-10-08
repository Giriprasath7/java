import java.util.Scanner;

public class FibonacciGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of Fibonacci numbers to generate
        System.out.print("Enter an integer n to generate the first n Fibonacci numbers: ");
        int n = scanner.nextInt();

        // Validate the input
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Generate and print the Fibonacci sequence
            generateFibonacci(n);
        }

        scanner.close();
    }

    // Method to generate and print the first n Fibonacci numbers
    public static void generateFibonacci(int n) {
        long first = 0, second = 1;

        System.out.print("The first " + n + " Fibonacci numbers are: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            // Calculate the next Fibonacci number
            long next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}
