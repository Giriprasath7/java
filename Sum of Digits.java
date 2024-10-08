import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input integer from user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Calculate the sum of digits
        int sum = calculateSumOfDigits(number);

        // Output the result
        System.out.println("The sum of the digits of " + number + " is: " + sum);

        scanner.close();
    }

    // Method to calculate the sum of digits of an integer
    public static int calculateSumOfDigits(int num) {
        int sum = 0;
        
        // Convert negative numbers to positive
        num = Math.abs(num);

        while (num > 0) {
            sum += num % 10; // Add the last digit to the sum
            num /= 10; // Remove the last digit
        }

        return sum;
    }
}
