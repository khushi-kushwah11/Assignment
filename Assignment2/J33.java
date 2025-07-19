public class J33{
    public static void main(String[] args){
        int gardenlength  = 30;
        int gardenwidth = 20;
        int pathwidth = 3;
        int pathwidth2 = 4;
        int patharea = pathwidth * gardenlength;
        int patharea2 = pathwidth2 * gardenwidth;
        int overlaparea = pathwidth * pathwidth2;
        int totalunusualarea = patharea + patharea2 - overlaparea;
        System.out.println("total unusual area of the garden is : " + totalunusualarea );
    }
}