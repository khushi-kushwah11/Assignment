import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number between 1 to 5
        System.out.print("Enter a number between 1 and 5: ");
        int number = scanner.nextInt();

        // Convert number to word
        switch (number) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 5.");
        }

        scanner.close();
    }
}
