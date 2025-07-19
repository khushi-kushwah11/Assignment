// Online Java Compiler
// Use this editor to write, compile and run your Java code online

/*. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended*/

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Total classes held: ");
        int total = sc.nextInt();

        System.out.print("Classes attended: ");
        int attended = sc.nextInt();

        if (total <= 0 || attended < 0 || attended > total) {
            System.out.println("Invalid input!");
        } else {
            double percent = attended * 100.0 / total;
            System.out.printf("Attendance: %.2f%%%n", percent);

            if (percent >= 75.0) {
                System.out.println("Eligible to sit for the exam.");
            } else {
                System.out.println("Not eligible (attendance < 75%).");
            }
        }

        sc.close();
    }
}
