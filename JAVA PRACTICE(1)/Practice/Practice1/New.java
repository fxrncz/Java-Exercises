import java.util.Scanner;

public class New {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, num4, num5, sum;

        System.out.println("Enter 5 numbers");

        System.out.println("Enter your First number: ");
        num1 = sc.nextInt();

        System.out.println("Enter your Second number: ");
        num2 = sc.nextInt();

        System.out.println("Enter your Third number: ");
        num3 = sc.nextInt();

        System.out.println("Enter your Fourth number: ");
        num4 = sc.nextInt();

        System.out.println("Enter your Fifth number: ");
        num5 = sc.nextInt();

        sum = num1 + num2 + num3 + num4 + num5;
        double avrg = sum / 5;
        
        sc.close();
        System.out.println("The sum of your choise numbers is " + sum + " and the avrg is " + avrg + " when you divide it to 5." );


    }
}