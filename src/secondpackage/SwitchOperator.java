package secondpackage;
import java.util.Scanner;

public class SwitchOperator {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        String monthText;
        int month = 1;
        switch (month) {
            case 1:
                monthText = "january";
                break;
            case 2:
                monthText = "february";
                break;
            case 3:
                monthText = "march";
                break;
            case 4:
                monthText = "April";
                break;
            case 5:
                monthText = "May";
            case 6:
                monthText = "June";
                break;
            case 7:
                monthText = "July";
                break;
            case 8:
                monthText = "August";
                break;
            case 9:
                monthText = "September";
                break;
            case 10:
                monthText = "Oktober";
                break;
            case 11:
                monthText = "November";
                break;
            case 12:
                monthText = "December";
            default:
                System.out.println("Only 1 12");
                break;



        }



    }
}
