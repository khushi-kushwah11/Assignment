
import java.util.Scanner;
class Q2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter Quantiity");
        int q = sc.nextInt();
    
        int unit = 100;
        int totalcost = unit * q;
        if(totalcost > 1000){
        double result = totalcost * 0.10;
        System.out.println("discount is available" +result );
        }
        else
        System.out.println("discount not available : "+totalcost );






    }
}







