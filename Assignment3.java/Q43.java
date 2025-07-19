import java.util.Scanner;

public class ChoiceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter your choice ('+' for addition, '>' for greater, '==' for equality): ");
        String choice = sc.next();

        switch (choice) {
            case "+":
                System.out.println("Addition = " + (num1 + num2));
                break;
            case ">":
                if (num1 > num2)
                    System.out.println(num1 + " is greater");
                else if (num2 > num1)
                    System.out.println(num2 + " is greater");
                else
                    System.out.println("Both numbers are equal");
                break;
            case "==":
                if (num1 == num2)
                    System.out.println("Both numbers are equal");
                else
                    System.out.println("Numbers are not equal");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
