/*Modify the above question to allow student to sit if he/she has medical cause.
 Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.*/
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Total classes held: ");
        int total = sc.nextInt();

        System.out.print("Classes attended: ");
        int attended = sc.nextInt();
        System.out.println("you have your medical 1 for yes of 0 for no : ");
        int m = sc.nextInt();

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
        if(m==1) System.out.print("you are medically allow");

        sc.close();
    }
}














