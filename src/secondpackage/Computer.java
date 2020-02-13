package secondpackage;

import java.util.Scanner;
import java.util.Scanner;

public class Computer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("size ? (S?M/L):");
        String size = scanner.next();
        System.out.println("Member?(Y/N):");
        String member = scanner.next();

        if(member.equals("Y")){
            System.out.println("ok");
        }

        if(size.equals("S")) {
            System.out.println("$9.99");
        }
        else if(size.equals("M")) {
            System.out.println("10.99");
        }
        else if(size.compareToIgnoreCase("L")==0) {
            System.out.println("11.99");
        }
        else{
        System.out.println("Sorry only S/M/l");

        }

    }
}
