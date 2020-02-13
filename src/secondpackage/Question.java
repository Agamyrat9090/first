package secondpackage;
import java.util.Scanner;
public class Question {
    public static void main(String[] args) {
        int Number = 11;
        Scanner myScanner = new Scanner(System.in);
        int userNumber = 0;
        while (userNumber != Number) {
            System.out.println("User number :");
            userNumber = myScanner.nextInt();


            if (Number > userNumber) {
                System.out.println("Number is larger");

            } else if (Number < userNumber) {
                System.out.println("Number is smaller");

            }
            else {
                System.out.println("Congrats");


            }
        }

    }
}

