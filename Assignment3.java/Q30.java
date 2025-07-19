import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for user's choice
        System.out.print("Enter 'C' to convert Fahrenheit to Celsius or 'F' to convert Celsius to Fahrenheit: ");
        char choice = scanner.next().charAt(0);

        switch (Character.toLowerCase(choice)) {
            case 'c':
                System.out.print("Enter temperature in Fahrenheit: ");
                double f = scanner.nextDouble();
                double celsius = (f - 32) * 5 / 9;
                System.out.println("Temperature in Celsius: " + celsius);
                break;
            case 'f':
                System.out.print("Enter temperature in Celsius: ");
                double c = scanner.nextDouble();
                double fahrenheit = (c * 9 / 5) + 32;
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
