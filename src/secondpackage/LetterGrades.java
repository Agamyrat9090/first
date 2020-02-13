package secondpackage;

public class LetterGrades {
    public static void main(String[] args) {
        int grade = 60;

        if (grade<0) {
            System.out.println("Grade can not be less than 0 !");
        }
        else if (grade<50) {
            System.out.println();
        }
        else if (grade<70) {
            System.out.println("C");
        }
            else if (grade<90) {
                System.out.println("B");
    }
            else if (grade<101) {
            System.out.println("A+");
        }
            else {
            System.out.println("The grade can not larger than 100");

           }






        }
    }

