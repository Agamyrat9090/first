package secondpackage;
import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("enter a number :");
        int number = myScanner.nextInt();

        if (number % 2== 0){
            System.out.println(number + " is even number");
        }
        else{
            System.out.println(number + "odd number");
        }
    }
}
