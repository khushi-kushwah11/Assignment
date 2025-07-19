public class TriangleBaseHeight{
    public static void main(String[] args){
        double area = 230;
        double baseratio = 8;
        double heightratio = 5;
        double x = Math.sqrt(area / (0.5 * baseratio * heightratio));
        double base = baseratio * x;
        double height = heightratio * x;
System.out.println("Base = " + base);
System.out.println("height = " + height);

    }
}