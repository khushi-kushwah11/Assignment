import java.util.Scanner;

public class StudentPercentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for 5 subjects
        System.out.print("Enter marks of Subject 1: ");
        int sub1 = scanner.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        int sub2 = scanner.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        int sub3 = scanner.nextInt();

        System.out.print("Enter marks of Subject 4: ");
        int sub4 = scanner.nextInt();

        System.out.print("Enter marks of Subject 5: ");
        int sub5 = scanner.nextInt();
        int totalMarks = sub1 + sub2 + sub3 + sub4 + sub5;
        double percentage = (totalMarks / 500.0) * 100;
        System.out.println("Total Marks = " + totalMarks);
