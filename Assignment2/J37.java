public class J37{
    public static void main(String[] args){
      double volume = 1278;
      double radius = 10;
      double pi = 3.1416;
      double height = volume / ( pi * radius * radius );
      double surfacearea = 2 * pi * radius * ( height + radius );
      System.out.println("height of the cylinder is : "+ height );
      System.out.println("the surface area of the cylinder : "+surfacearea );
    }
}