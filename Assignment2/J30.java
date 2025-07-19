public class J30{
    public static void main(String[] args){
double roomlength = 200;
double roomwidth = 400;
double roomlengthcm = roomlength * 100;
double roomwidthcm = roomwidth * 100;
double tilelength = 5;
double tilewidth = 8;
double floorarea = roomlengthcm * roomwidthcm;
double tilearea = tilelength * tilewidth;
double nooftiles = floorarea / tilearea;
System.out.println("the ans is : " + nooftiles );




    }
}