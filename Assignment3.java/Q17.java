import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input length and breadth from user
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        // Calculate area using the formula: Area = length × breadth
        double area = length * breadth;

        // Display the result
        System.out.println("Area of the rectangle is: " + area);

        scanner.close();
    }
}
