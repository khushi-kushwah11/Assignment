public class J39{
    public static void main(String[] args){
        double diameter = 12;
        double height = 9;
        double pi = 3.1416;
        double radius = diameter / 2;
        double surfacearea = 2 * pi * radius * ( height + radius );
        System.out.println("total surface area of the cylinder is : "+surfacearea );
    }
}