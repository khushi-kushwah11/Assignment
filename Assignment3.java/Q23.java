import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is positive, negative or zero
        if (number > 0) {
            System.out.println(number + " is Positive.");
        } else if (number < 0) {
            System.out.println(number + " is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }

        scanner.close();
    }
}
