public class J21{
    public static void main(String[] args){
        int bricklength = 15;
        int brickbreadth = 8;
        int brickheight = 5;
        int walllength = 15;
        int wallbreadth = 10;
        int wallheight = 8;
        int brickvolume = bricklength * brickbreadth * brickheight;
        int wallvolume = walllength * wallheight * wallbreadth;
        int noofbricks = wallvolume / brickvolume;
        System.out.println("THE NO OF BRICKS USED HERE IS : "+ noofbricks );
    }
}