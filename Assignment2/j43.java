class Que43{
    public static void main(String args[]){
        int height=4,Slant_height=5;
        int polishing_rate=10;
        double radius;
        radius=Math.sqrt(Slant_height*Slant_height-height*height);
        double area;
        area=(22*radius*radius)/7;
        System.out.println("Area of base of cone="+area+"cm\u00B2");
        double cost=area*polishing_rate;
        System.out.println("Cost of polishing="+cost+"cm\u00B2");
    }
}