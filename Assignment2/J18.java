public class JoggingTime{
    public static void main(String[] args){
        int length = 50;
        int  breadth = 13;
        int rounds = 10;
        int speed = 2;
        int perimeter = 2 * (length + breadth);
        int totaldistance = perimeter * rounds;
        int seconds = totaldistance / speed;
        int minutes = (seconds / 60);
        System.out.println(" total distance jogged : " + totaldistance + " metres ");
        System.out.println(" Time Taken : " + minutes + " minutes and " + seconds + "seconds");
    }
}