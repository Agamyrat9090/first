package secondpackage;
import java.util.Scanner;
public class Customerbill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String customer = ("Ask he/she signed or not");
        System.out.println("Are you signed Y/N :");
        //ask usage
        String signed = scanner.nextLine();

        if (signed.equals("Yes")) {
            System.out.println("0-100 GB =10 USD");
        }
          if(signed.equals("No")) {
            System.out.println("0-100 GB=40 USD");
        }
                else {
              System.out.println("please subscribed");

        }


    }
}
