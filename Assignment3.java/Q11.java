import java.util.Scanner;

class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume the leftover newline

        System.out.print("Enter your sex (M/F): ");
        String s = sc.nextLine();

        System.out.print("Enter your marital status (Y/N): ");
        String m = sc.nextLine();

        if (s.equalsIgnoreCase("f")) {
            System.out.println("You are only eligible to work in urban areas.");
        } else if (s.equalsIgnoreCase("m")) {
            if (age >= 20 && age <= 40) {
                System.out.println("You are eligible to work anywhere.");
            } else if (age > 40 && age <= 60) {
                System.out.println("You are only eligible to work in urban areas.");
            } else {
                System.out.println("ERROR: Invalid age for male.");
            }
        } else {
            System.out.println("ERROR: Invalid sex input.");
        }
    }
}
