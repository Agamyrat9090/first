package secondpackage;

import java.util.Scanner;

public class Homework {
    public static void  main(String [] args){
        Scanner myScan = new Scanner(System.in);
        double item123 = 2.49;
        double item124 = 4.79;
        double  item125 =1.65;
        double  item126 =7.88;
        double  item127 =0.99;
        System.out.println("Customer reciept");
        System.out.println("Item id \t quantity \t price");
        System.out.format( "123 \t\t\t1 \t\t$%.2f\n",item123 );
        System.out.format( "125 \t\t\t2\t\t$%.2f\n",2*item125 );
        System.out.format("Total:\t\t\t3 \t\t$%.2f",item123+(2*item125));

    }
}
