public class J24{
    public static void main(String[] args){
double bricklength = 0.25;
double brickwidth = 0.10;
double brickheight = 0.075;
double walllength = 20.0;
double wallheight = 2.0;
double wallthickness = 0.75;
double brickvolume = bricklength * brickwidth * brickheight;
double wallvolume = walllength * wallheight * wallthickness;
double costperthousand = 900;
double noofbricks = wallvolume / brickvolume;
double totalcost = (noofbricks / 1000) * costperthousand;
System.out.println("the total bricks need to bulit the wall is : " + totalcost );




    }
}