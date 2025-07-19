import java.util.Scanner;

public class RoadTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the cost price of the bike
        System.out.print("Enter the cost price of the bike (in Rs): ");
        double costPrice = scanner.nextDouble();
        double tax;

        // Calculate tax based on cost price
        if (costPrice > 100000) {
            tax = costPrice * 0.15;
        } else if (costPrice > 50000 && costPrice <= 100000) {
            tax = costPrice * 0.10;
        } else {
            tax = costPrice * 0.05;
        }

        // Display the tax to be paid
        System.out.println("Road Tax to be paid: Rs " + tax);

        scanner.close();
    }
}
