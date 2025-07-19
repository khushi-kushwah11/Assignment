/*.A 4 digit number is entered through keyboard. Write a program to print a new number with digits reversed as of orignal one. E.g.-
INPUT : 1234        OUTPUT : 4321
INPUT : 5982        OUTPUT : 2895 */
import java.util.Scanner;

class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a 4-digit number
        System.out.print("Enter a 4-digit number: ");
        int number = scanner.nextInt();

        // Check if the number is 4-digit
        if (number >= 1000 && number <= 9999) {
            int reversed = 0;

            while (number != 0) {
                int digit = number % 10;         // Get last digit
                reversed = reversed * 10 + digit; // Build reversed number
                number = number / 10;            // Remove last digit
            }

            System.out.println("Reversed Number: " + reversed);
        } else {
            System.out.println("Please enter a valid 4-digit number!");
        }

        scanner.close();
    }
}
