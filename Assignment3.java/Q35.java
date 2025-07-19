import java.util.Scanner;

public class TriangleValidity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three angles
        System.out.print("Enter angle 1: ");
        int angle1 = scanner.nextInt();

        System.out.print("Enter angle 2: ");
        int angle2 = scanner.nextInt();

        System.out.print("Enter angle 3: ");
        int angle3 = scanner.nextInt();

        // Check validity
        if (angle1 + angle2 + angle3 == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }

        scanner.close();
    }
}
