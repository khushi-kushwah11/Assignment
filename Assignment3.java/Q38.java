import java.util.Scanner;

public class CurrencyNoteCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input total amount
        System.out.print("Enter the total amount: ");
        int amount = scanner.nextInt();

        // Array of currency notes in India
        int[] notes = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        System.out.println("Currency Note Breakdown:");
        for (int note : notes) {
            int count = amount / note;
            if (count > 0) {
                System.out.println(note + " x " + count + " = " + (note * count));
            }
            amount %= note;
        }

        scanner.close();
    }
}
