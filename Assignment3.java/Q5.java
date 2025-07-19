//take input of age 3 ppl by user and determine oldest and youngest among them

import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter 3 ages:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        // Oldest
        if (a >= b && a >= c)
            System.out.println("Oldest: " + a);
        else if (b >= a && b >= c)
            System.out.println("Oldest: " + b);
        else
            System.out.println("Oldest: " + c);

        // Youngest
        if (a <= b && a <= c)
            System.out.println("Youngest: " + a);
        else if (b <= a && b <= c)
            System.out.println("Youngest: " + b);
        else
            System.out.println("youngest "+ c );
}
}




