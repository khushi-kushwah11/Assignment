import java.util.Scanner;
class Q10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the year : ");
        int year = sc.nextInt();
        if(year % 4==0 && year %100 != 0) || (year % 400 == 0){
            System.out.println("it is the leap year ");
        }
        else 
        System.out.println("its not an leap year ");
    }
}