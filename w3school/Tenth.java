import java.util.Scanner;

public class Tenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, num3;

        System.out.println("Put a number and we will print the greatest you will pick");
        System.out.println();
        System.out.println("First number: ");
        num1 = sc.nextInt();

        System.out.println("Second number: ");
        num2 = sc.nextInt();

        System.out.println("Third number: ");
        num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3 ) {
            System.out.println("The greatest is " + num1);
        } if ( num2 > num1 && num2 > num3 ) {
            System.out.println("The greatest is " + num2);
        } if ( num3 > num1 && num3 > num2) {
            System.out.println("The greatest is " + num3);
        }
        sc.close();
    }
}
