/*
Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).*/
import java.util.Scanner;
class Q9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a letter : ");
        char ch = Scanner.next().charAt(0);
        if(ch>='a' && ch<= 'z'){
            System.out.println("the letter is in lower case");
        }
        else if(ch>='A' && ch<= 'Z'){
            System.out.println("the letter is in upper case");
        }
        else{
            System.out.println("Not A Character Litral");
        }
    }
}