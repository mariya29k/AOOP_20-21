package zad1;

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("1. Convert F to C\n2.Convert C to F\nChoose an option\n");
        int choice = input.nextInt();

        if (choice == 1) {
            convertFahrenheitToCelsius(input);
        } else if (choice == 2) {
            convertCelsiusToFahrenheit(input);
        }

        // %f -> float, double
        // %d -> int, long
        // %b -> boolean
        // %s -> String, Object
        // %c -> char



    }

    private static void convertFahrenheitToCelsius(Scanner input) {
        System.out.print("Enter Fahrenheit: ");
        double fahrenheitInput = input.nextDouble();
        double celsius = 5.0 / 9.0 * (fahrenheitInput - 32);
        System.out.printf("Celsius: %.2f\n", celsius);
    }

    private static void convertCelsiusToFahrenheit(Scanner input) {
        System.out.print("Enter Fahrenheit: ");
        double fahrenheitInput = input.nextDouble();
        double celsius = 5.0 / 9.0 * (fahrenheitInput - 32);
        System.out.printf("Celsius: %.2f\n", celsius);
    }
}
