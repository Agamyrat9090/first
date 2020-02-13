package secondpackage;
import java.util.Scanner;

public class nestd {
    public static void main(String[] args) {
        Scanner myScanner= new Scanner(System.in);
        System.out.println("Please enter the start code : ");
        int startcode = myScanner.nextInt();
        for(int i=0; i<5; i++) {
            System.out.println("Hello ");
        }
        Scanner myScann= new Scanner(System.in);
        System.out.println("please enter end code : ");
        int endcode = myScanner.nextInt();
        for(int j=0; j<=6; j++) {
            System.out.println(" Word");
        }

    }
}
