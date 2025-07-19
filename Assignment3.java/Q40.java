import java.util.Scanner;

public class Q40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int phy, chem, bio, math, comp;
        
        System.out.print("Enter marks in Physics: ");
        phy = sc.nextInt();
        System.out.print("Enter marks in Chemistry: ");
        chem = sc.nextInt();
        System.out.print("Enter marks in Biology: ");
        bio = sc.nextInt();
        System.out.print("Enter marks in Mathematics: ");
        math = sc.nextInt();
        System.out.print("Enter marks in Computer: ");
        comp = sc.nextInt();

        int total = phy + chem + bio + math + comp;
        double percentage = (total / 500.0) * 100;

        System.out.println("Percentage = " + percentage + "%");

        if (percentage >= 90) {
            System.out.println("Grade A");
        } else if (percentage >= 80) {
            System.out.println("Grade B");
        } else if (percentage >= 70) {
            System.out.println("Grade C");
        } else if (percentage >= 60) {
            System.out.println("Grade D");
        } else if (percentage >= 40) {
            System.out.println("Grade E");
        } else {
            System.out.println("Grade F");
        }
    }
}
