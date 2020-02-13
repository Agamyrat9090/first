package secondpackage;
import java.util.Scanner;
public class sample {
    public static void main(String[] args) {
        Scanner myScanner =new  Scanner(System.in);
        System.out.println("Please enter a year:");
        int year = myScanner.nextInt();
        if(year>2020){
            System.out.println("After Great year");
        }
        else{
            System.out.println("Before Golden year");
        }
    }
}
