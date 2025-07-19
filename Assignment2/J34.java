public class J34{
    public static void main(String[] args){
        double base = 128;
        double base2 = 92;
        double height = 40;
        double walkwaywidth = 4;
        double trapezoidarea = 0.5 * (base + base2) * height;
        double walkwayarea = walkwaywidth * height;
        double usablewoodenarea = trapezoidarea - walkwayarea;
        System.out.println("total area is : " +trapezoidarea );
        System.out.println("area of walkway is : "+walkwayarea );
        System.out.println("usable wooden area : " + usablewoodenarea );




    }
}