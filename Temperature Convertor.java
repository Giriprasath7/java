import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display conversion options
        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose an option (1 or 2): ");
        int option = scanner.nextInt();

        // Variable to hold the temperature input
        double temperature;
        
        switch (option) {
            case 1:
                // Convert Celsius to Fahrenheit
                System.out.print("Enter temperature in Celsius: ");
                temperature = scanner.nextDouble();
                double fahrenheit = celsiusToFahrenheit(temperature);
                System.out.println(temperature + " Celsius is " + fahrenheit + " Fahrenheit.");
                break;
            case 2:
                // Convert Fahrenheit to Celsius
                System.out.print("Enter temperature in Fahrenheit: ");
                temperature = scanner.nextDouble();
                double celsius = fahrenheitToCelsius(temperature);
                System.out.println(temperature + " Fahrenheit is " + celsius + " Celsius.");
                break;
            default:
                System.out.println("Invalid option. Please choose 1 or 2.");
                break;
        }

        scanner.close();
    }

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
