import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight, height, bmi, pounds, inch;

        System.out.println("Input a height: ");
        height = sc.nextDouble();

        System.out.println("Input a weight: ");
        weight = sc.nextDouble();

        inch = (height / 2.54);
        pounds = (weight / 1000);

        bmi = (pounds / inch * inch);

        System.out.println("Your BMI is " + bmi);

        sc.close();
       
    }
}
