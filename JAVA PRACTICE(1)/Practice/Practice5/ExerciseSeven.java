import java.util.Scanner;

public class ExerciseSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, sum, pro, diff, avrg, dist;
        boolean max, min;

        System.out.println("Test Data");
        System.out.println();

        System.out.println("Input first integer: ");
        num1 = sc.nextDouble();

        System.out.println("Input second integer: ");
        num2 = sc.nextDouble();

        sum = num1 + num2;
        pro = num1 * num2;
        diff = num1 - num2;
        avrg = sum / 2;
        dist = num1 - num2;
        max = (num1 > num2 && num2 > num1);
        min = (num1 < num2 && num2 < num2);

        System.out.println("The sum of two integers is " + sum);
        System.out.println("The difference of two integers is " + diff);
        System.out.println("The product of two integers is " + pro);
        System.out.println("The avrg is " + avrg);
        System.out.println("The distance is " + dist);

        if (max) {
            System.out.println("The max is " + max);
        }

        if (min) {
            System.out.println("The min is " + min);
        }
        sc.close();
    }
}
