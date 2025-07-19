public class J23{
    public static void main(String[] args){
int cubeside = 3;
int cartonlength = 15;
int cartinbreadth = 9;
int cartonheight = 12;
int cubevolume = cubeside * cubeside * cubeside;
int cartonvolume = cartinbreadth * cartonheight *cartonlength;
int noofcubes = cartonvolume / cubevolume;
System.out.println("The No of boxes that can be accomdated  : " + noofcubes );




    }
}