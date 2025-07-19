import java.util.Scanner;

public class LowestOfFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input four numbers
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter third number: ");
        int c = scanner.nextInt();
        System.out.print("Enter fourth number: ");
        int d = scanner.nextInt();

        // Find the lowest number
        int min = a;

        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;

        System.out.println("Lowest number is: " + min);

        scanner.close();
    }
}
