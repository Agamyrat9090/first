package secondpackage;
import java.util.Scanner;
public class Ageinform {
    public static void main(String[] args) {
        Scanner myScan =new  Scanner(System.in);
        System.out.print("Enter an age :");
        int age= myScan.nextInt();
        if(age<0) {
            System.out.println("Not negative numbers");
        }
        else if (age>120) {
        }
        else {
            System.out.println("OK");


        }


    }
}
