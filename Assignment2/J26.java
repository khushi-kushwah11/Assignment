public class J26{
    public static void main(String[] args){
        double pathlength = 120;
        double pathwidth = 2.4;
          double bricklength = 0.2;
          double brickwidth = 0.1;
        double patharea = pathlength * pathwidth;
        double brickarea = bricklength * brickwidth;
        double noofbricks = patharea / brickarea;
        System.out.println("no of bricks are : " + noofbricks );
    }
}