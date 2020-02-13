package secondpackage;
import java.util.Scanner;
public class Desingpurchasesystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("which model ? (X/Y) :");
        String model =scanner.next();
int MSRP=0;
        if (model.equals("X")) {
            MSRP = 30000;
            System.out.println("Do you want body package? (Y/N) : ");
            String body = scanner.next();
            if (body.equalsIgnoreCase("Y")) {
                System.out.println("Body pack 5000$ ? (Y/N) : ");
                String pack = scanner.next();
            }
        }
        else{
            System.out.println("Do you want sound system? : (Y/N)");
            String sound =scanner.next();

            if (sound.equalsIgnoreCase("Y")) {
                MSRP += 3000;

            }
            else if (model.equals("Y")){
                MSRP =3500;
        }
        else {
                System.out.println("Sorry have only X and Y");
            }
        }
    }
}
