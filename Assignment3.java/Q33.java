import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sides of triangle
        System.out.print("Enter side A: ");
        int a = scanner.nextInt();

        System.out.print("Enter side B: ");
        int b = scanner.nextInt();

        System.out.print("Enter side C: ");
        int c = scanner.nextInt();

        // Check triangle type
        if (a == b && b == c) {
            System.out.println("Equilateral Triangle");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }

        scanner.close();
    }
}
