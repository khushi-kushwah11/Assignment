import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input percentage from user
        System.out.print("Enter your percentage: ");
        double percentage = scanner.nextDouble();

        // Determine grade based on percentage
        if (percentage > 90) {
            System.out.println("Grade: A");
        } else if (percentage > 80 && percentage <= 90) {
            System.out.println("Grade: B");
        } else if (percentage >= 60 && percentage <= 80) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }

        scanner.close();
    }
}
