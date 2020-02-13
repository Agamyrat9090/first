package secondpackage;

import java.util.Scanner;

public class new1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("enter a number :");
        int temperature = myScanner.nextInt();

        if (temperature >30) {
            System.out.println(temperature + "  wear jacket");
        } else {
            System.out.println(temperature + " wear hat");
        }
    }
}