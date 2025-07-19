public class Q19 {
    public static void main(String[] args) {
        int a = 30;
        int b = 40;

        System.out.println("Before swapping:");
        System.out.println("a = " + a + ", b = " + b);

        // Swapping without third variable
        a = a + b; // a = 70
        b = a - b; // b = 30
        a = a - b; // a = 40

        System.out.println("After swapping without third variable:");
        System.out.println("a = " + a + ", b = " + b);
    }
}
