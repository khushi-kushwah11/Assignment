/*Take values of length and breadth of a rectangle from user and 
check if it is square or not.*/
import java.util.Scanner;
class Q1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("entre length : ");
        int l = sc.nextInt();
        System.out.print("enter breadth : ");
        int b = sc.nextInt();
        if(l==b)
        System.out.println("it is square  ");
        else
        System.out.println("not a square ");
    }
}