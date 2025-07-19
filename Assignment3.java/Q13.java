import java.util.Random;
import java.util.Scanner;
 class Q13{

    public static String getDayName(int day) {
        return switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day range";
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number (for testing please enter 3): ");
        int input = scanner.nextInt();
        System.out.println("You entered: " + input);

        Random rand = new Random();
        int randomDay = rand.nextInt(7) + 1;  // random between 1 and 7
        System.out.println("Random day number: " + randomDay);

        String weekday = getDayName(randomDay);
        System.out.println("Weekday: " + weekday);

        scanner.close();
    }
}
