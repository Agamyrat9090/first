package secondpackage;
import java.util.Scanner;
public class CirclePerimeterInput{
     public static void main(String[] args) {
         Scanner myScan = new Scanner(System.in);
         System.out.print("Please enter the radius:");
         float radius;
         radius = myScan.nextFloat();
         System.out.println("The perimeter of this circle is: " +(2*3.14*radius));
         System.out.format("Perimeter with 3 fractional part: %.3f",2*3.14*radius );


     }







}
