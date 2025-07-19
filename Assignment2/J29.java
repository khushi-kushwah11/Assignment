public class J29{
    public static void main(String[] args){
int floorlength = 800;
int floorwidth = 900;
int tileside = 10;
int floorarea = floorlength * floorwidth;
int tilearea = tileside * tileside;
int nooftiles = floorarea / tilearea;
System.out.println("no of tile required is : "+ nooftiles );
    }
}