package secondpackage;

public class Widening {
    public static void main(String [] args){
        byte number1 = 99;
        int number2 = number1;
        int number3 = 55;
        number1 = (byte)number3;
        System.out.println(number1);

       double number5 =16.787;
       short shortnum = (short)number5;
       System.out.println(shortnum);



    }



}
