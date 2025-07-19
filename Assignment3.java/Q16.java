import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input radius from user
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate area using the formula: Area = π * r * r
        double area = Math.PI * radius * radius;

        // Display the result
        System.out.println("Area of the circle is: " + area);

        scanner.close();
    }
}
